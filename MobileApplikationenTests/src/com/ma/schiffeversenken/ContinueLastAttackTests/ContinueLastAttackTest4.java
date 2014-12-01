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

public class ContinueLastAttackTest4 extends TestCase {
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
		
		firstField.getElementByID(75).setAttacked(true);
		firstField.getElementByID(65).setAttacked(true);
		firstField.getElementByID(55).setAttacked(true);
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships);
		
		ki = new KI(secondField, firstField);
		
		ki.updateHistory(75, true, false);
		ki.updateHistory(65, true, false);
		ki.updateHistory(55, false, false);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(85, ki.attack());
	}
}
