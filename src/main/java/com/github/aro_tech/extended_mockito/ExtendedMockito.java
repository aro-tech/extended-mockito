/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.mockito.ArgumentMatcher;

/**
 * Mixin interface which includes all of Mockito plus added functionalities
 * 
 * @author aro_tech
 *
 */
public interface ExtendedMockito extends MockitoMixin {

	/**
	 * A matcher call which matches if an argument contains all the given text
	 * 
	 * @param expectedParts
	 * @return true if all the expected parts match
	 */
	default String containsAllOf(final String... expectedParts) {
		return argThat(new ArgumentMatcher<String>() {

			@Override
			public boolean matches(Object argument) {
				if (null == expectedParts || null == argument) {
					return false;
				}
				return contains(argument.toString(), expectedParts);
			}

			private boolean contains(String toCheck, String... args) {
				for (CharSequence arg : args) {
					if (null == arg) {
						return false;
					}
					if (!toCheck.contains(arg)) {
						return false;
					}
				}
				return true;
			}
		});
	}

	/**
	 * A matcher call which matches if an argument contains at least one of the
	 * given text
	 * 
	 * @param expectedParts
	 * @return true if any of the expected parts match, false if none match
	 */
	default String containsOneOrMoreOf(final String... expectedParts) {
		return argThat(new ArgumentMatcher<String>() {

			@Override
			public boolean matches(Object argument) {
				if (null == expectedParts || null == argument) {
					return false;
				}
				return containsOneOf(argument.toString(), expectedParts);
			}

			private boolean containsOneOf(String toCheck, String... args) {
				for (CharSequence arg : args) {
					if (null == arg) {
						return false;
					}
					if (toCheck.contains(arg)) {
						return true;
					}
				}
				return false;
			}
		});
	}

	/**
	 * A predicate-based matcher for list arguments - all items must match
	 * 
	 * @param predicate
	 * @return result of argThat() call
	 */
	default <T extends Object> List<T> allItemsMatch(Predicate<T> predicate) {
		return argThat(new ListMatcher<T>() {
			@Override
			protected boolean evaluateStream(Stream<T> stream) {
				return stream.allMatch(predicate);
			}
		});
	}

	/**
	 * A predicate-based matcher for list arguments - at least one item must
	 * match
	 * 
	 * @param predicate
	 * @return result of argThat() call
	 */
	default <T extends Object> List<T> oneOrMoreItemsMatch(Predicate<T> predicate) {
		return argThat(new ListMatcher<T>() {
			@Override
			protected boolean evaluateStream(Stream<T> stream) {
				return stream.anyMatch(predicate);
			}
		});
	}

}
