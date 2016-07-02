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
public class FailureExamples implements ExtendedMockito {
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
	public void failingToMatch() {
		verify(expecting).doAThingWithSomeParameters(this.containsAllOf("Butcher", "Baker", "Candlestick Maker"),
				allSetItemsMatch(s -> s.startsWith("A")),
				oneOrMoreListItemsMatch(s -> s.startsWith("B")),
				objectMatches((SomeBean o) -> o.getVal1() > 5, "SomeBean where val1 > 5"));
	}
}
