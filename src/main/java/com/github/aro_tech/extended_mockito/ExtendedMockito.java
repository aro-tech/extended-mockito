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
					if (null != arg && toCheck.contains(arg)) {
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
	 * @return null
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
	 *            A lambda to evaluate a method argument
	 * @return null
	 */
	default <T extends Object> List<T> oneOrMoreItemsMatch(Predicate<T> predicate) {
		return argThat(new ListMatcher<T>() {
			@Override
			protected boolean evaluateStream(Stream<T> stream) {
				return stream.anyMatch(predicate);
			}
		});
	}

	/**
	 * A predicate-based matcher for object arguments
	 * 
	 * DO NOT USE THIS FOR PRIMITIVE ARGUMENTS such as int, double, etc.
	 * 
	 * Use intMatches, doubleMatches, etc. instead, because Mockito doesn't
	 * always handle autoboxing well
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return null
	 */
	default <T> T objectMatches(Predicate<T> predicate) {
		return argThat(new ArgumentMatcher<T>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((T) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive int arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default int intMatches(Predicate<Integer> predicate) {
		return intThat(new ArgumentMatcher<Integer>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((Integer) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive double arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default double doubleMatches(Predicate<Double> predicate) {
		return doubleThat(new ArgumentMatcher<Double>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((Double) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive float arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default float floatMatches(Predicate<Float> predicate) {
		return floatThat(new ArgumentMatcher<Float>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((Float) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive short arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default short shortMatches(Predicate<Short> predicate) {
		return shortThat(new ArgumentMatcher<Short>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((short) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive long arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default long longMatches(Predicate<Long> predicate) {
		return longThat(new ArgumentMatcher<Long>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((long) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive byte arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default byte byteMatches(Predicate<Byte> predicate) {
		return byteThat(new ArgumentMatcher<Byte>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((byte) argument);
			}
		});
	}

	/**
	 * A predicate-based matcher for primitive char arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default char charMatches(Predicate<Character> predicate) {
		return charThat(new ArgumentMatcher<Character>() {
			@Override
			public boolean matches(Object argument) {
				return predicate.test((char) argument);
			}
		});
	}
}
