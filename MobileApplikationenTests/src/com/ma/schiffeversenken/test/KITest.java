package com.ma.schiffeversenken.test;

import junit.framework.TestCase;
import com.ma.schiffeversenken.controller.KI;
import com.ma.schiffeversenken.controller.ShipPlacement;
import com.ma.schiffeversenken.model.Battleship;
import com.ma.schiffeversenken.model.Cruiser;
import com.ma.schiffeversenken.model.Destroyer;
import com.ma.schiffeversenken.model.Field;
import com.ma.schiffeversenken.model.Ship;
import com.ma.schiffeversenken.model.Submarine;

public class KITest extends TestCase {
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
		
		ShipPlacement sp = new ShipPlacement();
		sp.placeShips(firstField, myships);
		
		ki = new KI(secondField, firstField);
		
		ki.updateHistory(25, true, false);
	}
	
	protected void setUpBeforeClass() throws Exception {
		
	}

	public void test() throws Exception {
		assertEquals(2, ki.attack());
	}
}
