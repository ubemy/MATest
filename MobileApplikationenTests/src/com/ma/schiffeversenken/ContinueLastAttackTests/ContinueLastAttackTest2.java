package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.TestCase;
import com.ma.schiffeversenken.controller.KI;
import com.ma.schiffeversenken.controller.ShipPlacement;
import com.ma.schiffeversenken.model.Battleship;
import com.ma.schiffeversenken.model.Cruiser;
import com.ma.schiffeversenken.model.Destroyer;
import com.ma.schiffeversenken.model.Field;
import com.ma.schiffeversenken.model.Ship;
import com.ma.schiffeversenken.model.Submarine;

public class ContinueLastAttackTest2 extends TestCase {
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
		
		firstField.getElementByID(31).setAttacked(true);
		firstField.getElementByID(41).setAttacked(true);
		firstField.getElementByID(51).setAttacked(true);
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships);
		
		ki = new KI(secondField, firstField);
		
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
