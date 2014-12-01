package com.ma.schiffeversenken.ContinueLastAttackTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ContinueLastAttackTests {
/*
 * Wenn die KI in einem vorherigen Angriff ein gegnerisches Schiff getroffen
 * hat, soll die KI diesen Angriff fortführen und NICHT an einem anderen
 * beliebigen Punkt angreifen.
 * Dieses Verhalten wird in diesem Test-Package mit verschiedenen 
 * Szenarien getestet.
 */
	public static Test suite() {
		TestSuite suite = new TestSuite(ContinueLastAttackTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(ContinueLastAttackTest1.class);
		suite.addTestSuite(ContinueLastAttackTest2.class);
		suite.addTestSuite(ContinueLastAttackTest3.class);
		suite.addTestSuite(ContinueLastAttackTest4.class);
		suite.addTestSuite(ContinueLastAttackTest5.class);
		suite.addTestSuite(ContinueLastAttackTest6.class);
		//$JUnit-END$
		return suite;
	}

}
