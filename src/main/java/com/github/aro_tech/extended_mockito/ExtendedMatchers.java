/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.github.aro_tech.extended_mockito.util.StringUtil;

/**
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
		return argThat((argument) -> StringUtil.containsAll(argument, expectedParts));
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
		return argThat((argument) -> StringUtil.containsAll(argument, expectedParts));
	}

	/**
	 * A matcher call which matches if an argument contains at least one of the
	 * given text parts
	 * 
	 * @param expectedParts
	 * @return true if any of the expected parts match, false if none match
	 */
	default String containsOneOrMoreOf(final CharSequence... expectedParts) {
		return argThat((argument) -> StringUtil.containsOneOrMoreOf(argument, expectedParts));
	}

	/**
	 * A matcher call which matches if an argument's toString() result contains
	 * at least one of the given text
	 * 
	 * @param expectedParts
	 * @return true if any of the expected parts match, false if none match
	 */
	default <T> T toStringContainsOneOrMoreOf(final CharSequence... expectedParts) {
		return argThat((argument) -> StringUtil.containsOneOrMoreOf(argument, expectedParts));
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
		});
	}

	/**
	 * Matcher for a map argument
	 * @param predicate lambda for assessing the map argument
	 * @return null
	 */
	default <K,V> Map<K,V> mapThat(Predicate<Map<K,V>> predicate) {
		return argThat(map -> predicate.test((Map<K,V>) map));
	}
	
	
	/**
	 * A predicate-based matcher for set arguments - all items must match
	 * 
	 * @param predicate
	 * @return null
	 */
	default <T extends Object> Set<T> allSetItemsMatch(Predicate<T> predicate) {
		return argThat(arg -> ((Set<T>) arg).stream().allMatch(predicate));
	}

	/**
	 * A predicate-based matcher for set arguments - at least one of the items must match
	 * 
	 * @param predicate
	 * @return null
	 */
	default <T extends Object> Set<T> oneOrMoreSetItemsMatch(Predicate<T> predicate) {
		return argThat(arg -> ((Set<T>) arg).stream().anyMatch(predicate));
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
		return argThat((argument) -> predicate.test((T) argument));
	}

	/**
	 * A predicate-based matcher for primitive int arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default int intMatches(Predicate<Integer> predicate) {
		return intThat((argument) -> predicate.test((int) argument));
	}

	/**
	 * A predicate-based matcher for primitive double arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default double doubleMatches(Predicate<Double> predicate) {
		return doubleThat((argument) -> predicate.test((double) argument));
	}

	/**
	 * A predicate-based matcher for primitive float arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default float floatMatches(Predicate<Float> predicate) {
		return floatThat((argument) -> predicate.test((float) argument));
	}

	/**
	 * A predicate-based matcher for primitive short arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default short shortMatches(Predicate<Short> predicate) {
		return shortThat((argument) -> predicate.test((short) argument));
	}

	/**
	 * A predicate-based matcher for primitive long arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default long longMatches(Predicate<Long> predicate) {
		return longThat((argument) -> predicate.test((long) argument));
	}

	/**
	 * A predicate-based matcher for primitive byte arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default byte byteMatches(Predicate<Byte> predicate) {
		return byteThat((argument) -> predicate.test((byte) argument));
	}

	/**
	 * A predicate-based matcher for primitive char arguments
	 * 
	 * @param predicate
	 *            A lambda to evaluate a method argument
	 * @return 0
	 */
	default char charMatches(Predicate<Character> predicate) {
		return charThat((argument) -> predicate.test((char) argument));
	}

	/**
	 * Match based on exact toString() of the argument
	 * 
	 * @param expectedToString
	 * @return null
	 */
	default <T> T hasToString(String expectedToString) {
		return argThat((argument) -> null != argument && argument.toString().equals(expectedToString));
	}

}
