package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.TestCase;
import com.ma.schiffeversenken.android.controller.KI;
import com.ma.schiffeversenken.android.controller.ShipPlacement;
import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.Ship;

public class ContinueLastAttackTest3 extends TestCase {
	/**Groesse des Kreuzer*/
	public static final int CRUISER_SIZE = 1;
	/**Groesse des Uboot*/
	public static final int SUBMARINE_SIZE = 2;
	/**Groesse des Zerstoerer*/
	public static final int DESTROYER_SIZE = 3;
	/**Groesse des Schlachtschiff*/
	public static final int BATTLESHIP_SIZE = 4;
	KI ki;
	
	@Override
	protected void setUp() throws Exception {
		Ship[] myships = new Ship[]{new Ship("Uboot", SUBMARINE_SIZE),
				new Ship("Uboot", SUBMARINE_SIZE),
				new Ship("Uboot", SUBMARINE_SIZE),
				new Ship("Kreuzer", CRUISER_SIZE),
				new Ship("Kreuzer", CRUISER_SIZE),
				new Ship("Kreuzer", CRUISER_SIZE),
				new Ship("Kreuzer", CRUISER_SIZE),
				new Ship("Zerstoerer", DESTROYER_SIZE),
				new Ship("Zerstoerer", DESTROYER_SIZE),
				new Ship("Schlachtschiff", BATTLESHIP_SIZE)
				};
		
		Field firstField = new Field(0);
		Field secondField = new Field(1);
		
		firstField.getElementByID(75).setAttacked(true);
		firstField.getElementByID(65).setAttacked(true);
		firstField.getElementByID(55).setAttacked(true);
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships, true);
		
		ki = new KI(secondField, firstField, true, false, 2);
		
		ki.updateHistory(75, true, false);
		ki.updateHistory(65, true, false);
		ki.updateHistory(55, true, false);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(45, ki.attack());
	}
}
