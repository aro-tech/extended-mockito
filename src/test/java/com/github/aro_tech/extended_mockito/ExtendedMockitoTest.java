/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.github.aro_tech.extended_mockito.wrappers.AssertJ;

/**
 * @author aro_tech
 *
 */
public class ExtendedMockitoTest implements ExtendedMockito, AssertJ {

	static interface Thingy {
		boolean doAThingWithAString(String str);
	}
	
	private Thingy mock = mock(Thingy.class);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void can_capture_arguments() {
		ArgumentCaptor<String> captor = captorOf(String.class);
		when(mock.doAThingWithAString(captor.capture())).thenReturn(true);
		
		assertThat(mock.doAThingWithAString("hello")).isTrue();
		assertThat(captor.getValue()).isEqualTo("hello");
	}

}
