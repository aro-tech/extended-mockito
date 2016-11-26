package com.github.aro_tech.extended_mockito;

import java.util.Collection; 
import java.util.List; 
import java.util.Map; 
import java.util.Set; 
import org.mockito.ArgumentMatcher; 
import org.mockito.ArgumentMatchers; 

/** 
 * Wrapper of static elements in org.mockito.ArgumentMatchers
 * Generated by Interface-It: https://github.com/aro-tech/interface-it
 * {@link org.mockito.ArgumentMatchers}
 */
public interface MatchersMixin {


    // CONSTANTS: 


    // DELEGATE METHODS: 

    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.any()
     * {@link org.mockito.ArgumentMatchers#any()}
     */
    default <T> T any() {
        return ArgumentMatchers.any();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.any(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#any(java.lang.Class)}
     */
    default <T> T any(Class<T> type) {
        return ArgumentMatchers.any(type);
    }



    /**
     * Delegate call to public static boolean org.mockito.ArgumentMatchers.anyBoolean()
     * {@link org.mockito.ArgumentMatchers#anyBoolean()}
     */
    default boolean anyBoolean() {
        return ArgumentMatchers.anyBoolean();
    }



    /**
     * Delegate call to public static byte org.mockito.ArgumentMatchers.anyByte()
     * {@link org.mockito.ArgumentMatchers#anyByte()}
     */
    default byte anyByte() {
        return ArgumentMatchers.anyByte();
    }



    /**
     * Delegate call to public static char org.mockito.ArgumentMatchers.anyChar()
     * {@link org.mockito.ArgumentMatchers#anyChar()}
     */
    default char anyChar() {
        return ArgumentMatchers.anyChar();
    }



    /**
     * Delegate call to public static <T> java.util.Collection<T> org.mockito.ArgumentMatchers.anyCollection()
     * {@link org.mockito.ArgumentMatchers#anyCollection()}
     */
    default <T> Collection<T> anyCollection() {
        return ArgumentMatchers.anyCollection();
    }



    /**
     * Delegate call to public static <T> java.util.Collection<T> org.mockito.ArgumentMatchers.anyCollectionOf(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#anyCollectionOf(java.lang.Class)}
     */
    default <T> Collection<T> anyCollectionOf(Class<T> clazz) {
        return ArgumentMatchers.anyCollectionOf(clazz);
    }



    /**
     * Delegate call to public static double org.mockito.ArgumentMatchers.anyDouble()
     * {@link org.mockito.ArgumentMatchers#anyDouble()}
     */
    default double anyDouble() {
        return ArgumentMatchers.anyDouble();
    }



    /**
     * Delegate call to public static float org.mockito.ArgumentMatchers.anyFloat()
     * {@link org.mockito.ArgumentMatchers#anyFloat()}
     */
    default float anyFloat() {
        return ArgumentMatchers.anyFloat();
    }



    /**
     * Delegate call to public static int org.mockito.ArgumentMatchers.anyInt()
     * {@link org.mockito.ArgumentMatchers#anyInt()}
     */
    default int anyInt() {
        return ArgumentMatchers.anyInt();
    }



    /**
     * Delegate call to public static <T> java.lang.Iterable<T> org.mockito.ArgumentMatchers.anyIterable()
     * {@link org.mockito.ArgumentMatchers#anyIterable()}
     */
    default <T> Iterable<T> anyIterable() {
        return ArgumentMatchers.anyIterable();
    }



    /**
     * Delegate call to public static <T> java.lang.Iterable<T> org.mockito.ArgumentMatchers.anyIterableOf(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#anyIterableOf(java.lang.Class)}
     */
    default <T> Iterable<T> anyIterableOf(Class<T> clazz) {
        return ArgumentMatchers.anyIterableOf(clazz);
    }



    /**
     * Delegate call to public static <T> java.util.List<T> org.mockito.ArgumentMatchers.anyList()
     * {@link org.mockito.ArgumentMatchers#anyList()}
     */
    default <T> List<T> anyList() {
        return ArgumentMatchers.anyList();
    }



    /**
     * Delegate call to public static <T> java.util.List<T> org.mockito.ArgumentMatchers.anyListOf(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#anyListOf(java.lang.Class)}
     */
    default <T> List<T> anyListOf(Class<T> clazz) {
        return ArgumentMatchers.anyListOf(clazz);
    }



    /**
     * Delegate call to public static long org.mockito.ArgumentMatchers.anyLong()
     * {@link org.mockito.ArgumentMatchers#anyLong()}
     */
    default long anyLong() {
        return ArgumentMatchers.anyLong();
    }



    /**
     * Delegate call to public static <K,V> java.util.Map<K, V> org.mockito.ArgumentMatchers.anyMap()
     * {@link org.mockito.ArgumentMatchers#anyMap()}
     */
    default <K,V> Map<K, V> anyMap() {
        return ArgumentMatchers.anyMap();
    }



    /**
     * Delegate call to public static <K,V> java.util.Map<K, V> org.mockito.ArgumentMatchers.anyMapOf(java.lang.Class<K>,java.lang.Class<V>)
     * {@link org.mockito.ArgumentMatchers#anyMapOf(java.lang.Class,java.lang.Class)}
     */
    default <K,V> Map<K, V> anyMapOf(Class<K> keyClazz, Class<V> valueClazz) {
        return ArgumentMatchers.anyMapOf(keyClazz, valueClazz);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.anyObject()
     * {@link org.mockito.ArgumentMatchers#anyObject()}
     */
    @Deprecated
    default <T> T anyObject() {
        return ArgumentMatchers.anyObject();
    }



    /**
     * Delegate call to public static <T> java.util.Set<T> org.mockito.ArgumentMatchers.anySet()
     * {@link org.mockito.ArgumentMatchers#anySet()}
     */
    default <T> Set<T> anySet() {
        return ArgumentMatchers.anySet();
    }



    /**
     * Delegate call to public static <T> java.util.Set<T> org.mockito.ArgumentMatchers.anySetOf(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#anySetOf(java.lang.Class)}
     */
    default <T> Set<T> anySetOf(Class<T> clazz) {
        return ArgumentMatchers.anySetOf(clazz);
    }



    /**
     * Delegate call to public static short org.mockito.ArgumentMatchers.anyShort()
     * {@link org.mockito.ArgumentMatchers#anyShort()}
     */
    default short anyShort() {
        return ArgumentMatchers.anyShort();
    }



    /**
     * Delegate call to public static java.lang.String org.mockito.ArgumentMatchers.anyString()
     * {@link org.mockito.ArgumentMatchers#anyString()}
     */
    default String anyString() {
        return ArgumentMatchers.anyString();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.anyVararg()
     * {@link org.mockito.ArgumentMatchers#anyVararg()}
     */
    @Deprecated
    default <T> T anyVararg() {
        return ArgumentMatchers.anyVararg();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.argThat(org.mockito.ArgumentMatcher<T>)
     * {@link org.mockito.ArgumentMatchers#argThat(org.mockito.ArgumentMatcher)}
     */
    default <T> T argThat(ArgumentMatcher<T> matcher) {
        return ArgumentMatchers.argThat(matcher);
    }



    /**
     * Delegate call to public static boolean org.mockito.ArgumentMatchers.booleanThat(org.mockito.ArgumentMatcher<java.lang.Boolean>)
     * {@link org.mockito.ArgumentMatchers#booleanThat(org.mockito.ArgumentMatcher)}
     */
    default boolean booleanThat(ArgumentMatcher<Boolean> matcher) {
        return ArgumentMatchers.booleanThat(matcher);
    }



    /**
     * Delegate call to public static byte org.mockito.ArgumentMatchers.byteThat(org.mockito.ArgumentMatcher<java.lang.Byte>)
     * {@link org.mockito.ArgumentMatchers#byteThat(org.mockito.ArgumentMatcher)}
     */
    default byte byteThat(ArgumentMatcher<Byte> matcher) {
        return ArgumentMatchers.byteThat(matcher);
    }



    /**
     * Delegate call to public static char org.mockito.ArgumentMatchers.charThat(org.mockito.ArgumentMatcher<java.lang.Character>)
     * {@link org.mockito.ArgumentMatchers#charThat(org.mockito.ArgumentMatcher)}
     */
    default char charThat(ArgumentMatcher<Character> matcher) {
        return ArgumentMatchers.charThat(matcher);
    }



    /**
     * Delegate call to public static java.lang.String org.mockito.ArgumentMatchers.contains(java.lang.String)
     * {@link org.mockito.ArgumentMatchers#contains(java.lang.String)}
     */
    default String contains(String substring) {
        return ArgumentMatchers.contains(substring);
    }



    /**
     * Delegate call to public static double org.mockito.ArgumentMatchers.doubleThat(org.mockito.ArgumentMatcher<java.lang.Double>)
     * {@link org.mockito.ArgumentMatchers#doubleThat(org.mockito.ArgumentMatcher)}
     */
    default double doubleThat(ArgumentMatcher<Double> matcher) {
        return ArgumentMatchers.doubleThat(matcher);
    }



    /**
     * Delegate call to public static java.lang.String org.mockito.ArgumentMatchers.endsWith(java.lang.String)
     * {@link org.mockito.ArgumentMatchers#endsWith(java.lang.String)}
     */
    default String endsWith(String suffix) {
        return ArgumentMatchers.endsWith(suffix);
    }



    /**
     * Delegate call to public static boolean org.mockito.ArgumentMatchers.eq(boolean)
     * {@link org.mockito.ArgumentMatchers#eq(boolean)}
     */
    default boolean eq(boolean value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static byte org.mockito.ArgumentMatchers.eq(byte)
     * {@link org.mockito.ArgumentMatchers#eq(byte)}
     */
    default byte eq(byte value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static char org.mockito.ArgumentMatchers.eq(char)
     * {@link org.mockito.ArgumentMatchers#eq(char)}
     */
    default char eq(char value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static double org.mockito.ArgumentMatchers.eq(double)
     * {@link org.mockito.ArgumentMatchers#eq(double)}
     */
    default double eq(double value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static float org.mockito.ArgumentMatchers.eq(float)
     * {@link org.mockito.ArgumentMatchers#eq(float)}
     */
    default float eq(float value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static int org.mockito.ArgumentMatchers.eq(int)
     * {@link org.mockito.ArgumentMatchers#eq(int)}
     */
    default int eq(int value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static long org.mockito.ArgumentMatchers.eq(long)
     * {@link org.mockito.ArgumentMatchers#eq(long)}
     */
    default long eq(long value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static short org.mockito.ArgumentMatchers.eq(short)
     * {@link org.mockito.ArgumentMatchers#eq(short)}
     */
    default short eq(short value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.eq(T)
     * {@link org.mockito.ArgumentMatchers#eq(java.lang.Object)}
     */
    default <T> T eq(T value) {
        return ArgumentMatchers.eq(value);
    }



    /**
     * Delegate call to public static float org.mockito.ArgumentMatchers.floatThat(org.mockito.ArgumentMatcher<java.lang.Float>)
     * {@link org.mockito.ArgumentMatchers#floatThat(org.mockito.ArgumentMatcher)}
     */
    default float floatThat(ArgumentMatcher<Float> matcher) {
        return ArgumentMatchers.floatThat(matcher);
    }



    /**
     * Delegate call to public static int org.mockito.ArgumentMatchers.intThat(org.mockito.ArgumentMatcher<java.lang.Integer>)
     * {@link org.mockito.ArgumentMatchers#intThat(org.mockito.ArgumentMatcher)}
     */
    default int intThat(ArgumentMatcher<Integer> matcher) {
        return ArgumentMatchers.intThat(matcher);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.isA(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#isA(java.lang.Class)}
     */
    default <T> T isA(Class<T> type) {
        return ArgumentMatchers.isA(type);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.isNotNull()
     * {@link org.mockito.ArgumentMatchers#isNotNull()}
     */
    default <T> T isNotNull() {
        return ArgumentMatchers.isNotNull();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.isNotNull(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#isNotNull(java.lang.Class)}
     */
    default <T> T isNotNull(Class<T> clazz) {
        return ArgumentMatchers.isNotNull(clazz);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.isNull()
     * {@link org.mockito.ArgumentMatchers#isNull()}
     */
    default <T> T isNull() {
        return ArgumentMatchers.isNull();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.isNull(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#isNull(java.lang.Class)}
     */
    default <T> T isNull(Class<T> clazz) {
        return ArgumentMatchers.isNull(clazz);
    }



    /**
     * Delegate call to public static long org.mockito.ArgumentMatchers.longThat(org.mockito.ArgumentMatcher<java.lang.Long>)
     * {@link org.mockito.ArgumentMatchers#longThat(org.mockito.ArgumentMatcher)}
     */
    default long longThat(ArgumentMatcher<Long> matcher) {
        return ArgumentMatchers.longThat(matcher);
    }



    /**
     * Delegate call to public static java.lang.String org.mockito.ArgumentMatchers.matches(java.lang.String)
     * {@link org.mockito.ArgumentMatchers#matches(java.lang.String)}
     */
    default String matches(String regex) {
        return ArgumentMatchers.matches(regex);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.notNull()
     * {@link org.mockito.ArgumentMatchers#notNull()}
     */
    default <T> T notNull() {
        return ArgumentMatchers.notNull();
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.notNull(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#notNull(java.lang.Class)}
     */
    default <T> T notNull(Class<T> clazz) {
        return ArgumentMatchers.notNull(clazz);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.nullable(java.lang.Class<T>)
     * {@link org.mockito.ArgumentMatchers#nullable(java.lang.Class)}
     */
    default <T> T nullable(Class<T> clazz) {
        return ArgumentMatchers.nullable(clazz);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.refEq(T,java.lang.String...)
     * {@link org.mockito.ArgumentMatchers#refEq(java.lang.Object,java.lang.String[])}
     */
    default <T> T refEq(T value, String... excludeFields) {
        return ArgumentMatchers.refEq(value, excludeFields);
    }



    /**
     * Delegate call to public static <T> T org.mockito.ArgumentMatchers.same(T)
     * {@link org.mockito.ArgumentMatchers#same(java.lang.Object)}
     */
    default <T> T same(T value) {
        return ArgumentMatchers.same(value);
    }



    /**
     * Delegate call to public static short org.mockito.ArgumentMatchers.shortThat(org.mockito.ArgumentMatcher<java.lang.Short>)
     * {@link org.mockito.ArgumentMatchers#shortThat(org.mockito.ArgumentMatcher)}
     */
    default short shortThat(ArgumentMatcher<Short> matcher) {
        return ArgumentMatchers.shortThat(matcher);
    }



    /**
     * Delegate call to public static java.lang.String org.mockito.ArgumentMatchers.startsWith(java.lang.String)
     * {@link org.mockito.ArgumentMatchers#startsWith(java.lang.String)}
     */
    default String startsWith(String prefix) {
        return ArgumentMatchers.startsWith(prefix);
    }



}