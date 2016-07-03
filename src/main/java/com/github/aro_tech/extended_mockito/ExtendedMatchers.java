/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.mockito.ArgumentMatcher;

import com.github.aro_tech.extended_mockito.util.StringUtil;

/**
 * Matcher methods which go beyond what Mockito provides
 * 
 * @author aro_tech
 *
 */
public interface ExtendedMatchers extends MatchersMixin {

	/**
	 * A matcher call which matches if an argument contains all the given text
	 * 
	 * @param expectedParts
	 * @return true if all the expected parts match
	 */
	default String containsAllOf(final CharSequence... expectedParts) {
		return argThat(new ArgumentMatcher<String>() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(String argument) {
				return StringUtil.containsAll(argument, expectedParts);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "{String containing all of: " + StringUtil.charSequenceArrayToString(expectedParts) + "}";
			}
		});
	}

	/**
	 * A matcher call which matches if an argument's toString() result contains
	 * all of the given text
	 * 
	 * @param expectedParts
	 * @return true if all of the expected parts match, false if one does not
	 *         match
	 */
	default <T> T toStringContainsAllOf(final CharSequence... expectedParts) {
		return argThat(new ArgumentMatcher<T>() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(T argument) {
				return StringUtil.containsAll(argument, expectedParts);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "{Object with toString() containing all of: "
						+ StringUtil.charSequenceArrayToString(expectedParts) + "}";
			}
		});
	}

	/**
	 * A matcher call which matches if an argument contains at least one of the
	 * given text parts
	 * 
	 * @param expectedParts
	 * @return true if any of the expected parts match, false if none match
	 */
	default String containsOneOrMoreOf(final CharSequence... expectedParts) {
		return argThat(new ArgumentMatcher<String>() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(String argument) {
				return StringUtil.containsOneOrMoreOf(argument, expectedParts);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "{String containing one or more of: " + StringUtil.charSequenceArrayToString(expectedParts)
						+ "}";
			}
		});
	}

	/**
	 * A matcher call which matches if an argument's toString() result contains
	 * at least one of the given text
	 * 
	 * @param expectedParts
	 * @return true if any of the expected parts match, false if none match
	 */
	default <T> T toStringContainsOneOrMoreOf(final CharSequence... expectedParts) {
		return argThat(new ArgumentMatcher<T>() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(T argument) {
				return StringUtil.containsOneOrMoreOf(argument, expectedParts);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "{Object with toString() containing one or more of: "
						+ StringUtil.charSequenceArrayToString(expectedParts) + "}";
			}
		});
	}

	/**
	 * A predicate-based matcher for list arguments - all items must match
	 * 
	 * @param predicate
	 * @return null
	 */
	default <T extends Object> List<T> allListItemsMatch(Predicate<T> predicate) {
		return argThat(new ListMatcher<T>() {
			@Override
			protected boolean evaluateStream(Stream<T> stream) {
				return stream.allMatch(predicate);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "[All items matching the given Predicate]";
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
	default <T extends Object> List<T> oneOrMoreListItemsMatch(Predicate<T> predicate) {
		return argThat(new ListMatcher<T>() {
			@Override
			protected boolean evaluateStream(Stream<T> stream) {
				return stream.anyMatch(predicate);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "[One or more items matching the given Predicate]";
			}
		});
	}

	/**
	 * Lenient-order list matcher For a match, the list argument encountered by
	 * the mock must contain exactly the items provided (no more, no fewer), but
	 * any order is acceptable
	 * 
	 * @param items
	 *            List of exact items expected (in any order)
	 * @return null
	 */
	default <T extends Object> List<T> listContainsExactlyInAnyOrder(T... items) {
		return argThat(new LenientOrderListMatcher<>(items));
	}

	/**
	 * Matcher for a map argument
	 * 
	 * @param predicate
	 *            lambda for assessing the map argument
	 * @return null
	 */
	default <K, V> Map<K, V> mapThat(Predicate<Map<K, V>> predicate) {
		// return argThat(map -> predicate.test((Map<K, V>) map));
		return argThat(new ArgumentMatcher<Map<K, V>>() {

			@Override
			public boolean matches(Map<K, V> argument) {
				return predicate.test(argument);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "[Map matching the given Predicate]";
			}
		});
	}

	/**
	 * Matcher for a map argument
	 * 
	 * @param predicate
	 *            lambda for assessing the map argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return null
	 */
	default <K, V> Map<K, V> mapThat(Predicate<Map<K, V>> predicate, final String description) {
		// return argThat(map -> predicate.test((Map<K, V>) map));
		return argThat(new ArgumentMatcher<Map<K, V>>() {

			@Override
			public boolean matches(Map<K, V> argument) {
				return predicate.test(argument);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
			}
		});
	}

	/**
	 * A predicate-based matcher for set arguments - all items must match
	 * 
	 * @param predicate
	 * @return null
	 */
	default <T extends Object> Set<T> allSetItemsMatch(Predicate<T> predicate) {
		return argThat(new ArgumentMatcher<Set<T>>() {

			@Override
			public boolean matches(Set<T> argument) {
				return argument.stream().allMatch(predicate);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "[All items matching the given Predicate]";
			}
		});
	}

	/**
	 * A predicate-based matcher for set arguments - at least one of the items
	 * must match
	 * 
	 * @param predicate
	 * @return null
	 */
	default <T extends Object> Set<T> oneOrMoreSetItemsMatch(Predicate<T> predicate) {
		return argThat(new ArgumentMatcher<Set<T>>() {

			@Override
			public boolean matches(Set<T> argument) {
				return argument.stream().anyMatch(predicate);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "[One or more items matching the given Predicate]";
			}
		});
	}

	/**
	 * A predicate-based matcher for object arguments
	 * 
	 * Effectively, it's equivalent to argThat(), but objectMatches can accept a
	 * Predicate instance which can be reused in a variable outside of Mockito,
	 * whereas argThat can accept as its argument a lambda, but not a Predicate.
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
		return objectMatches(predicate, "{object matching the given predicate}");//argThat((argument) -> predicate.test((T) argument));
	}

	/**
	 * A predicate-based matcher for object arguments
	 * 
	 * Effectively, it's equivalent to argThat(), but objectMatches can accept a
	 * Predicate instance which can be reused in a variable outside of Mockito,
	 * whereas argThat can accept as its argument a lambda, but not a Predicate.
	 * 
	 * DO NOT USE THIS FOR PRIMITIVE ARGUMENTS such as int, double, etc.
	 * 
	 * Use intMatches, doubleMatches, etc. instead, because Mockito doesn't
	 * always handle autoboxing well
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Will appear in verify() failure messages
	 * @return null
	 */
	default <T> T objectMatches(Predicate<T> predicate, String description) {
		return argThat(new ArgumentMatcher<T>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Object argument) {
				return predicate.test((T) argument);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return intMatches(predicate, "<int matching the given predicate>");
	}

	/**
	 * A predicate-based matcher for primitive int arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default int intMatches(Predicate<Integer> predicate, final String description) {
		return intThat(new ArgumentMatcher<Integer>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Integer argument) {
				return null != argument && predicate.test(argument.intValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return doubleMatches(predicate, "<double matching the given predicate>");
	}

	/**
	 * A predicate-based matcher for primitive double arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default double doubleMatches(Predicate<Double> predicate, final String description) {
		return doubleThat(new ArgumentMatcher<Double>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Double argument) {
				return null != argument && predicate.test(argument.doubleValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return floatMatches(predicate, "<float matching the given predicate>");
	}

	/**
	 * A predicate-based matcher for primitive float arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default float floatMatches(Predicate<Float> predicate, final String description) {
		return floatThat(new ArgumentMatcher<Float>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Float argument) {
				return null != argument && predicate.test(argument.floatValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return shortMatches(predicate, "<short matching the given predicate>");

	}

	/**
	 * A predicate-based matcher for primitive short arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default short shortMatches(Predicate<Short> predicate, final String description) {
		return shortThat(new ArgumentMatcher<Short>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Short argument) {
				return null != argument && predicate.test(argument.shortValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return longMatches(predicate, "<long matching the given predicate>");
	}

	/**
	 * A predicate-based matcher for primitive long arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default long longMatches(Predicate<Long> predicate, final String description) {
		return longThat(new ArgumentMatcher<Long>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Long argument) {
				return null != argument && predicate.test(argument.longValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return byteMatches(predicate, "<byte matching the given predicate>");
	}

	/**
	 * A predicate-based matcher for primitive byte arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default byte byteMatches(Predicate<Byte> predicate, final String description) {
		return byteThat(new ArgumentMatcher<Byte>() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Byte argument) {
				return null != argument && predicate.test(argument.byteValue());
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
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
		return charMatches(predicate, "<char matching the given predicate>");
	}
	
	/**
	 * A predicate-based matcher for primitive char arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @param description
	 *            Description of expected argument - will appear in verify()
	 *            failures
	 * @return 0
	 */
	default char charMatches(Predicate<Character> predicate, final String description) {
		return charThat(new ArgumentMatcher<Character>() {

			/* (non-Javadoc)
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(Character argument) {
				return null != argument && predicate.test(argument);
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return description;
			}
		});
	}


	/**
	 * Match based on exact toString() of the argument
	 * 
	 * @param expectedToString
	 * @return null
	 */
	default <T> T hasToString(String expectedToString) {
		// return argThat((argument) -> null != argument &&
		// argument.toString().equals(expectedToString));
		return argThat(new ArgumentMatcher<T>() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
			 */
			@Override
			public boolean matches(T argument) {
				return null != argument && argument.toString().equals(expectedToString);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "{" + expectedToString + "}";
			}

		});
	}

}
