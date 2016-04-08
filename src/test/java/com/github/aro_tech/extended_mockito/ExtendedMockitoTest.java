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

		public boolean doAThingWithAnInt(int arg);

		public boolean doAThingWithALong(long arg);

		public boolean doAThingWithADouble(double arg);

		public boolean doAThingWithAFloat(float arg);

		public boolean doAThingWithAByte(byte arg);

		public boolean doAThingWithAChar(char arg);

		public boolean doAThingWithAShort(short arg);

		public boolean doAThingWithATestBean(TestBean arg);

	}

	private static class TestBean {
		String toStr;

		/**
		 * 
		 * Constructor
		 * 
		 * @param toStr
		 *            The value which will appear in toString()
		 */
		public TestBean(String toStr) {
			this.toStr = toStr;
		}

		@Override
		public String toString() {
			return toStr;
		}
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
	public void containsOneOrMoreOf_can_fail_to_match() {
		when(mock.doAThingWithAString(containsOneOrMoreOf("something", "anything"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("nothing")).isFalse();
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
	public void allItemsMatch_can_handle_null() {
		when(mock.doAThingWithAList(allItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void objectMatches_can_match() {
		when(mock.doAThingWithAString(objectMatches((str) -> str.length() < 3))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Hi")).isTrue();
	}

	@Test
	public void objectMatches_can_fail_to_match() {
		when(mock.doAThingWithAString(objectMatches((str) -> str.equals("Bye")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Hi")).isFalse();
	}

	@Test(expected = NullPointerException.class)
	public void objectMatches_throws_NPE_on_null_predicate() {
		when(mock.doAThingWithAString(objectMatches(null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Hi")).isFalse();
	}

	@Test
	public void can_match_int() {
		when(mock.doAThingWithAnInt(intMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAnInt(111)).isTrue();
	}

	@Test
	public void can_fail_to_match_int() {
		when(mock.doAThingWithAnInt(intMatches((val) -> val < 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAnInt(111)).isFalse();
	}

	@Test
	public void can_match_double() {
		when(mock.doAThingWithADouble(doubleMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithADouble(111.1)).isTrue();
	}

	@Test
	public void can_fail_to_match_double() {
		when(mock.doAThingWithADouble(doubleMatches((val) -> val < Math.PI))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithADouble(111.1)).isFalse();
	}

	@Test
	public void can_match_float() {
		when(mock.doAThingWithAFloat(floatMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAFloat(111.1F)).isTrue();
	}

	@Test
	public void can_fail_to_match_float() {
		when(mock.doAThingWithAFloat(floatMatches((val) -> val < Math.PI))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAFloat(111.1F)).isFalse();
	}

	@Test
	public void can_match_short() {
		when(mock.doAThingWithAShort(shortMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAShort((short) 111)).isTrue();
	}

	@Test
	public void can_fail_to_match_short() {
		when(mock.doAThingWithAShort(shortMatches((val) -> val < 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAShort((short) 111)).isFalse();
	}

	@Test
	public void can_match_long() {
		when(mock.doAThingWithALong(longMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithALong(111L)).isTrue();
	}

	@Test
	public void can_fail_to_match_long() {
		when(mock.doAThingWithALong(longMatches((val) -> val < 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithALong(111L)).isFalse();
	}

	@Test
	public void can_match_byte() {
		when(mock.doAThingWithAByte(byteMatches((val) -> val > 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAByte((byte) 111)).isTrue();
	}

	@Test
	public void can_fail_to_match_byte() {
		when(mock.doAThingWithAByte(byteMatches((val) -> val < 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAByte((byte) 111)).isFalse();
	}

	@Test
	public void can_match_char() {
		when(mock.doAThingWithAChar(charMatches((val) -> Character.isAlphabetic(val.charValue()))))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAChar('c')).isTrue();
	}

	@Test
	public void can_fail_to_match_char() {
		when(mock.doAThingWithAChar(charMatches((val) -> Character.isAlphabetic(val.charValue()))))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAChar('#')).isFalse();
	}

	@Test
	public void can_match_based_on_exact_tostring() {
		TestBean bean = new TestBean("able was i ere i saw elba");
		when(mock.doAThingWithATestBean(hasToString(bean.toString()))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isTrue();
		verify(mock).doAThingWithATestBean(hasToString(bean.toString()));
	}

	@Test
	public void can_fail_to_match_based_on_exact_tostring() {
		TestBean bean = new TestBean("able was i ere i saw elba");
		when(mock.doAThingWithATestBean(hasToString("i ere i"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isFalse();
		verify(mock, never()).doAThingWithATestBean(hasToString("i ere i"));
		verify(mock).doAThingWithATestBean(hasToString(bean.toString()));
	}

	@Test
	public void can_fail_to_match_based_on_exact_tostring_with_null() {
		when(mock.doAThingWithATestBean(hasToString("i ere i"))).thenReturn(Boolean.FALSE);
		assertThat(mock.doAThingWithATestBean(null)).isFalse();
		verify(mock, never()).doAThingWithATestBean(hasToString("i ere i"));
	}

	@Test
	public void can_match_non_string_bean_containing_several_things() {
		TestBean bean = new TestBean("Able was I ere I saw Elba");
		when(mock.doAThingWithATestBean(toStringContainsAllOf("I ere I", " Elba", "was I")))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isTrue();
	}

	@Test
	public void can_match_non_string_bean_containing_one_of_several_things() {
		TestBean bean = new TestBean("Able was I ere I saw Elba");
		when(mock.doAThingWithATestBean(toStringContainsOneOrMoreOf("I ere I", " Elbow", "Fuzzy Wuzzy was a bear")))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isTrue();
	}

}
