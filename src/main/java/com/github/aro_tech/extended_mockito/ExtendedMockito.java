/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import org.mockito.Mockito;
import org.mockito.stubbing.VoidMethodStubbable;

/**
 * Mixin interface which includes Mockito plus added functionalities
 * 
 * @author aro_tech
 *
 */
public interface ExtendedMockito extends MockitoMixin, ExtendedMatchers {
    /**
     * Delegate call to public static <T> org.mockito.stubbing.VoidMethodStubbable<T> org.mockito.Mockito.stubVoid(T)
     * 
     * Overridden here as deprecated because in the auto-generated MockitoMixin class it's not annotated as deprecated.
     * That's because in Mockito itself the method is not properly annotated as deprecated.
     * 
     * {@link org.mockito.Mockito#stubVoid(java.lang.Object)}
     * @deprecated Use {@link ExtendedMockito#doThrow(Throwable...)} method for stubbing voids
     */
	@Override
	@Deprecated
    default <T> VoidMethodStubbable<T> stubVoid(T mock) {
        return Mockito.stubVoid(mock);
    }
}
