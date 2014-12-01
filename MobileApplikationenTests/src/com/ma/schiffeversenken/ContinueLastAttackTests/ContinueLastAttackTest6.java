package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.TestCase;
import com.ma.schiffeversenken.android.controller.KI;
import com.ma.schiffeversenken.android.controller.ShipPlacement;
import com.ma.schiffeversenken.android.model.Battleship;
import com.ma.schiffeversenken.android.model.Cruiser;
import com.ma.schiffeversenken.android.model.Destroyer;
import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.Ship;
import com.ma.schiffeversenken.android.model.Submarine;

public class ContinueLastAttackTest6 extends TestCase {
	KI ki;
	
	@Override
	protected void setUp() throws Exception {
		Ship[] myships = new Ship[]{new Submarine("Uboot"),
				new Submarine("Uboot"),
				new Submarine("Uboot"),
				new Cruiser("Kreuzer"),
				new Cruiser("Kreuzer"),
				new Cruiser("Kreuzer"),
				new Cruiser("Kreuzer"),
				new Destroyer("Zerstoerer"),
				new Destroyer("Zerstoerer"),
				new Battleship("Schlachtschiff")
				};
		
		Field firstField = new Field(0);
		Field secondField = new Field(1);
		
		firstField.getElementByID(33).setAttacked(true);
		firstField.getElementByID(34).setAttacked(true);
		firstField.getElementByID(35).setAttacked(true);
		firstField.getElementByID(36).setAttacked(true);
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships);
		
		ki = new KI(secondField, firstField);
		
		ki.updateHistory(33, false, false);
		ki.updateHistory(36, true, false);
		ki.updateHistory(35, true, false);
		ki.updateHistory(34, false, false);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(37, ki.attack());
	}
}
