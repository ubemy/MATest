package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.TestCase;
import com.ma.schiffeversenken.android.controller.KI;
import com.ma.schiffeversenken.android.controller.ShipPlacement;
import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;
import com.ma.schiffeversenken.android.model.Ship;

public class ContinueLastAttackTest5 extends TestCase {
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
		Ship[] myships = new Ship[]{new Ship(SUBMARINE_SIZE),
				new Ship(SUBMARINE_SIZE),
				new Ship(SUBMARINE_SIZE),
				new Ship(CRUISER_SIZE),
				new Ship(CRUISER_SIZE),
				new Ship(CRUISER_SIZE),
				new Ship(CRUISER_SIZE),
				new Ship(DESTROYER_SIZE),
				new Ship(DESTROYER_SIZE),
				new Ship(BATTLESHIP_SIZE)
				};
		
		Field firstField = new Field(0);
		Field secondField = new Field(1);
		
		firstField.getElementByID(18).setAttacked(true);
		firstField.getElementByID(19).setAttacked(true);
		firstField.getElementByID(20).setAttacked(true);
		
		ShipPlacement.jUnitTest = true;
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships);
		
		ki = new KI(secondField, firstField, false, 2);
		
		FieldUnit[] fieldUnits = new FieldUnit[3];
		fieldUnits[0] = firstField.getElementByID(18);
		fieldUnits[1] = firstField.getElementByID(19);
		fieldUnits[2] = firstField.getElementByID(20);
		
		ki.updateHistory(18, true, false, fieldUnits);
		ki.updateHistory(19, true, false, fieldUnits);
		ki.updateHistory(20, true, false, fieldUnits);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(17, ki.attack());
	}
}
