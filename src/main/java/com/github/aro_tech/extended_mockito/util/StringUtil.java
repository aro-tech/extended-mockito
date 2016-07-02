/**
 * 
 */
package com.github.aro_tech.extended_mockito.util;

/**
 * Low-level String comparison operations without external dependencies
 * 
 * @author aro_tech
 *
 */
public class StringUtil {

	/**
	 * Check whether whole contains all of the given parts
	 * @param whole object to be converted to a String, if not null, for comparison 
	 * @param parts test part to search within whole
	 * @return true if all parts are found in whole
	 */
	public static boolean containsAll(Object whole, CharSequence... parts) {
		if (anyIsNull(whole, parts)) {
			return false;
		}

		for (CharSequence part : parts) {
			if (null == part) {
				return false;
			}
			if (!whole.toString().contains(part)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check whether whole contains at least one of the given parts
	 * @param whole object to be converted to a String, if not null, for comparison 
	 * @param parts test part to search within whole
	 * @return true if one or more parts is found in whole
	 */
	public static boolean containsOneOrMoreOf(Object whole, CharSequence... parts) {
		if (anyIsNull(whole, parts)) {
			return false;
		}
		for (CharSequence part : parts) {
			if (null != part && whole.toString().contains(part)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Pretty print an array of CharSequence items
	 * @param seq
	 * @return Comma-delimited list
	 */
	public static String charSequenceArrayToString(CharSequence...seq) {
		if(null == seq) {
			return "null";
		}
		return "[" + String.join(",", seq) + "]";
	}
	
	/**
	 * Pretty print an array of objects of type T
	 * @param seq
	 * @return delimited list
	 */
	public static <T> String arrayToString(T[] items, String delimiter) {
		if(null == items) {
			return "null";
		}
		StringBuilder buf = new StringBuilder();
		for(T cur: items) {
			if(buf.length() > 0) {
				buf.append(delimiter);
			}
			buf.append(cur.toString());
		}
		
		return buf.toString();
	}
	
	private static boolean anyIsNull(Object...args) {
		for(Object arg: args) {
			if(null == arg) {
				return true;
			}
		}
		return false;
	}
}
