package com.ma.schiffeversenken.CheckEdges;

import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;

import junit.framework.TestCase;

public class CheckEdgesTest3 extends TestCase {
	Field field;
	protected void setUp() throws Exception {
		 field = new Field(0);
	}
	
	public void test() throws Exception {		
		assertEquals(0, field.getElementByID(20).getEdge(1));
		assertEquals(-1, field.getElementByID(20).getEdge(2));
		
		assertEquals(0, field.getElementByID(30).getEdge(1));
		assertEquals(-1, field.getElementByID(30).getEdge(2));
		
		assertEquals(0, field.getElementByID(40).getEdge(1));
		assertEquals(-1, field.getElementByID(40).getEdge(2));
		
		assertEquals(0, field.getElementByID(50).getEdge(1));
		assertEquals(-1, field.getElementByID(50).getEdge(2));
		
		assertEquals(0, field.getElementByID(60).getEdge(1));
		assertEquals(-1, field.getElementByID(60).getEdge(2));
		
		assertEquals(0, field.getElementByID(70).getEdge(1));
		assertEquals(-1, field.getElementByID(70).getEdge(2));
		
		assertEquals(0, field.getElementByID(80).getEdge(1));
		assertEquals(-1, field.getElementByID(80).getEdge(2));
		
		assertEquals(3, field.getElementByID(90).getEdge(1));
		assertEquals(0, field.getElementByID(90).getEdge(2));
	}
}
