package com.github.aro_tech.extended_mockito;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All unit tests for the extended-mockito project
 * 
 * @author aro_tech
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ ExtendedBDDMockitoTest.class, ExtendedMatchersTest.class, ExtendedMockitoTest.class, InjectorTest.class })
public class AllTests {

}
