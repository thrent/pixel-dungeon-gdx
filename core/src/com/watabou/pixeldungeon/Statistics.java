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

import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.io.FileWriter; 

import com.watabou.pixeldungeon.levels.Level;
import com.watabou.pixeldungeon.levels.RegularLevel;

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

	public static FloorStatistics floor_stats = new FloorStatistics();
	public static GameStatistics game_stats = new GameStatistics();

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
		
		floor_stats.init();
		game_stats.reset();
		
		createClassifierStats();
		
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
	

	public static void createClassifierStats() {		
		
		try(FileWriter fw = new FileWriter("GameLog_Statistics.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("dungeonLength, dungeonHeight, dungeonWidth, highestAverageWeaponDamage,"
			    		+ " keyUsed, questSpawned, questCompleted, floorDuration, "
			    		+ "unexploredTilesRatio, seedUsed, scrollUsed, potionDrank, "
			    		+ "throwingWeaponUsed, wandUsed, damageFromHunger, brokenItem,"
			    		+ " highestArmorResistance, turnSpentLowHP, turnSpentHighHP, "
			    		+ "deepestFloor, goldCollected, Strength, Class, SearchDone,"
			    		+ "Foundsomething, FoundsometingRandomly, DistEntryExit, roomCount, "
			    		+ "specialRoomCount, minRoomSize, maxRoomSize, secretDoorCount");
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
	}
	
	
	public static void updateClassifierStats() {
		
		floor_stats.deepestFloor = deepestFloor;		
		
		updateStatsMap();		
			
		try(FileWriter fw = new FileWriter("GameLog_Statistics.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			String sentence = floor_stats.dungeonLength + "," + floor_stats.dungeonHeight + "," + 
			floor_stats.dungeonWidth + "," + floor_stats.highestAverageWeaponDamage + "," + floor_stats.keyUsed+ "," +
			floor_stats.questSpawned + "," + floor_stats.questCompleted + "," + 
			floor_stats.floorDuration + "," + floor_stats.unexploredTilesRatio+ "," + 
			floor_stats.seedUsed  + "," +  floor_stats.scrollUsed + "," + 
			floor_stats.potionDrank + "," + floor_stats.throwingWeaponUsed + "," + 
			floor_stats.wandUsed + "," + floor_stats.damageFromHunger + "," + 
			floor_stats.brokenItem + "," + floor_stats.highestArmorResistance + "," + 
			floor_stats.turnSpentLowHP + "," + floor_stats.turnSpentHighHP + "," + 
			floor_stats.deepestFloor + "," + floor_stats.goldCollected + "," + 
			floor_stats.Strength + "," + floor_stats.heroClass + "," + 
			floor_stats.searchDone + "," + floor_stats.foundSomething + "," +
			floor_stats.foundSomethingRandomly + "," +  floor_stats.distanceFromEntranceToExit + "," +  
			floor_stats.roomCount  + "," +  floor_stats.specialRoomCount + "," +  
			floor_stats.roomSizeMin  + "," +  floor_stats.roomSizeMax + "," +
			floor_stats.hiddenDoorCount;
			
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

		floor_stats.unexploredTilesRatio = (int)(100 *unexploredCount / explorableTiles);
		floor_stats.currentFloor = Dungeon.depth;
	}
	
public static void updateStatsMap() {
		floor_stats.dungeonHeight = Level.HEIGHT;
		floor_stats.dungeonWidth = Level.WIDTH;
		floor_stats.dungeonLength = Level.LENGTH;
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
		public int damageReceived;
		public int deathInFloor;
		// Stats
		public int deepestFloor;
		public int currentFloor;
		public int goldCollected;
		public int Level;
		public int Strength;
		public String heroClass;
		public static int maxHP;
		// Actions 
		public int searchDone;
		public int foundSomething;
		public int foundSomethingRandomly;
		public int attackCount;

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
			damageReceived = 0;
			deathInFloor = 0;
			
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
			
			// Actions 
			searchDone = 0;
			foundSomething = 0;
			foundSomethingRandomly = 0;
			attackCount = 0;

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
			damageReceived = 0;
			deathInFloor = 0;
			
			// status			
			goldCollected = 0;
			
			// Actions 
			searchDone = 0;
			foundSomething = 0;
			foundSomethingRandomly = 0;
			attackCount = 0;

		}
	}

	public static class GameStatistics {
		// Contains the sum of all the floor statistics gathered over the course of the current game
		public FloorStatistics[] floorStatsArray = new FloorStatistics[26];


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
		public int averageSpecialRoomCount;
		public int averageHiddenDoorCount;
		public int averageTrapCount;
		public int averageDungeonWidth;
		public int averageDungeonHeight;
		public int averageDungeonLength;
		public int averageRoomCount;
		public int averageDistanceFromEntranceToExit;
		public int gameDuration;
		public int averageUnexploredTilesRatio;
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
		// Actions 
		public int searchDone;
		public int foundSomething;
		public int foundSomethingRandomly;
		public int attackCount;



		public void reset() {
			
			floorStatsArray[0] = floor_stats;

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
			averageSpecialRoomCount = 0;
			averageHiddenDoorCount = 0;
			averageTrapCount = 0;
			averageDungeonWidth = 0;
			averageDungeonHeight = 0;
			averageDungeonLength = 0;
			averageRoomCount = 0;
			averageDistanceFromEntranceToExit = 0;
			gameDuration = 0;
			averageUnexploredTilesRatio = 0; 
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
			// Actions 
			searchDone = 0;
			foundSomething = 0;
			foundSomethingRandomly = 0;
			attackCount = 0;

		}

		public void updateFromFloorStats(FloorStatistics floorStats) {
			
			floorStatsArray[currentFloor] = floorStats;
			
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
			averageSpecialRoomCount += floorStats.specialRoomCount;
			averageHiddenDoorCount += floorStats.hiddenDoorCount;
			averageTrapCount += floorStats.trapCount;
			averageDungeonWidth += floorStats.dungeonWidth;
			averageDungeonHeight += floorStats.dungeonHeight;
			averageDungeonLength += floorStats.dungeonLength;
			averageRoomCount += floorStats.roomCount;
			averageDistanceFromEntranceToExit += floorStats.distanceFromEntranceToExit;
			gameDuration += floorStats.floorDuration;
			averageUnexploredTilesRatio += floorStats.unexploredTilesRatio; 
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
			damageReceived += floorStats.damageReceived;
			deathCount += floorStats.deathInFloor;
			// status
			deepestFloor = floorStats.deepestFloor;
			currentFloor = floorStats.currentFloor;
			goldCollected += floorStats.goldCollected;
			Level = floorStats.Level;
			Strength = floorStats.Strength;
			heroClass = floorStats.heroClass;			
			maxHP = floorStats.maxHP;
			// Actions 
			searchDone += floorStats.searchDone;
			foundSomething += floorStats.foundSomething;
			foundSomethingRandomly += floorStats.foundSomethingRandomly;
			attackCount += floorStats.attackCount;
			
			floorStats.reset();

		}
	
	
		public void generateRatios() {
			
		}
		
		public void getLevelParameters() {
			
			int exploration = 0;
			
			int dungeonWidth = 0;
			int dungeonDepth = 0;
			int specialRoom = 0;
			
			if(exploration == -1) {
				
			}
			
			else if(exploration == 0) {
				
			}
			
			if(exploration == 1) {
				
			}
		}
	}
	
	
}

