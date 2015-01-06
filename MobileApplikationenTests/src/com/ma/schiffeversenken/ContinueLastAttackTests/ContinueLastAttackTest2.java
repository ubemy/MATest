package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.TestCase;
import com.ma.schiffeversenken.android.controller.KI;
import com.ma.schiffeversenken.android.controller.ShipPlacement;
import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.Ship;

public class ContinueLastAttackTest2 extends TestCase {
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
		
		firstField.getElementByID(31).setAttacked(true);
		firstField.getElementByID(41).setAttacked(true);
		firstField.getElementByID(51).setAttacked(true);
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships, true);
		
		KI.jUnitTest = true;
		ki = new KI(secondField, firstField, false, 2);
		
		ki.updateHistory(31, true, false);
		ki.updateHistory(41, true, false);
		ki.updateHistory(51, true, false);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(61, ki.attack());
	}
}
