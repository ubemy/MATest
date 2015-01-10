package com.ma.schiffeversenken.CheckGamePlay;

import com.ma.schiffeversenken.android.controller.Game;
import com.ma.schiffeversenken.android.controller.KI;
import com.ma.schiffeversenken.android.controller.ShipPlacement;
import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;
import com.ma.schiffeversenken.android.model.Ship;

import junit.framework.TestCase;

public class CheckGamePlayTest1 extends TestCase {
	Game game;
	
	protected static void setUpBeforeClass() throws Exception {
	}

	protected void setUp() throws Exception {
		ShipPlacement.jUnitTest = true;
		
		Field firstField = new Field(0);
		Field secondField = new Field(1);
		
		FieldUnit[] fieldUnits = new FieldUnit[1];
		fieldUnits[0] = firstField.getElementByID(2);
		Ship ship = new Ship(Ship.CRUISER_SIZE, fieldUnits);
		fieldUnits[0].setPlacedShip(ship);
		fieldUnits[0].setOccupied(true);
		
		FieldUnit[] fieldUnits2 = new FieldUnit[2];
		fieldUnits2[0] = firstField.getElementByID(25);
		fieldUnits2[1] = firstField.getElementByID(26);
		Ship ship2 = new Ship(Ship.SUBMARINE_SIZE, fieldUnits2);
		fieldUnits2[0].setPlacedShip(ship2);
		fieldUnits2[0].setOccupied(true);
		fieldUnits2[1].setPlacedShip(ship2);
		fieldUnits2[1].setOccupied(true);
		
		FieldUnit[] fieldUnits3 = new FieldUnit[3];
		fieldUnits3[0] = firstField.getElementByID(12);
		fieldUnits3[1] = firstField.getElementByID(22);
		fieldUnits3[2] = firstField.getElementByID(32);
		Ship ship3 = new Ship(Ship.DESTROYER_SIZE, fieldUnits3);
		fieldUnits3[0].setPlacedShip(ship3);
		fieldUnits3[0].setOccupied(true);
		fieldUnits3[1].setPlacedShip(ship3);
		fieldUnits3[1].setOccupied(true);
		fieldUnits3[2].setPlacedShip(ship3);
		fieldUnits3[2].setOccupied(true);
		
		FieldUnit[] fieldUnits4 = new FieldUnit[4];
		fieldUnits4[0] = firstField.getElementByID(82);
		fieldUnits4[1] = firstField.getElementByID(83);
		fieldUnits4[2] = firstField.getElementByID(84);
		fieldUnits4[3] = firstField.getElementByID(85);
		Ship ship4 = new Ship(Ship.BATTLESHIP_SIZE, fieldUnits4);
		fieldUnits4[0].setPlacedShip(ship4);
		fieldUnits4[0].setOccupied(true);
		fieldUnits4[1].setPlacedShip(ship4);
		fieldUnits4[1].setOccupied(true);
		fieldUnits4[2].setPlacedShip(ship4);
		fieldUnits4[2].setOccupied(true);
		fieldUnits4[3].setPlacedShip(ship4);
		fieldUnits4[3].setOccupied(true);
		
		
		game = new Game(0, firstField, secondField, false, false, false, 2);
		game.start();
		game.firstGamerAttack(1);
		Thread.sleep(200);
		game.secondGamerAttack(2);
		Thread.sleep(200);
		game.firstGamerAttack(2);
		Thread.sleep(200);
		game.secondGamerAttack(25);
		Thread.sleep(200);
		game.firstGamerAttack(3);
		game.secondGamerAttack(26);
		Thread.sleep(200);
		game.firstGamerAttack(4);
		game.secondGamerAttack(12);
		Thread.sleep(200);
		game.firstGamerAttack(5);
		game.secondGamerAttack(22);
		Thread.sleep(200);
		game.firstGamerAttack(6);
		game.secondGamerAttack(32);
		Thread.sleep(200);
		game.firstGamerAttack(7);
		game.secondGamerAttack(82);
		Thread.sleep(200);
		game.firstGamerAttack(8);
		game.secondGamerAttack(83);
		Thread.sleep(200);
		game.firstGamerAttack(9);
		game.secondGamerAttack(84);
		Thread.sleep(200);
		game.firstGamerAttack(10);
		game.secondGamerAttack(85);
	}

	public void test() throws Exception {
		assertEquals(false, game.getFirstFieldPlayer().getElementByID(25).getPlacedShip().isDestroyed());
	}
}
