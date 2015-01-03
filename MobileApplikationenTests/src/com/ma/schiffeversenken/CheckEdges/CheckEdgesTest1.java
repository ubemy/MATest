package com.ma.schiffeversenken.CheckEdges;

import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;

import junit.framework.TestCase;

public class CheckEdgesTest1 extends TestCase {
	Field field;
	protected void setUp() throws Exception {
		 field = new Field(0);
	}
	
	public void test() throws Exception {
		assertEquals(1, field.getElementByID(1).getEdge(1));
		assertEquals(2, field.getElementByID(1).getEdge(2));
		
		assertEquals(1, field.getElementByID(2).getEdge(1));
		assertEquals(-1, field.getElementByID(2).getEdge(2));
		
		assertEquals(1, field.getElementByID(3).getEdge(1));
		assertEquals(-1, field.getElementByID(3).getEdge(2));
		
		assertEquals(1, field.getElementByID(4).getEdge(1));
		assertEquals(-1, field.getElementByID(4).getEdge(2));
		
		assertEquals(1, field.getElementByID(5).getEdge(1));
		assertEquals(-1, field.getElementByID(5).getEdge(2));
		
		assertEquals(1, field.getElementByID(6).getEdge(1));
		assertEquals(-1, field.getElementByID(6).getEdge(2));
		
		assertEquals(1, field.getElementByID(7).getEdge(1));
		assertEquals(-1, field.getElementByID(7).getEdge(2));
		
		assertEquals(1, field.getElementByID(8).getEdge(1));
		assertEquals(-1, field.getElementByID(8).getEdge(2));
		
		assertEquals(1, field.getElementByID(9).getEdge(1));
		assertEquals(-1, field.getElementByID(9).getEdge(2));
		
		assertEquals(1, field.getElementByID(10).getEdge(1));
		assertEquals(0, field.getElementByID(10).getEdge(2));
	}
}
