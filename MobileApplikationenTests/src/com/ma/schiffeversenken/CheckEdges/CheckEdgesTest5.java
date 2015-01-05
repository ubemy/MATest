package com.ma.schiffeversenken.CheckEdges;

import com.ma.schiffeversenken.android.model.Field;
import com.ma.schiffeversenken.android.model.FieldUnit;

import junit.framework.TestCase;

public class CheckEdgesTest5 extends TestCase {
	Field field;
	protected void setUp() throws Exception {
		 field = new Field(0);
	}
	
	public void test() throws Exception {		
		for(int i=10; i<90; i+=10){
			for(int j=2; j<10; j++){
				assertEquals(-1, field.getElementByID(i+j).getEdge(1));
				assertEquals(-1, field.getElementByID(i+j).getEdge(2));				
			}
		}
	}
}
