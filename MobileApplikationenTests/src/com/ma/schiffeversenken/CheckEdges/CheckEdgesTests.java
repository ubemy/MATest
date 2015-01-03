package com.ma.schiffeversenken.CheckEdges;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CheckEdgesTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(CheckEdgesTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CheckEdgesTest1.class);
		suite.addTestSuite(CheckEdgesTest2.class);
		suite.addTestSuite(CheckEdgesTest3.class);
		suite.addTestSuite(CheckEdgesTest4.class);
		//$JUnit-END$
		return suite;
	}

}
