/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.github.aro_tech.extended_mockito.wrappers.AssertJ;

/**
 * Unit tests verifying the functionality extending Mockito
 * 
 * @author aro_tech
 *
 */
public class ExtendedMockitoTest implements ExtendedMockito, AssertJ {

	private static interface TestInterface {
		public boolean doAThingWithAString(String arg);

		public boolean doAThingWithAList(List<String> arg);
	}

	private TestInterface mock = mock(TestInterface.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void containsAllOf_can_match_string_containing_one_thing() {
		when(mock.doAThingWithAString(containsAllOf("I ere I"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isTrue();
	}

	@Test
	public void containsAllOf_can_match_string_containing_several_things() {
		when(mock.doAThingWithAString(containsAllOf("I ere I", " Elba", "was I"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isTrue();
	}

	@Test
	public void containsAllOf_can_fail_to_match_string_containing_several_things_where_one_does_not_match() {
		when(mock.doAThingWithAString(containsAllOf("I ere I", " Elbow", "was I"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isFalse();
	}

	@Test
	public void containsAllOf_can_fail_to_match_string_with_null() {
		when(mock.doAThingWithAString(containsAllOf((String) null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isFalse();
	}

	@Test
	public void containsAllOf_can_fail_to_match_string_with_null_in_varargs() {
		when(mock.doAThingWithAString(containsAllOf("I", null, "saw"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isFalse();
	}

	@Test
	public void containsAllOf_can_fail_to_match_null() {
		when(mock.doAThingWithAString(containsAllOf("something"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString(null)).isFalse();
	}

	@Test
	public void containsOneOrMoreOf_can_match_string_containing_one_thing() {
		when(mock.doAThingWithAString(containsOneOrMoreOf("I ere I"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isTrue();
	}

	@Test
	public void containsOneOrMoreOf_can_match_string_containing_multiple_parts() {
		when(mock.doAThingWithAString(containsOneOrMoreOf("Not here", "I ere I", "I and I", "Elbow")))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isTrue();
	}

	@Test
	public void containsOneOrMoreOf_can_fail_to_match_null() {
		when(mock.doAThingWithAString(containsOneOrMoreOf("something"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString(null)).isFalse();
	}

	@Test
	public void containsOneOrMoreOf_can_fail_to_match_string_with_null() {
		when(mock.doAThingWithAString(containsOneOrMoreOf((String) null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Able was I ere I saw Elba")).isFalse();
	}

	@Test
	public void allItemsMatch_can_match_list_containing_one_thing() {
		when(mock.doAThingWithAList(allItemsMatch((str) -> true))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
			}
		})).isTrue();
	}

	@Test
	public void allItemsMatch_can_match_list_containing_several_things() {
		when(mock.doAThingWithAList(allItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("item3");
			}
		})).isTrue();
	}

	@Test
	public void allItemsMatch_can_fail_to_match_list_containing_several_things() {
		when(mock.doAThingWithAList(allItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("not item3");
			}
		})).isFalse();
	}

	@Test
	public void oneOrMoreItemsMatch_can_match_list_containing_several_things() {
		when(mock.doAThingWithAList(oneOrMoreItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("not item3");
			}
		})).isTrue();
	}

	@Test
	public void oneOrMoreItemsMatch_can_fail_to_match_list_containing_several_things() {
		when(mock.doAThingWithAList(oneOrMoreItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("not item1");
				this.add("not item2");
				this.add("not item3");
			}
		})).isFalse();
	}
	
	@Test
	public void oneOrMoreItemsMatch_can_handle_null() {
		when(mock.doAThingWithAList(oneOrMoreItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}
	
	@Test
	public void allMoreItemsMatch_can_handle_null() {
		when(mock.doAThingWithAList(allItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}
}
