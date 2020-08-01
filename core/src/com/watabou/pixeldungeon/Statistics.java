/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.watabou.pixeldungeon;


import com.watabou.utils.Bundle;
import com.watabou.utils.Random;

import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileWriter;

import com.watabou.pixeldungeon.actors.blobs.SacrificialFire;
import com.watabou.pixeldungeon.actors.mobs.npcs.Blacksmith;
import com.watabou.pixeldungeon.actors.mobs.npcs.Ghost;
import com.watabou.pixeldungeon.actors.mobs.npcs.Imp;
import com.watabou.pixeldungeon.actors.mobs.npcs.Wandmaker;
import com.watabou.pixeldungeon.items.Generator;
import com.watabou.pixeldungeon.items.Generator.Category;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.Weightstone;
import com.watabou.pixeldungeon.items.keys.IronKey;
import com.watabou.pixeldungeon.items.scrolls.ScrollOfEnchantment;
import com.watabou.pixeldungeon.items.scrolls.ScrollOfMagicMapping;
import com.watabou.pixeldungeon.items.scrolls.ScrollOfUpgrade;
import com.watabou.pixeldungeon.levels.Level;
import com.watabou.pixeldungeon.levels.RegularLevel;
import com.watabou.pixeldungeon.levels.Room;
import com.watabou.pixeldungeon.RandomForestClassifier;

public class Statistics {
	
	public static int goldCollected;
	public static int deepestFloor;
	public static int enemiesSlain;
	public static int foodEaten;
	public static int potionsCooked;
	public static int piranhasKilled;
	public static int nightHunt;
	public static int ankhsUsed;
	
	public static float duration;
	
	public static boolean qualifiedForNoKilling = false;
	public static boolean completedWithNoKilling = false;
	
	public static boolean amuletObtained = false;

	public static FloorStatistics floorStats = new FloorStatistics();	
	
	public static LevelParameters newLevelParameters = new LevelParameters();

	public static void reset() {
		
		goldCollected	= 0;
		deepestFloor	= 0;
		enemiesSlain	= 0;
		foodEaten		= 0;
		potionsCooked	= 0;
		piranhasKilled	= 0;
		nightHunt		= 0;	
		ankhsUsed		= 0;
		
		duration	= 0;
		
		qualifiedForNoKilling = false;
		
		amuletObtained = false;
		
		floorStats.init();
		newLevelParameters. init();
		
		generateLogFile();
		
	}
	
	private static final String GOLD		= "score";
	private static final String DEEPEST		= "maxDepth";
	private static final String SLAIN		= "enemiesSlain";
	private static final String FOOD		= "foodEaten";
	private static final String ALCHEMY		= "potionsCooked";
	private static final String PIRANHAS	= "priranhas";
	private static final String NIGHT		= "nightHunt";
	private static final String ANKHS		= "ankhsUsed";
	private static final String DURATION	= "duration";
	private static final String AMULET		= "amuletObtained";
	
	public static void updateStats() {
		newLevelParameters.update();
		floorStats.reset();			
		SacrificialFire.scrollSpawned = 0;
	}
	
	public static void storeInBundle( Bundle bundle ) {
		bundle.put( GOLD,		goldCollected );
		bundle.put( DEEPEST,	deepestFloor );
		bundle.put( SLAIN,		enemiesSlain );
		bundle.put( FOOD,		foodEaten );
		bundle.put( ALCHEMY,	potionsCooked );
		bundle.put( PIRANHAS,	piranhasKilled );
		bundle.put( NIGHT,		nightHunt );
		bundle.put( ANKHS,		ankhsUsed );
		bundle.put( DURATION,	duration );
		bundle.put( AMULET,		amuletObtained );
	}
	
	
	public static void restoreFromBundle( Bundle bundle ) {
		goldCollected	= bundle.getInt( GOLD );
		deepestFloor	= bundle.getInt( DEEPEST );
		enemiesSlain	= bundle.getInt( SLAIN );
		foodEaten		= bundle.getInt( FOOD );
		potionsCooked	= bundle.getInt( ALCHEMY );
		piranhasKilled	= bundle.getInt( PIRANHAS );
		nightHunt		= bundle.getInt( NIGHT );
		ankhsUsed		= bundle.getInt( ANKHS );
		duration		= bundle.getFloat( DURATION );
		amuletObtained	= bundle.getBoolean( AMULET );
	}
	

	public static void generateLogFile() {		
		
		try(FileWriter fw = new FileWriter("GameLog_Parameters.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("levelHeight,levelWidth,additionalSpecialRoom,additionalHiddenDoor,"
						+ "minRoomSize,maxRoomSize,levelSizeLeftovers,additionalTraps,additionalMobs,"
						+ "additionalHigherLevelMobs,higherFloor,Gameplay,ExplorationRating,ChallengeRating");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Challenge.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("Floor,Level,Strength,"
						+ "AttackSkill,DefenseSkill,MobSlain,MobSpawned,AttackCount,"
						+ "sneakAttackCount,WandUsed,ThrowindWeaponUsed,"
						+ "ScrollUsed,PotionUsed,PotionThrown,DamageReceived,"
						+ "DeathInFloor,Armor,WeaponDamage,BrokenItem,TrapCount,turnSpentLowHP,turnSpentHighHP");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Exploration.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println(""
						+ "Floor,LevelWidth,LevelHeight,explorableTilesCount,"
						+ "unexploredTilesRatio,floorDuration,roomCount,SpecialRoomCount,HiddenDoorCount,"
						+ "SearchDone,FoundSomething,FoundSomethingRandomly,RoomSizeMin,RoomSizeMax,"
						+ "keySpawned,keyUsed,QuestSpawned,QuestCleared,WellSpawned,Wellused,"
						+ "ItemTransmuted,PotionCooked,BarricadeBurned");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Challenge_Ratio.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("Floor,Level,Strength,"
						+ "AttackSkill,DefenseSkill,MobSlain,MobSpawned,Attack/Mob,"
						+ "sneakAttack/mob,Wand/Mob,ThrowindWeapon/Mob,"
						+ "ScrollUsed,PotionUsed,PotionThrown,DamageReceived,"
						+ "DeathInFloor,Armor,WeaponDamage,BrokenItem,TrapCount,%turnSpentLowHP,%turnSpentHighHP");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Exploration_Ratio.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println(""
						+ "Floor,LevelWidth,LevelHeight,explorableTilesCount,"
						+ "unexploredTilesRatio,floorDuration,roomCount,SpecialRoomCount,HiddenDoorCount,"
						+ "SearchDone,FoundSomething,FoundSomethingRandomly,RoomSizeMin,RoomSizeMax,"
						+ "SpecialFeaturesClearedRatio");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public static void updateLogFile() {
		
		floorStats.deepestFloor = deepestFloor;		
		
			
		try(FileWriter fw = new FileWriter("GameLog_Parameters.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			String sentence = newLevelParameters.levelHeigth  + "," + newLevelParameters.levelWidth + "," + 
					newLevelParameters.additionalSpecialRoom  + "," + newLevelParameters.additionalHiddenDoor + "," + 
					newLevelParameters.minRoomSize  + "," + newLevelParameters.maxRoomSize + "," + 
					newLevelParameters.levelSizeLeftovers  + "," + newLevelParameters.additionalTraps + "," + 
					newLevelParameters.additionalMobs  + "," + newLevelParameters.additionalHigherLevelMobs + "," + 
					newLevelParameters.higherFloor + "," + newLevelParameters.predictedGameplay + "," + 
					newLevelParameters.predictedExplorationRating + "," + newLevelParameters.predictedChallengeRating;
			    out.println(sentence);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Challenge.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = floorStats.deepestFloor  + "," +
						floorStats.level + "," + floorStats.strength + "," + 
						floorStats.heroAttackSkill   + "," + 
						floorStats.heroDefenseSkill + "," + floorStats.mobSlain + "," + 
						floorStats.mobSpawned  + "," + 
						floorStats.attackCount  + "," + floorStats.sneakAttackCount + "," + 
						floorStats.wandUsed  + "," + floorStats.throwingWeaponUsed + "," + 
						floorStats.scrollUsed + "," + 
						floorStats.potionDrank  + "," + floorStats.potionThrown + "," + 
						floorStats.damageReceived  + "," + floorStats.deathInFloor + "," + 
						floorStats.highestArmorResistance  + "," + floorStats.highestAverageWeaponDamage + "," + 
						floorStats.brokenItem  + "," + floorStats.trapCount + "," + 
						floorStats.turnSpentLowHP  + "," + floorStats.turnSpentHighHP;
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try(FileWriter fw = new FileWriter("GameLog_Exploration.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = floorStats.deepestFloor + "," + floorStats.dungeonWidth + "," + 
						floorStats.dungeonHeight  + "," + floorStats.explorableTilesCount + "," + 
						floorStats.unexploredTilesRatio  + "," + floorStats.floorDuration + "," + 
						floorStats.roomCount  + "," + floorStats.specialRoomCount + "," + 
						floorStats.hiddenDoorCount  + "," + floorStats.searchDone + "," + 
						floorStats.foundSomething  + "," + 
						floorStats.foundSomethingRandomly  + "," + floorStats.roomSizeMin + "," + 
						floorStats.roomSizeMax  + "," + floorStats.keySpawned + "," + 
						floorStats.keyUsed  + "," + floorStats.questSpawned + "," + 
						floorStats.questCompleted  + "," + floorStats.wellSpawned + "," + 
						floorStats.wellUSed  + "," + floorStats.itemTransmuted + "," + 
						floorStats.potionCooked  + "," + floorStats.barricadeBurned;
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try(FileWriter fw = new FileWriter("GameLog_Challenge_Ratio.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = floorStats.deepestFloor  + "," +
						floorStats.level + "," + floorStats.strength + "," + 
						floorStats.heroAttackSkill   + "," + 
						floorStats.heroDefenseSkill + "," + floorStats.mobSlain + "," + 
						floorStats.mobSpawned  + "," + 
						(100 * floorStats.attackCount / floorStats.mobSlain) + "," + 
						(100 * floorStats.sneakAttackCount / floorStats.mobSlain) + "," + 
						(100 * floorStats.wandUsed / floorStats.mobSlain) + "," + 
						(100 * floorStats.throwingWeaponUsed / floorStats.mobSlain) + "," + 
						floorStats.scrollUsed + "," + 
						floorStats.potionDrank  + "," + floorStats.potionThrown + "," + 
						floorStats.damageReceived  + "," + floorStats.deathInFloor + "," + 
						floorStats.highestArmorResistance  + "," + floorStats.highestAverageWeaponDamage + "," + 
						floorStats.brokenItem  + "," + floorStats.trapCount + "," +
						(100 * floorStats.turnSpentLowHP / floorStats.floorDuration)  + "," + 
						(100 * floorStats.turnSpentHighHP / floorStats.floorDuration);
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try(FileWriter fw = new FileWriter("GameLog_Exploration_Ratio.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = floorStats.deepestFloor + "," + floorStats.dungeonWidth + "," + 
						floorStats.dungeonHeight  + "," + floorStats.explorableTilesCount + "," + 
						floorStats.unexploredTilesRatio  + "," + floorStats.floorDuration + "," + 
						floorStats.roomCount  + "," + floorStats.specialRoomCount + "," + 
						floorStats.hiddenDoorCount  + "," + floorStats.searchDone + "," + 
						floorStats.foundSomething  + "," + 
						floorStats.foundSomethingRandomly  + "," + floorStats.roomSizeMin + "," + 
						floorStats.roomSizeMax  + "," + 
						(100 * (floorStats.keyUsed + floorStats.wellUSed + floorStats.questCompleted) / 
								(floorStats.keySpawned + floorStats.wellSpawned + floorStats.questSpawned));
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		try(FileWriter fw = new FileWriter("label_exploration.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = "1";
				if(floorStats.unexploredTilesRatio <= 5) {
					sentence = "2";
				}
				else if(floorStats.unexploredTilesRatio <= 15) {
					sentence = "1";
				}
				else {
					sentence = "0";
				}
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("label_Gameplay.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = "0";
				if(floorStats.wandUsed >= 2 && 
						floorStats.wandUsed > 2 * floorStats.throwingWeaponUsed / 3 &&
						floorStats.wandUsed > 2 * floorStats.sneakAttackCount / 3) {
					sentence = "2";
				}
				else if(floorStats.throwingWeaponUsed >= 4 &&
						floorStats.throwingWeaponUsed >= floorStats.sneakAttackCount ) {
					sentence = "1";
				}
				else if(floorStats.sneakAttackCount >= 3 ) {
					sentence = "3";
				}
				else {
					sentence = "0";
				}
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileWriter fw = new FileWriter("label_challenge.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = "1";
				if(floorStats.turnSpentLowHP >= 50 ) {
					sentence = "0";
				}
				else if(floorStats.deathInFloor >= 0) {
					sentence = "0";
				}
				else if (floorStats.turnSpentHighHP > 250 || floorStats.turnSpentHighHP > 2 * floorStats.floorDuration / 3){
					sentence = "2";
				}
			    out.println(sentence);
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void updateStatsTilesMapped() {
		
		int unexploredCount = 0;
		int explorableTiles = 0;
		int length = Level.LENGTH;
		boolean[] mapped = Dungeon.level.mapped;
		boolean[] discoverable = Level.discoverable;

		
		for (int i=0; i < length; i++) {
			
			if (discoverable[i] == true) {
				explorableTiles ++;
				boolean visible = Dungeon.level.visited[i] || Dungeon.level.mapped[i];
				
				if (!visible) {				
					unexploredCount ++;
				}
			}
		}

		floorStats.unexploredTilesRatio = (int)(100 *unexploredCount / explorableTiles);
		floorStats.explorableTilesCount = explorableTiles;
		floorStats.currentFloor = Dungeon.depth;
	}
	
	public static class FloorStatistics {

		// Content
		public int keySpawned;
		public int keyUsed;
		public int questSpawned;
		public int questCompleted;
		public int itemTransmuted;
		public int potionCooked;
		public int barricadeBurned;
		public int wellSpawned;
		public int wellUSed;
		// map
		public int specialRoomCount;
		public int hiddenDoorCount;
		public int hiddenDoorFound;
		public int trapCount;
		public int dungeonWidth;
		public int dungeonHeight;
		public int dungeonLength;
		public int roomCount;
		public int distanceFromEntranceToExit;
		public int floorDuration;
		public int unexploredTilesRatio; // May be hard to implement
		public int explorableTilesCount;
		public int roomSizeMin;
		public int roomSizeMax;
		
		// Used items
		public int seedUsed;
		public int scrollUsed;
		public int potionThrown;
		public int potionDrank;
		public int throwingWeaponUsed;
		public int wandUsed;
		public int foodUsed;		
		// Resource scarcity
		public int damageFromHunger;
		public int brokenItem;
		public int spawnedItemCount;
		// Equipped gear
		public int highestArmorResistance;
		public int highestAverageWeaponDamage;
		// Combat
		public int turnSpentLowHP;
		public int turnSpentHighHP;
		public int mobSlain;
		public int mobSpawned;
		public int damageReceived;
		public int deathInFloor;
		// Stats
		public int deepestFloor;
		public int currentFloor;
		public int goldCollected;
		public int level;
		public int strength;
		public String heroClass;
		public static int maxHP;
		public int heroAttackSkill;
		public int heroDefenseSkill;
		// Actions 
		public int searchDone;
		public int foundSomething;
		public int foundSomethingRandomly;
		public int attackCount;
		public int sneakAttackCount;

		public void init() {

			// Content
			keySpawned = 0;
			keyUsed = 0;
			questSpawned = 0;
			questCompleted = 0;
			itemTransmuted = 0;
			potionCooked = 0;
			barricadeBurned = 0;
			wellSpawned = 0;
			wellUSed = 0;
			
			// map
			specialRoomCount = 0;
			hiddenDoorCount = 0;
			hiddenDoorFound = 0;
			trapCount = 0;
			dungeonWidth = 0;
			dungeonHeight = 0;
			dungeonLength = 0;
			roomCount = 0;
			distanceFromEntranceToExit = 0;
			floorDuration = 0;
			unexploredTilesRatio = 0; 
			explorableTilesCount = 0;
			roomSizeMin = 0;
			roomSizeMax = 0;
			
			// Used items
			seedUsed = 0;
			scrollUsed = 0;
			potionThrown = 0;
			potionDrank = 0;
			throwingWeaponUsed = 0;
			wandUsed = 0;
			foodUsed = 0;	
			
			// Resource scarcity
			damageFromHunger = 0;
			brokenItem = 0;
			spawnedItemCount = 0;
			
			// Equipped gear
			highestArmorResistance = 0;
			highestAverageWeaponDamage = 0;
			
			// Challenge
			turnSpentLowHP = 0;
			turnSpentHighHP = 0;
			mobSlain = 0;
			mobSpawned = 0;
			damageReceived = 0;
			deathInFloor = 0;
			
			// status
			deepestFloor = 0;
			currentFloor = 0;
			goldCollected = 0;
			level = 0;
			strength = 0;
			if(heroClass ==  null) {
				heroClass = "Unknown";
			}
			maxHP = 0;
			heroAttackSkill = 0;
			heroDefenseSkill = 0;
			
			// Actions 
			searchDone = 0;
			foundSomething = 0;
			foundSomethingRandomly = 0;
			attackCount = 0;
			sneakAttackCount = 0;

		}

		public void reset() {

			// Content
			keySpawned = 0;
			keyUsed = 0;
			questSpawned = 0;
			questCompleted = 0;
			itemTransmuted = 0;
			potionCooked = 0;
			barricadeBurned = 0;
			wellSpawned = 0;
			wellUSed = 0;
			
			// map
			specialRoomCount = 0;
			hiddenDoorCount = 0;
			hiddenDoorFound = 0;
			trapCount = 0;
			dungeonWidth = 0;
			dungeonHeight = 0;
			dungeonLength = 0;
			roomCount = 0;
			distanceFromEntranceToExit = 0;
			floorDuration = 0;
			unexploredTilesRatio = 0; 
			explorableTilesCount = 0;
			roomSizeMin = 0;
			roomSizeMax = 0;
			
			// Used items
			seedUsed = 0;
			scrollUsed = 0;
			potionThrown = 0;
			potionDrank = 0;
			throwingWeaponUsed = 0;
			wandUsed = 0;
			foodUsed = 0;	
			
			// Resource scarcity
			damageFromHunger = 0;
			brokenItem = 0;
			spawnedItemCount = 0;
			// Equipped gear
			
			// No need to reset these stats
			
			// Challenge
			turnSpentLowHP = 0;
			turnSpentHighHP = 0;
			mobSlain = 0;
			mobSpawned = 0;
			damageReceived = 0;
			deathInFloor = 0;
			
			// status			
			goldCollected = 0;
			
			// Actions 
			searchDone = 0;
			foundSomething = 0;
			foundSomethingRandomly = 0;
			attackCount = 0;
			sneakAttackCount = 0;

		}
	}

	public static class LevelParameters {
		// Depth, Width, levelWidth, levelHeight, minSpecialRoomCount, hiddenDoor, additionalTraps, roomMinSize, roomMaxSize
		
		// Data mining variables 
		public int predictedExplorationRating;
		public int predictedChallengeRating;
		public int predictedGameplay;
				
		// Level generation
		public int levelHeigth;
		public int levelWidth;
		public int additionalSpecialRoom;
		public int additionalHiddenDoor;
		public int minRoomSize;
		public int maxRoomSize;
		public float levelSizeLeftovers;
		
		// Challenge
		public int additionalTraps;
		public int additionalMobs;
		public int additionalHigherLevelMobs;
		public int higherFloor;
		
		// Items
		public ArrayList<Item> additionalItemToSpawn = new ArrayList<Item>();
		
		public void init() {
			
			// Machine learning variables
			predictedExplorationRating = 0;
			predictedChallengeRating = 0;
			predictedGameplay = 0;
			
			// Map variables
			levelHeigth = 32;
			levelWidth = 32;
			additionalSpecialRoom = 0;
			additionalHiddenDoor = 0;
			additionalTraps = 0;
			additionalMobs = 0;
			levelSizeLeftovers = 0;
			
			// Challenge variables
			additionalTraps = 0;
			additionalMobs = 0;
			additionalHigherLevelMobs = 0;
			higherFloor = 0;
			
		}
		
		public void startParameters(String className) {
			if(className == "rogue") {
				minRoomSize = 6;
				maxRoomSize = 8;
				predictedExplorationRating = 2;
				predictedGameplay = 3;				
			}
			else if(className == "mage") {
				minRoomSize = 7;
				maxRoomSize = 10;
				predictedExplorationRating = 0;
				predictedGameplay = 2;
				additionalItemToSpawn.add(Generator.random( Generator.Category.WAND ) );
			}
			else if(className == "huntress") {
				minRoomSize = 7;
				maxRoomSize = 10;
				predictedExplorationRating = 2;
				predictedGameplay = 1;
			}
			else {
				minRoomSize = 7;
				maxRoomSize = 9;
				predictedExplorationRating = 0;
				predictedGameplay = 0;
			}
			
			try {
				getGameplayItem();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void generateItems() throws Exception {
			getAdditionalFood();
			getGameplayItem();
			if(predictedChallengeRating >= 2) {
				getMostNeededItem();
			}
			
		}
		
		public void getAdditionalFood() {
			// The game is balanced around 1 food per level, the original size being 32x32 = 1024.
			// This function spawn additional food items based on the current level size,
			// and keep track of any excess should the increase not be enough to spawn a new one .
			
			levelSizeLeftovers += ( ((levelHeigth * levelWidth) - 1024) / 1024); 
			levelSizeLeftovers += additionalMobs / 300;
			
			if(levelSizeLeftovers >= 1) {
				while(levelSizeLeftovers >= 1) {
					additionalItemToSpawn.add(Generator.random( Generator.Category.FOOD ) );
					levelSizeLeftovers --;
				}
			}
		}
		
		public void getMostNeededItem() throws Exception {
			Item itemToAdd;
			
			if(Dungeon.depth < 5 && floorStats.highestArmorResistance < 4) 
			{
				itemToAdd = Generator.randomArmor();
			}
			
			// Makes it more likely to get a repair/upgrade item the higher the challenge rating (capped at 5)
			else if(Random.Int(5) - predictedChallengeRating <= 0) 
			{
				int randomUpgrade = Random.Int( 3 );
				
				if(predictedGameplay == 2) 
				{
					itemToAdd = new ScrollOfUpgrade();
					Dungeon.scrollsOfUpgrade ++;
				}
				else if(randomUpgrade == 0) 
				{
					itemToAdd = new ScrollOfUpgrade();
					Dungeon.scrollsOfUpgrade ++;
				}
				else if (randomUpgrade == 1) 
				{
					itemToAdd =  new ScrollOfEnchantment();
					Dungeon.scrollsOfEnchantment ++;
				}
				else 
				{
				itemToAdd = new Weightstone();
				}
			}
			
			else 
			{
				itemToAdd = Generator.random();
			}
			
			additionalItemToSpawn.add(itemToAdd);	
		}
		
		public void getGameplayItem() throws Exception {
			Item itemToAdd;
			
			if(predictedGameplay == 1) {
				itemToAdd = Generator.randomThrowingWeapon();
				for(int i = 0; i < (predictedChallengeRating / 5); i++) {
					additionalItemToSpawn.add(Generator.randomThrowingWeapon());
				}
				
			}
			else if (predictedGameplay == 2) {
				itemToAdd = (Random.Int( 3 ) == 0) ? 
						Generator.random( Category.WAND ) : Generator.random( Category.SCROLL );
			}
			else {
				itemToAdd = Generator.random();
			}
			
			additionalItemToSpawn.add(itemToAdd);
		}
		
		public void update() {

			predictedExplorationRating += getExploration();
			predictedChallengeRating += getChallenge();
			predictedGameplay = getGameplay();
			
			if(predictedExplorationRating > 10) {
				predictedExplorationRating = 10;
			}
			if(predictedExplorationRating < -5) {
				predictedExplorationRating = -5;
			}
			
			if(predictedChallengeRating > 10) {
				predictedChallengeRating = 10;
			}
			if(predictedChallengeRating < -5) {
				predictedChallengeRating = -5;
			}
			
			updateMapParameters();
			updateChallengeParameters();	
			
		}
		
		public int getGameplay() {
			// Run the RF Classifier functions for Gameplay.
			// 0 for melee, 1 for range, 2 for magic, 3 for stealth
			// The gameplay in output will influence the item generation and the map layout to a certain degree.
			
			double[] inputGameplay = {floorStats.deepestFloor,floorStats.level,
					floorStats.strength,floorStats.heroAttackSkill,floorStats.heroDefenseSkill,
			        floorStats.mobSlain,floorStats.mobSpawned,floorStats.attackCount,
			        floorStats.sneakAttackCount,floorStats.wandUsed,floorStats.throwingWeaponUsed, floorStats.scrollUsed,
			        floorStats.potionDrank,floorStats.potionThrown,floorStats.damageReceived,floorStats.deathInFloor,
			        floorStats.highestArmorResistance,floorStats.highestAverageWeaponDamage,floorStats.brokenItem,floorStats.trapCount, 
			        floorStats.turnSpentLowHP,floorStats.turnSpentHighHP};
			
			int ratingGameplay = 0;
			
			try {
				ratingGameplay = RandomForestClassifier.GameplayClassifier.predict(inputGameplay);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return ratingGameplay;
		}
		
		public int getChallenge() {
			// Run the RF Classifier functions for Challenge.
			// The labels used are 0 (too challenging), 1 (it's fine) and 2 (too easy).
			// Returns (rating -1) to update the game parameters.
			
			// The challenge rating in output will influence the mobs / trap generation as well as influencing the item generation if necessary.
			
			double[] inputChallenge = {floorStats.deepestFloor,floorStats.level,
					floorStats.strength,floorStats.heroAttackSkill,floorStats.heroDefenseSkill,
			        floorStats.mobSlain,floorStats.mobSpawned,floorStats.attackCount,
			        floorStats.sneakAttackCount,floorStats.wandUsed,floorStats.throwingWeaponUsed, floorStats.scrollUsed,
			        floorStats.potionDrank,floorStats.potionThrown,floorStats.damageReceived,floorStats.deathInFloor,
			        floorStats.highestArmorResistance,floorStats.highestAverageWeaponDamage,floorStats.brokenItem,floorStats.trapCount, 
			        floorStats.turnSpentLowHP,floorStats.turnSpentHighHP};
			
			int ratingChallenge = 0;
			
			try {
				ratingChallenge = RandomForestClassifier.ChallengeClassifier.predict(inputChallenge) -1;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return ratingChallenge;
		}
		
		public int getExploration() {
			// Run the RF Classifier functions for exploration.		
			// The labels used are 0 (too much), 1 (it's fine) and 2 (not enough).
			// Returns (rating -1) to update the game parameters.
			
			// The exploration rating in output will influence map size, the addition of special features as well as balancing the food generation.
			
			double[] inputExploration = {floorStats.deepestFloor,floorStats.dungeonWidth,
					floorStats.dungeonHeight,floorStats.explorableTilesCount,floorStats.unexploredTilesRatio,
			        floorStats.floorDuration,floorStats.roomCount,floorStats.specialRoomCount,
			        floorStats.hiddenDoorCount,floorStats.searchDone,floorStats.foundSomething, floorStats.foundSomethingRandomly,
			        floorStats.roomSizeMin,floorStats.roomSizeMax,floorStats.keySpawned,floorStats.keyUsed,
			        floorStats.questSpawned,floorStats.questCompleted,floorStats.wellSpawned,floorStats.wellUSed, 
			        floorStats.itemTransmuted,floorStats.potionCooked,floorStats.barricadeBurned};
			
			int ratingExploration = 0;
			
			try {
				ratingExploration = RandomForestClassifier.ExplorationClassifier.predict(inputExploration) -1;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return ratingExploration;
		}
		
		public void updateMapParameters() {
			
			// Balance both parameters a bit to prevent small maps from being flooded with mobs and prevent big maps from being empty.
			if(predictedExplorationRating > 5) {
				predictedChallengeRating = (predictedChallengeRating < 2) ? 2 : predictedChallengeRating;
			}
			if(predictedChallengeRating > 5) {
				predictedExplorationRating = (predictedExplorationRating < 2) ? 2 : predictedExplorationRating;
			}	
				
			levelHeigth = 32 + 2 * predictedExplorationRating;	
			levelWidth = 32 + 2 * predictedExplorationRating;
			
			if(levelWidth > 64) {
				levelWidth = 64;
			}
			else if (levelWidth < 32) {
				levelWidth = 32;
			}
			if(levelHeigth > 64) {
				levelHeigth = 64;
			}
			else if (levelHeigth < 32) {
				levelHeigth = 32;
			}

			additionalSpecialRoom = (int)predictedExplorationRating / 2;
			additionalHiddenDoor = (int)predictedExplorationRating / 3;
			
			if(additionalSpecialRoom > (levelWidth / 10)) {
				additionalSpecialRoom = (levelWidth / 10);
			}
			if(additionalSpecialRoom < 0) {
				additionalSpecialRoom = 0;
			}
			if(additionalHiddenDoor > (levelWidth / 10)) {
				additionalHiddenDoor = (int) levelWidth / 10 ;
			}
			if(additionalHiddenDoor < 0) {
				additionalHiddenDoor = 0;
			}
			
			if (predictedGameplay == 1 || predictedGameplay == 2) {
				minRoomSize = 7;
				maxRoomSize = 10;
			}			
			else if (predictedGameplay == 3) {
				minRoomSize = 5;
				maxRoomSize = 8;
			}			
			else {
				minRoomSize = 7;
				maxRoomSize = 9;
			}			
			if(predictedExplorationRating >= 2) {
				Ghost.Quest.reset();
				Wandmaker.Quest.reset();
				Blacksmith.Quest.reset();
			}			
			
			if(Dungeon.depth == 24) {
				levelHeigth = 32;
				levelWidth = 32;						
			}						
		}
		
		public void updateChallengeParameters() {
			
			if(predictedChallengeRating >= 2) {
				
				higherFloor = Dungeon.depth + 1;
				
				if(predictedChallengeRating >= 5) {
					higherFloor += (int) (predictedChallengeRating / 5);
				}
				
				if (Dungeon.bossLevel( higherFloor )) {
					// spawn mobs from a higher floor in case of boss level
					higherFloor ++;
				}
				
				if(higherFloor >= 25) {
					higherFloor = 24;
				}
				
				additionalHigherLevelMobs = (int) 1 + predictedChallengeRating ;
				
			}
			// Increase the spawned mob count by 20% per challenge rating.
			additionalMobs = 20 * predictedChallengeRating;
						
			// Increase trap count based on difficulty			
			additionalTraps = predictedChallengeRating * 3;
			
		}
		
	}
		
}






