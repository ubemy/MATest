package com.ma.schiffeversenken.CheckGamePlay;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CheckGamePlayTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(CheckGamePlayTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CheckGamePlayTest1.class);
		//$JUnit-END$
		return suite;
	}

}
