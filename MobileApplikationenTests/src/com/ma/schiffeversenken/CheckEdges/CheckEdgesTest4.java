package com.ma.schiffeversenken.CheckEdges;

import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;

import junit.framework.TestCase;

public class CheckEdgesTest4 extends TestCase {
	Field field;
	protected void setUp() throws Exception {
		 field = new Field(0);
	}
	
	public void test() throws Exception {		
		assertEquals(3, field.getElementByID(92).getEdge(1));
		assertEquals(-1, field.getElementByID(92).getEdge(2));
		
		assertEquals(3, field.getElementByID(93).getEdge(1));
		assertEquals(-1, field.getElementByID(93).getEdge(2));
		
		assertEquals(3, field.getElementByID(94).getEdge(1));
		assertEquals(-1, field.getElementByID(94).getEdge(2));
		
		assertEquals(3, field.getElementByID(95).getEdge(1));
		assertEquals(-1, field.getElementByID(95).getEdge(2));
		
		assertEquals(3, field.getElementByID(96).getEdge(1));
		assertEquals(-1, field.getElementByID(96).getEdge(2));
		
		assertEquals(3, field.getElementByID(97).getEdge(1));
		assertEquals(-1, field.getElementByID(97).getEdge(2));
		
		assertEquals(3, field.getElementByID(98).getEdge(1));
		assertEquals(-1, field.getElementByID(98).getEdge(2));
	}
}
