/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import org.mockito.ArgumentCaptor;

/**
 * Mixin interface which includes Mockito plus added functionalities
 * 
 * @author aro_tech
 *
 */
public interface ExtendedMockito extends MockitoMixin, ExtendedMatchers, Injector {

	/**
	 * Convenience method for creating an ArgumentCaptor for the given type
	 * 
	 * @param clazz
	 * @return
	 */
	default <U, S extends U> ArgumentCaptor<U> captorOf(Class<S> clazz) {
		return ArgumentCaptor.forClass(clazz);
	}
}
