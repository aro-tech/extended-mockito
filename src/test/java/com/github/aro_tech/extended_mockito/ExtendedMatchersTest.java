/**
 * 
 */
package com.github.aro_tech.extended_mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.github.aro_tech.extended_mockito.wrappers.AssertJ;

/**
 * Unit tests verifying the functionality extending Mockito
 * 
 * @author aro_tech
 *
 */
public class ExtendedMatchersTest extends AbstractMockingTest implements ExtendedMockito, AssertJ {

	/* (non-Javadoc)
	 * @see com.github.aro_tech.extended_mockito.AbstractMockingTest#makeMock()
	 */
	@Override
	protected TestInterface makeMock() {
		return mock(TestInterface.class);
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
	public void allListItemsMatch_can_match_list_containing_one_thing() {
		when(mock.doAThingWithAList(allListItemsMatch((str) -> true))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
			}
		})).isTrue();
	}

	@Test
	public void allSetItemsMatch_can_match_set_containing_one_thing() {
		when(mock.doAThingWithASet(allSetItemsMatch((str) -> str.startsWith("foo")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football"))).isTrue();
	}

	@Test
	public void allSetItemsMatch_can_match_set_containing_several_things() {
		when(mock.doAThingWithASet(allSetItemsMatch((str) -> str.startsWith("foo")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football", "foolish", "food"))).isTrue();
	}

	@Test
	public void allSetItemsMatch_can_fail_to_match_set_containing_several_things() {
		when(mock.doAThingWithASet(allSetItemsMatch((str) -> str.startsWith("foo")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football", "baseball", "food"))).isFalse();
	}

	@Test
	public void allSetItemsMatch_can_handle_null() {
		when(mock.doAThingWithASet(allSetItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void oneOrMoreSetItemsMatch_can_match_set_containing_one_thing() {
		when(mock.doAThingWithASet(oneOrMoreSetItemsMatch((str) -> str.startsWith("foo")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football"))).isTrue();
	}

	@Test
	public void oneOrMoreSetItemsMatch_can_match_set_containing_several_things() {
		when(mock.doAThingWithASet(oneOrMoreSetItemsMatch((str) -> str.startsWith("foo")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football", "baseball", "basketball"))).isTrue();
	}

	@Test
	public void oneOrMoreSetItemsMatch_can_fail_to_match_set_containing_several_things() {
		when(mock.doAThingWithASet(oneOrMoreSetItemsMatch((str) -> str.startsWith("golf")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithASet(setOf("football", "baseball", "basketball"))).isFalse();
	}

	@Test
	public void oneOrMoreSetItemsMatch_can_handle_null() {
		when(mock.doAThingWithASet(oneOrMoreSetItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void allListItemsMatch_can_match_list_containing_several_things() {
		when(mock.doAThingWithAList(allListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("item3");
			}
		})).isTrue();
	}

	@Test
	public void allListItemsMatch_can_fail_to_match_list_containing_several_things() {
		when(mock.doAThingWithAList(allListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("not item3");
			}
		})).isFalse();
	}

	@Test
	public void oneOrMoreListItemsMatch_can_match_list_containing_several_things() {
		when(mock.doAThingWithAList(oneOrMoreListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("item1");
				this.add("item2");
				this.add("not item3");
			}
		})).isTrue();
	}
	
	@Test
	public void oneOrMoreListItemsMatch_can_fail_to_match_list_containing_several_things() {
		when(mock.doAThingWithAList(oneOrMoreListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<String>() {
			{
				this.add("not item1");
				this.add("not item2");
				this.add("not item3");
			}
		})).isFalse();
	}

	@Test
	public void oneOrMoreListItemsMatch_can_handle_null() {
		when(mock.doAThingWithAList(oneOrMoreListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void allListItemsMatch_can_handle_null() {
		when(mock.doAThingWithAList(allListItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void objectMatches_can_match() {
		when(mock.doAThingWithAString(objectMatches((str) -> str.length() < 3))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAString("Hi")).isTrue();
	}

	@Test
	public void objectMatches_can_match_with_description() {
		when(mock.doAThingWithAString(objectMatches((str) -> str.length() < 3, "A short String"))).thenReturn(Boolean.TRUE);
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
	public void can_match_int_with_desc() {
		when(mock.doAThingWithAnInt(intMatches((val) -> val > 100, ">100"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAnInt(111)).isTrue();
	}

	
	@Test
	public void can_fail_to_match_int() {
		when(mock.doAThingWithAnInt(intMatches((val) -> val < 100))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAnInt(111)).isFalse();
	}

	@Test
	public void can_fail_to_match_int_with_desc() {
		when(mock.doAThingWithAnInt(intMatches((val) -> val < 100, ">100"))).thenReturn(Boolean.TRUE);
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
	public void can_match_double_with_desc() {
		when(mock.doAThingWithADouble(doubleMatches((val) -> val > 100, ">100"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithADouble(111.1)).isTrue();
	}

	@Test
	public void can_fail_to_match_double_with_desc() {
		when(mock.doAThingWithADouble(doubleMatches((val) -> val < Math.PI, "<PI"))).thenReturn(Boolean.TRUE);
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
	public void can_match_float_with_desc() {
		when(mock.doAThingWithAFloat(floatMatches((val) -> val > 100, ">100"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAFloat(111.1F)).isTrue();
	}

	@Test
	public void can_fail_to_match_float_with_desc() {
		when(mock.doAThingWithAFloat(floatMatches((val) -> val < Math.PI,"<PI"))).thenReturn(Boolean.TRUE);
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
	public void can_match_short_with_desc() {
		when(mock.doAThingWithAShort(shortMatches((val) -> val > 100, ">100"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAShort((short) 111)).isTrue();
	}

	@Test
	public void can_fail_to_match_short_with_desc() {
		when(mock.doAThingWithAShort(shortMatches((val) -> val < 100, "<100"))).thenReturn(Boolean.TRUE);
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
	public void can_match_long_with_desc() {
		when(mock.doAThingWithALong(longMatches((val) -> val > 100,">100"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithALong(111L)).isTrue();
	}

	@Test
	public void can_fail_to_match_long_with_desc() {
		when(mock.doAThingWithALong(longMatches((val) -> val < 100,"<100"))).thenReturn(Boolean.TRUE);
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
		when(mock.doAThingWithATestBean(toStringContainsAllOf("I ere I", " Elba", "was I"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isTrue();
	}

	@Test
	public void can_match_non_string_bean_containing_one_of_several_things() {
		TestBean bean = new TestBean("Able was I ere I saw Elba");
		when(mock.doAThingWithATestBean(toStringContainsOneOrMoreOf("I ere I", " Elbow", "Fuzzy Wuzzy was a bear")))
				.thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithATestBean(bean)).isTrue();
	}	
	
	@Test
	public void can_match_map_item() {
		when(mock.doAThingWithAMap(mapThat(map -> map.containsKey("foo")))).thenReturn(true);
		assertThat(mock.doAThingWithAMap(mapOf(entry("foot", "ball"), entry("foo", "bar")))).isTrue();
	}

	@Test
	public void can_match_map_item_with_desc() {
		when(mock.doAThingWithAMap(mapThat(map -> map.containsKey("foo"), "Map containing foo"))).thenReturn(true);
		assertThat(mock.doAThingWithAMap(mapOf(entry("foot", "ball"), entry("foo", "bar")))).isTrue();
	}

	
	@Test
	public void can_match_exact_list_content_with_lenient_order() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder("A", "B", "C", "D"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(Arrays.asList("A", "B", "C", "D"))).isTrue();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A", "B"))).isTrue();
		assertThat(mock.doAThingWithAList(Arrays.asList("B", "C", "A", "D"))).isTrue();
	}

	@Test
	public void can_fail_to_match_exact_list_content_with_lenient_order() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder("A", "B", "C", "D"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(Arrays.asList("A", "B", "C", "D", "E"))).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A"))).isFalse();
		assertThat(mock.doAThingWithAList(new ArrayList<>())).isFalse();
	}

	@Test
	public void can_fail_to_match_exact_list_content_with_lenient_order_using_null() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder("A", "B", "C", "D"))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(null)).isFalse();
	}

	@Test
	public void listContainsExactlyInAnyOrder_can_expect_empty_list() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder())).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<>())).isTrue();
		assertThat(mock.doAThingWithAList(null)).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A"))).isFalse();
	}

	@Test
	public void listContainsExactlyInAnyOrder_can_handle_multiple_null_expected_item() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder(null, null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<>())).isFalse();
		assertThat(mock.doAThingWithAList(null)).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A"))).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList(null, null))).isTrue();
	}

	@Test
	public void listContainsExactlyInAnyOrder_can_handle_single_null_expected_item() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder((String) null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<>())).isFalse();
		assertThat(mock.doAThingWithAList(null)).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A"))).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList(null, null))).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList((String) null))).isTrue();
	}

	/**
	 * Strange case where the Java compiler interprets varargs as a null array
	 * instead of an array with one null item
	 * The expected behavior should be the same as if it's an array with one null item
	 */
	@Test
	public void listContainsExactlyInAnyOrder_can_handle_single_null_expected_item_without_cast() {
		when(mock.doAThingWithAList(listContainsExactlyInAnyOrder(null))).thenReturn(Boolean.TRUE);
		assertThat(mock.doAThingWithAList(new ArrayList<>())).isFalse();
		assertThat(mock.doAThingWithAList(null)).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList("C", "D", "A"))).isFalse();
		assertThat(mock.doAThingWithAList(Arrays.asList((String) null))).isTrue();
	}

	protected Set<String> setOf(String... items) {
		Set<String> set = new HashSet<>();
		set.addAll(Arrays.asList(items));
		return set;
	}

	protected Entry<String, TestBean> entry(String key, String val) {
		return new Entry<String, ExtendedMatchersTest.TestBean>() {
			@Override
			public TestBean setValue(TestBean value) {
				return value;
			}

			@Override
			public TestBean getValue() {
				return new TestBean(val);
			}

			@Override
			public String getKey() {
				return key;
			}
		};
	}

	protected Map<String, TestBean> mapOf(Entry<String, TestBean>... entries) {
		Map<String, TestBean> map = new HashMap<>();
		for (Entry<String, TestBean> entry : entries) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
}
