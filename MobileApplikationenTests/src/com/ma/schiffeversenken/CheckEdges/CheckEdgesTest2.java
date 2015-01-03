package com.ma.schiffeversenken.CheckEdges;

import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;

import junit.framework.TestCase;

public class CheckEdgesTest2 extends TestCase {
	Field field;
	protected void setUp() throws Exception {
		 field = new Field(0);
	}
	
	public void test() throws Exception {
		assertEquals(2, field.getElementByID(11).getEdge(1));
		assertEquals(-1, field.getElementByID(11).getEdge(2));
		
		assertEquals(2, field.getElementByID(21).getEdge(1));
		assertEquals(-1, field.getElementByID(21).getEdge(2));
		
		assertEquals(2, field.getElementByID(31).getEdge(1));
		assertEquals(-1, field.getElementByID(31).getEdge(2));
		
		assertEquals(2, field.getElementByID(41).getEdge(1));
		assertEquals(-1, field.getElementByID(41).getEdge(2));
		
		assertEquals(2, field.getElementByID(51).getEdge(1));
		assertEquals(-1, field.getElementByID(51).getEdge(2));
		
		assertEquals(2, field.getElementByID(61).getEdge(1));
		assertEquals(-1, field.getElementByID(61).getEdge(2));
		
		assertEquals(2, field.getElementByID(71).getEdge(1));
		assertEquals(-1, field.getElementByID(71).getEdge(2));
		
		assertEquals(2, field.getElementByID(81).getEdge(1));
		assertEquals(-1, field.getElementByID(81).getEdge(2));
		
		assertEquals(3, field.getElementByID(91).getEdge(1));
		assertEquals(2, field.getElementByID(91).getEdge(2));
	}
}
