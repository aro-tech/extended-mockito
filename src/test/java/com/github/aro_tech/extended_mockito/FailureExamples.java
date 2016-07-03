/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests which fail intentionally to demonstrate error messages
 * 
 * @author aro_tech
 *
 */
public class FailureExamples extends AbstractMockingTest implements ExtendedMockito {
	static class SomeBean {
		int val1;

		/**
		 * @return the val1
		 */
		public int getVal1() {
			return val1;
		}

		/**
		 * @param val1
		 *            the val1 to set
		 */
		public void setVal1(int val1) {
			this.val1 = val1;
		}

	}

	static interface ExampleService {
		String doAThingWithSomeParameters(String arg1, Set<String> arg2, List<String> arg3, SomeBean arg4);
	}
	
	/* (non-Javadoc)
	 * @see com.github.aro_tech.extended_mockito.AbstractMockingTest#makeMock()
	 */
	@Override
	protected TestInterface makeMock() {
		return mock(TestInterface.class);
	}

	private ExampleService expecting = mock(ExampleService.class);

	/**
	 * Wanted but not invoked:
exampleService.doAThingWithSomeParameters(
    {String containing all of: [Butcher,Baker,Candlestick Maker]},
    [All items matching the given Predicate],
    [One or more items matching the given Predicate],
    SomeBean where val1 > 5
);
	 */
	@Test
	public void failingToMatchWithMultipleParameters() {
		verify(expecting).doAThingWithSomeParameters(this.containsAllOf("Butcher", "Baker", "Candlestick Maker"),
				allSetItemsMatch(s -> s.startsWith("A")),
				oneOrMoreListItemsMatch(s -> s.startsWith("B")),
				objectMatches((SomeBean o) -> o.getVal1() > 5, "SomeBean where val1 > 5"));
	}
	
	@Test
	public void failingToMatchDoubleWithDesc() {
		verify(makeMock()).doAThingWithADouble(doubleMatches(d -> Math.abs(d - Math.PI) < 0.1, "Approximately PI"));
	}	
	
	@Test
	public void failingToMatchDoubleWithoutDesc() {
		verify(makeMock()).doAThingWithADouble(doubleMatches(d -> Math.abs(d - Math.PI) < 0.1));
	}	

	@Test
	public void failingToMatchFloatWithDesc() {
		verify(makeMock()).doAThingWithAFloat(floatMatches(d -> Math.abs(d - Math.PI) < 0.1, "Approximately PI"));
	}	
	
	@Test
	public void failingToMatchFloatWithoutDesc() {
		verify(makeMock()).doAThingWithAFloat(floatMatches(d -> Math.abs(d - Math.PI) < 0.1));
	}	

	@Test
	public void failingToMatchLongWithDesc() {
		verify(makeMock()).doAThingWithALong(longMatches(i -> i >= 0, "Non-negative"));
	}	
	
	@Test
	public void failingToMatchLongWithoutDesc() {
		verify(makeMock()).doAThingWithALong(longMatches(i -> i >= 0));
	}	

	@Test
	public void failingToMatchIntWithDesc() {
		verify(makeMock()).doAThingWithAnInt(intMatches(i -> i >= 0, "Non-negative"));
	}	
	
	@Test
	public void failingToMatchIntWithoutDesc() {
		verify(makeMock()).doAThingWithAnInt(intMatches(i -> i >= 0));
	}	

	@Test
	public void failingToMatchShortWithDesc() {
		verify(makeMock()).doAThingWithAShort(shortMatches(i -> i >= 0, "Non-negative"));
	}	
	
	@Test
	public void failingToMatchShortWithoutDesc() {
		verify(makeMock()).doAThingWithAShort(shortMatches(i -> i >= 0));
	}	

	@Test
	public void failingToMatchByteWithDesc() {
		verify(makeMock()).doAThingWithAByte(byteMatches(i -> (i & 0xA) == 0, "No bits set in mask"));
	}	
	
	@Test
	public void failingToMatchByteWithoutDesc() {
		verify(makeMock()).doAThingWithAByte(byteMatches(i -> (i & 0xA) == 0));
	}	

	@Test
	public void failingToMatchBasedOnToStringContainingOneOrMoreItems() {
		verify(makeMock()).doAThingWithATestBean(toStringContainsOneOrMoreOf("A","B"));
	}	

	@Test
	public void failingToMatchBasedOnToStringContainingAll() {
		verify(makeMock()).doAThingWithATestBean(toStringContainsAllOf("A","C","G","T"));
	}	

	@Test
	public void failingToMatchMap() {
		verify(makeMock()).doAThingWithAMap(mapThat(m -> true));
	}	
	
	@Test
	public void failingToMatchMapWithDescription() {
		verify(makeMock()).doAThingWithAMap(mapThat(m -> true, "whatever"));
	}	


}
