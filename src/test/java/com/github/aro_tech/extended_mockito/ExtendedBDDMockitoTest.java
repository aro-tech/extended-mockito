/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import org.junit.Before;
import org.junit.Test;

import com.github.aro_tech.extended_mockito.wrappers.JUnitAssert;

/**
 * @author aro_tech
 *
 */
public class ExtendedBDDMockitoTest extends ExtendedMatchersTest implements ExtendedBDDMockito, JUnitAssert {

	/* (non-Javadoc)
	 * @see com.github.aro_tech.extended_mockito.ExtendedMatchersTest#setUp()
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link com.github.aro_tech.extended_mockito.BDDMockitoMixin#given(java.lang.Object)}.
	 */
	@Test
	public void testGiven() {
		given(mock.doAThingWithAString("foo")).willReturn(true);
		assertTrue(mock.doAThingWithAString("foo"));
		assertFalse(mock.doAThingWithAString("oof"));
	}

	/**
	 * Test method for {@link com.github.aro_tech.extended_mockito.BDDMockitoMixin#then(java.lang.Object)}.
	 */
	@Test
	public void testThen() {
		mock.doAThingWithAString("foo");
		
		then(mock).should().doAThingWithAString("foo");
		then(mock).shouldHaveNoMoreInteractions();
	}

	/* (non-Javadoc)
	 * @see com.github.aro_tech.extended_mockito.wrappers.JUnitAssert#fail(java.lang.String)
	 */
	@Override
	public void fail(String message) {
		JUnitAssert.super.fail(message);
	}

}
