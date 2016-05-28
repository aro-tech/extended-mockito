/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mockito.ArgumentMatcher;

/**
 * Mockito argument matcher for order-insensitive list matching
 * @author aro_tech
 *
 */
public class LenientOrderListMatcher<T>  implements ArgumentMatcher<List<T>> {

	private final T[] items;
	
	/**
	 * Constructor
	 * @param items
	 */
	@SafeVarargs
	LenientOrderListMatcher(T... items) {
		super();
		this.items = items;
	}
	
	/**
	 * Match for any list containing the same items, in any order
	 */
	@Override
	public boolean matches(Object argument) {

		if (null != argument) {
			List<T> receivedList = (List<T>) argument;
			if (null == items) { // strange case of un-casted null in varargs
				return receivedListContainsOneNullItem(receivedList);
			}
			if (items.length == receivedList.size()) {
				return containsSameItemsInAnyOrder(receivedList, items);
			}
		}
		return false;
	}

	private <T> boolean containsSameItemsInAnyOrder(List<T> receivedList, T... items) {
		Set<T> expected = new HashSet<>(Arrays.asList(items));
		for (T received : receivedList) {
			if (!expected.contains(received)) {
				return false;
			}
		}
		return true;
	}

	private <T> boolean receivedListContainsOneNullItem(List<T> receivedList) {
		if (receivedList.size() == 1 && null == receivedList.get(0)) {
			return true; // matches because we're expecting a
							// list with exactly 1 item, which is null
		}
		return false;
	}

}
