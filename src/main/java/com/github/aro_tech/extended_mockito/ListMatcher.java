package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.stream.Stream;

import org.mockito.ArgumentMatcher;

/**
 * Mockito ArgumentMatcher for lists of objects
 * 
 * Override this abstract class, implementing evaluateStream() to do custom list
 * matching.
 * 
 * @author aro_tech
 *
 * @param <T>
 */
public abstract class ListMatcher<T> implements ArgumentMatcher<List<T>> {

	
	
	/* (non-Javadoc)
	 * @see org.mockito.ArgumentMatcher#matches(java.lang.Object)
	 */
	@Override
	public boolean matches(List<T> argument) {
		if (null == argument) {
			return false;
		}
		Stream<T> stream = listToStream(argument);
		return evaluateStream(stream);
	}
	
	

	protected abstract boolean evaluateStream(Stream<T> stream);

	private Stream<T> listToStream(List<T> argument) {
		return argument.stream();
	}
}
