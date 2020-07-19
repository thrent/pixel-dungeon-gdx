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
	public static GameStatistics gameStats = new GameStatistics();
	
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
		gameStats.reset();		
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
		
		try(FileWriter fw = new FileWriter("GameLog_Statistics.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("levelHeight,levelWidth,additionalSpecialRoom,additionalHiddenDoor,"
						+ "minRoomSize,maxRoomSize,levelSizeLeftovers,additionalTraps,additionalMobs,"
						+ "additionalHigherLevelMobs,higherFloor,Gameplay,ExplorationRating,ChallengeRating");
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Challenge.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("Floor,Level,Strength,Class,"
						+ "AttackSkill,DefenseSkill,MobSlain,MobSpawned,AttackCount,"
						+ "sneakAttackCount,WandUsed,ThrowindWeaponUsed,"
						+ "ScrollUsed,PotionUsed,PotionThrown,DamageReceived,"
						+ "DeathInFloor,Armor,WeaponDamage,BrokenItem,TrapCount");
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
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
			    //exception handling left as an exercise for the reader
			}		
	}
	
	
	public static void updateLogFile() {
		
		floorStats.deepestFloor = deepestFloor;		
		
			
		try(FileWriter fw = new FileWriter("GameLog_Statistics.txt", true);
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
			    //exception handling left as an exercise for the reader
			}
		
		try(FileWriter fw = new FileWriter("GameLog_Challenge.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				String sentence = floorStats.deepestFloor  + "," +
						floorStats.level + "," + floorStats.strength + "," + 
						floorStats.heroClass  + "," + floorStats.heroAttackSkill   + "," + 
						floorStats.heroDefenseSkill + "," + floorStats.mobSlain + "," + 
						floorStats.mobSpawned  + "," + 
						floorStats.attackCount  + "," + floorStats.sneakAttackCount + "," + 
						floorStats.wandUsed  + "," + floorStats.throwingWeaponUsed + "," + 
						floorStats.scrollUsed + "," + 
						floorStats.potionDrank  + "," + floorStats.potionThrown + "," + 
						floorStats.damageReceived  + "," + floorStats.deathInFloor + "," + 
						floorStats.highestArmorResistance  + "," + floorStats.highestAverageWeaponDamage + "," + 
						floorStats.brokenItem  + "," + floorStats.trapCount;
			    out.println(sentence);
			    
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
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
			    //exception handling left as an exercise for the reader
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

	public static class GameStatistics {
		// Contains the sum of all the floor statistics gathered over the course of the current game
		public FloorStatistics[] floorStatsArray = new FloorStatistics[26];
		
		public int challengeRating;
		public int explorationRating;
		public int gameplayRating; // 0 for melee, 1 for ranged, 2 for magic and 3 for stealth
		
		public int predictedChallenge; // From -1 to +1
		public int identifiedGameplay; // From 0 to 2
		public int predictedExploration; // From -1 to +1

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
		public int SpecialRoomCount;
		public int HiddenDoorCount;
		public int hiddenDoorFound;
		public int TrapCount;
		public int averageDungeonWidth;
		public int averageDungeonHeight;
		public int averageDungeonLength;
		public int RoomCount;
		public int averageDistanceFromEntranceToExit;
		public int gameDuration;
		public int TotalUnexploredTilesRatio;
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
		public int averageSpawnedItemCount;
		// Equipped gear
		public int highestArmorResistance;
		public int highestAverageWeaponDamage;
		// Combat
		public int turnSpentLowHP;
		public int turnSpentHighHP;
		public int mobSlain;
		public int mobSpawned;
		public int damageReceived;
		public int deathCount;
		// Stats
		public int deepestFloor;
		public int currentFloor;
		public int goldCollected;
		public int Level;
		public int Strength;
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



		public void reset() {
			
			floorStatsArray[0] = floorStats;
			
			challengeRating = 0;
			explorationRating = 0;
			gameplayRating = 0;
			
			predictedChallenge = 0;
			identifiedGameplay = 0;
			predictedExploration = 0;

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
			SpecialRoomCount = 0;
			HiddenDoorCount = 0;
			hiddenDoorFound = 0;
			TrapCount = 0;
			averageDungeonWidth = 0;
			averageDungeonHeight = 0;
			averageDungeonLength = 0;
			RoomCount = 0;
			averageDistanceFromEntranceToExit = 0;
			gameDuration = 0;
			TotalUnexploredTilesRatio = 0; 
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
			averageSpawnedItemCount = 0;
			// Equipped gear
			highestArmorResistance = 0;
			highestAverageWeaponDamage = 0;
			// Challenge
			turnSpentLowHP = 0;
			turnSpentHighHP = 0;
			mobSlain = 0;
			mobSpawned = 0;
			damageReceived = 0;
			deathCount = 0;
			// status
			deepestFloor = 0;
			currentFloor = 0;
			goldCollected = 0;
			Level = 0;
			Strength = 0;
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

		public void updateFromFloorStats(FloorStatistics floorStats) {
			
			floorStatsArray[currentFloor] = floorStats;
			/**
			predictedChallenge = getChallenge();
			identifiedGameplay = getGameplay();
			predictedExploration = getExploration();
			
			challengeRating += predictedChallenge;
			explorationRating += predictedExploration;
			**/
			
			newLevelParameters.update();
			
			// Content
			keySpawned += floorStats.keySpawned;
			keyUsed += floorStats.keyUsed;
			questSpawned += floorStats.questSpawned;
			questCompleted += floorStats.questCompleted;
			itemTransmuted += floorStats.itemTransmuted;
			potionCooked += floorStats.potionCooked;
			barricadeBurned += floorStats.barricadeBurned;
			wellSpawned += floorStats.wellSpawned;
			wellUSed += floorStats.wellUSed;
			// map
			SpecialRoomCount += floorStats.specialRoomCount;
			HiddenDoorCount += floorStats.hiddenDoorCount;
			hiddenDoorFound += floorStats.hiddenDoorFound;
			TrapCount += floorStats.trapCount;
			averageDungeonWidth += floorStats.dungeonWidth;
			averageDungeonHeight += floorStats.dungeonHeight;
			averageDungeonLength += floorStats.dungeonLength;
			RoomCount += floorStats.roomCount;
			averageDistanceFromEntranceToExit += floorStats.distanceFromEntranceToExit;
			gameDuration += floorStats.floorDuration;
			TotalUnexploredTilesRatio += floorStats.unexploredTilesRatio; 
			explorableTilesCount += floorStats.explorableTilesCount;
			// Used items
			seedUsed += floorStats.seedUsed;
			scrollUsed += floorStats.scrollUsed;
			potionThrown += floorStats.potionThrown;
			potionDrank += floorStats.potionDrank;
			throwingWeaponUsed += floorStats.throwingWeaponUsed;
			wandUsed += floorStats.wandUsed;
			foodUsed += floorStats.foodUsed;	
			// Resource scarcity
			damageFromHunger += floorStats.damageFromHunger;
			brokenItem += floorStats.brokenItem;
			averageSpawnedItemCount += floorStats.spawnedItemCount;
			// Equipped gear
			highestArmorResistance += floorStats.highestArmorResistance;
			highestAverageWeaponDamage += floorStats.highestAverageWeaponDamage;
			// Challenge
			turnSpentLowHP += floorStats.turnSpentLowHP;
			turnSpentHighHP += floorStats.turnSpentHighHP;
			mobSlain += floorStats.mobSlain;
			mobSpawned += floorStats.mobSpawned;
			damageReceived += floorStats.damageReceived;
			deathCount += floorStats.deathInFloor;
			// status
			deepestFloor = floorStats.deepestFloor;
			currentFloor = floorStats.currentFloor;
			goldCollected += floorStats.goldCollected;
			Level = floorStats.level;
			Strength = floorStats.strength;
			heroClass = floorStats.heroClass;			
			maxHP = floorStats.maxHP;
			heroAttackSkill = floorStats.heroAttackSkill;
			heroDefenseSkill = floorStats.heroDefenseSkill;
			// Actions 
			searchDone += floorStats.searchDone;
			foundSomething += floorStats.foundSomething;
			foundSomethingRandomly += floorStats.foundSomethingRandomly;
			attackCount += floorStats.attackCount;
			sneakAttackCount += floorStats.sneakAttackCount;
			
			floorStats.reset();

		}
	
	
		public void generateRatios() {
			
		}
		
		public int getGameplay() {
			// Run the RF Classifier functions for Gameplay.
			return 3;
		}
		
		public int getChallenge() {
			// Run the RF Classifier functions for Challenge.
			return 0;
		}
		
		public int getExploration() {
			// Run the RF Classifier functions for exploration.
			return 0;
		}
		
		public void updateLevelParameters() {
		// Height, Width, levelWidth, levelHeight, minSpecialRoomCount, hiddenDoor, additionalTraps, roomMinSize, roomMaxSize
			
			newLevelParameters.levelHeigth += 3 * explorationRating;
			newLevelParameters.levelWidth += 3 * explorationRating;

			newLevelParameters.additionalSpecialRoom += (int)explorationRating % 3;
			newLevelParameters.additionalHiddenDoor = 0;
			
			if (gameplayRating == 1) {
				newLevelParameters.minRoomSize = 8;
				newLevelParameters.maxRoomSize = 10;
			}
			
			else if (gameplayRating == 2) {
				newLevelParameters.minRoomSize = 7;
				newLevelParameters.maxRoomSize = 10;
			}
			
			else if (gameplayRating == 3) {
				newLevelParameters.minRoomSize = 5;
				newLevelParameters.maxRoomSize = 8;
			}
			
			else {
				newLevelParameters.minRoomSize = 7;
				newLevelParameters.maxRoomSize = 9;
			}
			
			
		}
		
		public void getChallengeParameters() {
			
			int mobCount = 0;
			int dungeonDepth = 0;	
			
		}
		
		public void getGameplayparameter() {
			
			String dataminedGameplay = "plop";
			
			int roomMin = 0;
			int roomMax = 0;
			int itemToAdd = 0;
			
			if(dataminedGameplay == "magic") {
				roomMin = 9;
				roomMax = 11;
				
				itemToAdd = 1; // Wand
				// to add items : level.addItemToSpawn( new IronKey() )
			}
			else if(dataminedGameplay == "ranged") {
				roomMin = 8;
				roomMax = 11;
				
				itemToAdd = 1; // Wand				
			}
			else {
				roomMin = 7;
				roomMax = 9;
			}
			
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
				new ScrollOfMagicMapping().collect();
				new ScrollOfMagicMapping().collect();
				new ScrollOfMagicMapping().collect();
				new ScrollOfMagicMapping().collect();
				new ScrollOfUpgrade().collect();
				new ScrollOfUpgrade().collect();
				new ScrollOfUpgrade().collect();
			}
			if(className == "mage") {
				minRoomSize = 7;
				maxRoomSize = 10;
				predictedExplorationRating = 0;
				predictedGameplay = 2;
				additionalItemToSpawn.add(Generator.random( Generator.Category.WAND ) );
			}
			if(className == "huntress") {
				minRoomSize = 8;
				maxRoomSize = 11;
				predictedExplorationRating = 2;
				predictedGameplay = 1;
				additionalItemToSpawn.add(Generator.random( Generator.Category.THROWINGWEAPON ) );
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
			
			if(levelSizeLeftovers >= 1) {
				while(levelSizeLeftovers >= 1) {
					additionalItemToSpawn.add(Generator.random( Generator.Category.FOOD ) );
					levelSizeLeftovers --;
				}
			}
		}
		
		public void getMostNeededItem() throws Exception {
			Item itemToAdd;
			
			if(floorStats.brokenItem > 0) {
				int randomUpgrade = Random.Int( 2 );
				
				if(randomUpgrade == 0) {
					itemToAdd = new ScrollOfUpgrade();
					Dungeon.scrollsOfUpgrade ++;
				}
				else if (randomUpgrade == 1) {
					itemToAdd =  new ScrollOfEnchantment();
					Dungeon.scrollsOfEnchantment ++;
				}
				else {
					itemToAdd = new Weightstone();
				}
			}
			
			else if (floorStats.highestArmorResistance < floorStats.highestAverageWeaponDamage) {
				itemToAdd = Generator.randomArmor();
			}
			
			else {
				itemToAdd = Generator.randomWeapon();
			}
			
			additionalItemToSpawn.add(itemToAdd);	
		}
		
		public void getGameplayItem() throws Exception {
			Item itemToAdd;
			
			if(gameStats.identifiedGameplay == 1) {
				itemToAdd = Generator.randomThrowingWeapon();
				additionalItemToSpawn.add(Generator.randomThrowingWeapon());
			}
			else if (gameStats.identifiedGameplay == 2) {
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
			
			updateMapParameters();
			updateChallengeParameters();
			try {
				generateItems();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public int getGameplay() {
			// Run the RF Classifier functions for Gameplay.
			// 0 for melee, 1 for range, 2 for magic, 3 for sneaky
			return 1;
		}
		
		public int getChallenge() {
			// Run the RF Classifier functions for Challenge.
			return 1;
		}
		
		public int getExploration() {
			// Run the RF Classifier functions for exploration.
			return 1;
		}
		
		public void updateMapParameters() {
				
			levelHeigth = 32 + 2 * predictedExplorationRating;
			
			if(levelHeigth > 64) {
				levelHeigth = 64;
			}
			else if (levelHeigth < 25) {
				levelHeigth = 25;
			}
			
			levelWidth = 32 + 2 * predictedExplorationRating;
			
			if(levelWidth > 64) {
				levelWidth = 64;
			}
			else if (levelWidth < 25) {
				levelWidth = 25;
			}

			additionalSpecialRoom = 1 + (int)predictedExplorationRating / 2;
			
			if(additionalSpecialRoom > 4) {
				additionalSpecialRoom = 4;
			}
			if(additionalSpecialRoom < 0) {
				additionalSpecialRoom = 0;
			}
			
			additionalHiddenDoor = (int)predictedExplorationRating / 2;
			
			if (predictedGameplay == 1) {
				minRoomSize = 8;
				maxRoomSize = 10;
			}
			
			else if (predictedGameplay == 2) {
				minRoomSize = 8;
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
						
		}
		
		public void updateChallengeParameters() {
			
			if(predictedChallengeRating >= 2) {
				
				higherFloor = Dungeon.depth + 1;
				
				if(predictedChallengeRating >= 5) {
					higherFloor ++;
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



