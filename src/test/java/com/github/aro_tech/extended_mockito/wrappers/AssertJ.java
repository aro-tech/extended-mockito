package com.github.aro_tech.extended_mockito.wrappers;

import java.io.File; 
import java.io.IOException; 
import java.io.InputStream; 
import java.math.BigDecimal; 
import java.math.BigInteger; 
import java.net.URI; 
import java.net.URL; 
import java.nio.charset.Charset; 
import java.nio.file.Path; 
import java.text.DateFormat; 
import java.time.Instant; 
import java.time.LocalDate; 
import java.time.LocalDateTime; 
import java.time.LocalTime; 
import java.time.OffsetDateTime; 
import java.time.OffsetTime; 
import java.time.ZonedDateTime; 
import java.time.temporal.TemporalUnit; 
import java.util.Date; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Map; 
import java.util.Optional; 
import java.util.OptionalDouble; 
import java.util.OptionalInt; 
import java.util.OptionalLong; 
import java.util.concurrent.CompletableFuture; 
import java.util.concurrent.CompletionStage; 
import java.util.concurrent.Future; 
import java.util.concurrent.atomic.AtomicBoolean; 
import java.util.concurrent.atomic.AtomicInteger; 
import java.util.concurrent.atomic.AtomicIntegerArray; 
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater; 
import java.util.concurrent.atomic.AtomicLong; 
import java.util.concurrent.atomic.AtomicLongArray; 
import java.util.concurrent.atomic.AtomicLongFieldUpdater; 
import java.util.concurrent.atomic.AtomicMarkableReference; 
import java.util.concurrent.atomic.AtomicReference; 
import java.util.concurrent.atomic.AtomicReferenceArray; 
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater; 
import java.util.concurrent.atomic.AtomicStampedReference; 
import java.util.function.DoublePredicate; 
import java.util.function.Function; 
import java.util.function.IntPredicate; 
import java.util.function.LongPredicate; 
import java.util.function.Predicate; 
import java.util.stream.DoubleStream; 
import java.util.stream.IntStream; 
import java.util.stream.LongStream; 
import java.util.stream.Stream; 
import org.assertj.core.api.AbstractAssert; 
import org.assertj.core.api.AbstractBigDecimalAssert; 
import org.assertj.core.api.AbstractBigIntegerAssert; 
import org.assertj.core.api.AbstractBooleanArrayAssert; 
import org.assertj.core.api.AbstractBooleanAssert; 
import org.assertj.core.api.AbstractByteArrayAssert; 
import org.assertj.core.api.AbstractByteAssert; 
import org.assertj.core.api.AbstractCharArrayAssert; 
import org.assertj.core.api.AbstractCharSequenceAssert; 
import org.assertj.core.api.AbstractCharacterAssert; 
import org.assertj.core.api.AbstractComparableAssert; 
import org.assertj.core.api.AbstractDateAssert; 
import org.assertj.core.api.AbstractDoubleArrayAssert; 
import org.assertj.core.api.AbstractDoubleAssert; 
import org.assertj.core.api.AbstractFileAssert; 
import org.assertj.core.api.AbstractFloatArrayAssert; 
import org.assertj.core.api.AbstractFloatAssert; 
import org.assertj.core.api.AbstractInputStreamAssert; 
import org.assertj.core.api.AbstractInstantAssert; 
import org.assertj.core.api.AbstractIntArrayAssert; 
import org.assertj.core.api.AbstractIntegerAssert; 
import org.assertj.core.api.AbstractLocalDateAssert; 
import org.assertj.core.api.AbstractLocalDateTimeAssert; 
import org.assertj.core.api.AbstractLocalTimeAssert; 
import org.assertj.core.api.AbstractLongArrayAssert; 
import org.assertj.core.api.AbstractLongAssert; 
import org.assertj.core.api.AbstractOffsetDateTimeAssert; 
import org.assertj.core.api.AbstractOffsetTimeAssert; 
import org.assertj.core.api.AbstractPathAssert; 
import org.assertj.core.api.AbstractShortArrayAssert; 
import org.assertj.core.api.AbstractShortAssert; 
import org.assertj.core.api.AbstractThrowableAssert; 
import org.assertj.core.api.AbstractUriAssert; 
import org.assertj.core.api.AbstractUrlAssert; 
import org.assertj.core.api.AbstractZonedDateTimeAssert; 
import org.assertj.core.api.AssertDelegateTarget; 
import org.assertj.core.api.AssertFactory; 
import org.assertj.core.api.AssertProvider; 
import org.assertj.core.api.Assertions; 
import org.assertj.core.api.AtomicBooleanAssert; 
import org.assertj.core.api.AtomicIntegerArrayAssert; 
import org.assertj.core.api.AtomicIntegerAssert; 
import org.assertj.core.api.AtomicIntegerFieldUpdaterAssert; 
import org.assertj.core.api.AtomicLongArrayAssert; 
import org.assertj.core.api.AtomicLongAssert; 
import org.assertj.core.api.AtomicLongFieldUpdaterAssert; 
import org.assertj.core.api.AtomicMarkableReferenceAssert; 
import org.assertj.core.api.AtomicReferenceArrayAssert; 
import org.assertj.core.api.AtomicReferenceAssert; 
import org.assertj.core.api.AtomicReferenceFieldUpdaterAssert; 
import org.assertj.core.api.AtomicStampedReferenceAssert; 
import org.assertj.core.api.ClassAssert; 
import org.assertj.core.api.ClassBasedNavigableIterableAssert; 
import org.assertj.core.api.ClassBasedNavigableListAssert; 
import org.assertj.core.api.CompletableFutureAssert; 
import org.assertj.core.api.Condition; 
import org.assertj.core.api.DoublePredicateAssert; 
import org.assertj.core.api.FactoryBasedNavigableIterableAssert; 
import org.assertj.core.api.FactoryBasedNavigableListAssert; 
import org.assertj.core.api.FutureAssert; 
import org.assertj.core.api.IntPredicateAssert; 
import org.assertj.core.api.IterableAssert; 
import org.assertj.core.api.ListAssert; 
import org.assertj.core.api.LongPredicateAssert; 
import org.assertj.core.api.MapAssert; 
import org.assertj.core.api.ObjectArrayAssert; 
import org.assertj.core.api.ObjectAssert; 
import org.assertj.core.api.OptionalAssert; 
import org.assertj.core.api.OptionalDoubleAssert; 
import org.assertj.core.api.OptionalIntAssert; 
import org.assertj.core.api.OptionalLongAssert; 
import org.assertj.core.api.PredicateAssert; 
import org.assertj.core.api.ThrowableAssert; 
import org.assertj.core.api.ThrowableTypeAssert; 
import org.assertj.core.api.filter.Filters; 
import org.assertj.core.api.filter.InFilter; 
import org.assertj.core.api.filter.NotFilter; 
import org.assertj.core.api.filter.NotInFilter; 
import org.assertj.core.condition.DoesNotHave; 
import org.assertj.core.condition.Not; 
import org.assertj.core.data.Index; 
import org.assertj.core.data.MapEntry; 
import org.assertj.core.data.Offset; 
import org.assertj.core.data.Percentage; 
import org.assertj.core.data.TemporalUnitOffset; 
import org.assertj.core.groups.Properties; 
import org.assertj.core.groups.Tuple; 
import org.assertj.core.presentation.Representation; 

/** 
 * Wrapper of static elements in org.assertj.core.api.Assertions
 * Generated by Interface-It: https://github.com/aro-tech/interface-it
 * {@link org.assertj.core.api.Assertions}
 */
public interface AssertJ {


    // CONSTANTS: 


    // DELEGATE METHODS: 

    /**
     * Delegate call to public static <T> org.assertj.core.api.Condition<T> org.assertj.core.api.Assertions.allOf(org.assertj.core.api.Condition<? super T>...)
     * {@link org.assertj.core.api.Assertions#allOf(org.assertj.core.api.Condition[])}
     */
    default <T> Condition<T> allOf(Condition<? super T>... conditions) {
        return Assertions.allOf(conditions);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.Condition<T> org.assertj.core.api.Assertions.allOf(java.lang.Iterable<? extends org.assertj.core.api.Condition<? super T>>)
     * {@link org.assertj.core.api.Assertions#allOf(java.lang.Iterable)}
     */
    default <T> Condition<T> allOf(Iterable<? extends Condition<? super T>> conditions) {
        return Assertions.allOf(conditions);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.Condition<T> org.assertj.core.api.Assertions.anyOf(org.assertj.core.api.Condition<? super T>...)
     * {@link org.assertj.core.api.Assertions#anyOf(org.assertj.core.api.Condition[])}
     */
    default <T> Condition<T> anyOf(Condition<? super T>... conditions) {
        return Assertions.anyOf(conditions);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.Condition<T> org.assertj.core.api.Assertions.anyOf(java.lang.Iterable<? extends org.assertj.core.api.Condition<? super T>>)
     * {@link org.assertj.core.api.Assertions#anyOf(java.lang.Iterable)}
     */
    default <T> Condition<T> anyOf(Iterable<? extends Condition<? super T>> conditions) {
        return Assertions.anyOf(conditions);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.assertThat(org.assertj.core.api.AssertProvider<T>)
     * {@link org.assertj.core.api.Assertions#assertThat(org.assertj.core.api.AssertProvider)}
     */
    default <T> T assertThat(AssertProvider<T> component) {
        return Assertions.assertThat(component);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AtomicBooleanAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicBoolean)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicBoolean)}
     */
    default AtomicBooleanAssert assertThat(AtomicBoolean actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AtomicIntegerAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicInteger)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicInteger)}
     */
    default AtomicIntegerAssert assertThat(AtomicInteger actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AtomicIntegerArrayAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicIntegerArray)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicIntegerArray)}
     */
    default AtomicIntegerArrayAssert assertThat(AtomicIntegerArray actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <OBJECT> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert<OBJECT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater<OBJECT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater)}
     */
    default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> assertThat(AtomicIntegerFieldUpdater<OBJECT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AtomicLongAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicLong)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicLong)}
     */
    default AtomicLongAssert assertThat(AtomicLong actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AtomicLongArrayAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicLongArray)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicLongArray)}
     */
    default AtomicLongArrayAssert assertThat(AtomicLongArray actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <OBJECT> org.assertj.core.api.AtomicLongFieldUpdaterAssert<OBJECT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater<OBJECT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater)}
     */
    default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> assertThat(AtomicLongFieldUpdater<OBJECT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <VALUE> org.assertj.core.api.AtomicMarkableReferenceAssert<VALUE> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicMarkableReference<VALUE>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicMarkableReference)}
     */
    default <VALUE> AtomicMarkableReferenceAssert<VALUE> assertThat(AtomicMarkableReference<VALUE> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <VALUE> org.assertj.core.api.AtomicReferenceAssert<VALUE> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicReference<VALUE>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicReference)}
     */
    default <VALUE> AtomicReferenceAssert<VALUE> assertThat(AtomicReference<VALUE> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.AtomicReferenceArrayAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicReferenceArray<ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicReferenceArray)}
     */
    default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> assertThat(AtomicReferenceArray<ELEMENT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <FIELD,OBJECT> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<OBJECT, FIELD>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater)}
     */
    default <FIELD,OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> assertThat(AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <VALUE> org.assertj.core.api.AtomicStampedReferenceAssert<VALUE> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.AtomicStampedReference<VALUE>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.AtomicStampedReference)}
     */
    default <VALUE> AtomicStampedReferenceAssert<VALUE> assertThat(AtomicStampedReference<VALUE> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractBigDecimalAssert<?> org.assertj.core.api.Assertions.assertThat(java.math.BigDecimal)
     * {@link org.assertj.core.api.Assertions#assertThat(java.math.BigDecimal)}
     */
    default AbstractBigDecimalAssert<?> assertThat(BigDecimal actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractBigIntegerAssert<?> org.assertj.core.api.Assertions.assertThat(java.math.BigInteger)
     * {@link org.assertj.core.api.Assertions#assertThat(java.math.BigInteger)}
     */
    default AbstractBigIntegerAssert<?> assertThat(BigInteger actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractBooleanAssert<?> org.assertj.core.api.Assertions.assertThat(boolean)
     * {@link org.assertj.core.api.Assertions#assertThat(boolean)}
     */
    default AbstractBooleanAssert<?> assertThat(boolean actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractBooleanAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Boolean)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Boolean)}
     */
    default AbstractBooleanAssert<?> assertThat(Boolean actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractBooleanArrayAssert<?> org.assertj.core.api.Assertions.assertThat(boolean[])
     * {@link org.assertj.core.api.Assertions#assertThat(boolean[])}
     */
    default AbstractBooleanArrayAssert<?> assertThat(boolean[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractByteAssert<?> org.assertj.core.api.Assertions.assertThat(byte)
     * {@link org.assertj.core.api.Assertions#assertThat(byte)}
     */
    default AbstractByteAssert<?> assertThat(byte actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractByteAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Byte)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Byte)}
     */
    default AbstractByteAssert<?> assertThat(Byte actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractByteArrayAssert<?> org.assertj.core.api.Assertions.assertThat(byte[])
     * {@link org.assertj.core.api.Assertions#assertThat(byte[])}
     */
    default AbstractByteArrayAssert<?> assertThat(byte[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharacterAssert<?> org.assertj.core.api.Assertions.assertThat(char)
     * {@link org.assertj.core.api.Assertions#assertThat(char)}
     */
    default AbstractCharacterAssert<?> assertThat(char actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharArrayAssert<?> org.assertj.core.api.Assertions.assertThat(char[])
     * {@link org.assertj.core.api.Assertions#assertThat(char[])}
     */
    default AbstractCharArrayAssert<?> assertThat(char[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharacterAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Character)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Character)}
     */
    default AbstractCharacterAssert<?> assertThat(Character actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharSequenceAssert<?, ? extends java.lang.CharSequence> org.assertj.core.api.Assertions.assertThat(java.lang.CharSequence)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.CharSequence)}
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(CharSequence actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.ClassAssert org.assertj.core.api.Assertions.assertThat(java.lang.Class<?>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Class)}
     */
    default ClassAssert assertThat(Class<?> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <RESULT> org.assertj.core.api.CompletableFutureAssert<RESULT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.CompletableFuture<RESULT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.CompletableFuture)}
     */
    default <RESULT> CompletableFutureAssert<RESULT> assertThat(CompletableFuture<RESULT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <RESULT> org.assertj.core.api.CompletableFutureAssert<RESULT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.CompletionStage<RESULT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.CompletionStage)}
     */
    default <RESULT> CompletableFutureAssert<RESULT> assertThat(CompletionStage<RESULT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractDateAssert<?> org.assertj.core.api.Assertions.assertThat(java.util.Date)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Date)}
     */
    default AbstractDateAssert<?> assertThat(Date actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractDoubleAssert<?> org.assertj.core.api.Assertions.assertThat(double)
     * {@link org.assertj.core.api.Assertions#assertThat(double)}
     */
    default AbstractDoubleAssert<?> assertThat(double actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractDoubleAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Double)}
     */
    default AbstractDoubleAssert<?> assertThat(Double actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractDoubleArrayAssert<?> org.assertj.core.api.Assertions.assertThat(double[])
     * {@link org.assertj.core.api.Assertions#assertThat(double[])}
     */
    default AbstractDoubleArrayAssert<?> assertThat(double[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.DoublePredicateAssert org.assertj.core.api.Assertions.assertThat(java.util.function.DoublePredicate)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.function.DoublePredicate)}
     */
    default DoublePredicateAssert assertThat(DoublePredicate actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.ListAssert<java.lang.Double> org.assertj.core.api.Assertions.assertThat(java.util.stream.DoubleStream)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.stream.DoubleStream)}
     */
    default ListAssert<Double> assertThat(DoubleStream actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractFileAssert<?> org.assertj.core.api.Assertions.assertThat(java.io.File)
     * {@link org.assertj.core.api.Assertions#assertThat(java.io.File)}
     */
    default AbstractFileAssert<?> assertThat(File actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractFloatAssert<?> org.assertj.core.api.Assertions.assertThat(float)
     * {@link org.assertj.core.api.Assertions#assertThat(float)}
     */
    default AbstractFloatAssert<?> assertThat(float actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractFloatAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Float)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Float)}
     */
    default AbstractFloatAssert<?> assertThat(Float actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractFloatArrayAssert<?> org.assertj.core.api.Assertions.assertThat(float[])
     * {@link org.assertj.core.api.Assertions#assertThat(float[])}
     */
    default AbstractFloatArrayAssert<?> assertThat(float[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <RESULT> org.assertj.core.api.FutureAssert<RESULT> org.assertj.core.api.Assertions.assertThat(java.util.concurrent.Future<RESULT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.Future)}
     */
    default <RESULT> FutureAssert<RESULT> assertThat(Future<RESULT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractInputStreamAssert<?, ? extends java.io.InputStream> org.assertj.core.api.Assertions.assertThat(java.io.InputStream)
     * {@link org.assertj.core.api.Assertions#assertThat(java.io.InputStream)}
     */
    default AbstractInputStreamAssert<?, ? extends InputStream> assertThat(InputStream actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractInstantAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.Instant)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.Instant)}
     */
    default AbstractInstantAssert<?> assertThat(Instant actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractIntegerAssert<?> org.assertj.core.api.Assertions.assertThat(int)
     * {@link org.assertj.core.api.Assertions#assertThat(int)}
     */
    default AbstractIntegerAssert<?> assertThat(int actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractIntArrayAssert<?> org.assertj.core.api.Assertions.assertThat(int[])
     * {@link org.assertj.core.api.Assertions#assertThat(int[])}
     */
    default AbstractIntArrayAssert<?> assertThat(int[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractIntegerAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Integer)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Integer)}
     */
    default AbstractIntegerAssert<?> assertThat(Integer actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.IntPredicateAssert org.assertj.core.api.Assertions.assertThat(java.util.function.IntPredicate)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.function.IntPredicate)}
     */
    default IntPredicateAssert assertThat(IntPredicate actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.ListAssert<java.lang.Integer> org.assertj.core.api.Assertions.assertThat(java.util.stream.IntStream)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.stream.IntStream)}
     */
    default ListAssert<Integer> assertThat(IntStream actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.IterableAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.lang.Iterable<? extends ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Iterable)}
     */
    default <ELEMENT> IterableAssert<ELEMENT> assertThat(Iterable<? extends ELEMENT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.IterableAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.Iterator<? extends ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Iterator)}
     */
    default <ELEMENT> IterableAssert<ELEMENT> assertThat(Iterator<? extends ELEMENT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.ListAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.List<? extends ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.List)}
     */
    default <ELEMENT> ListAssert<ELEMENT> assertThat(List<? extends ELEMENT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLocalDateAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.LocalDate)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.LocalDate)}
     */
    default AbstractLocalDateAssert<?> assertThat(LocalDate actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLocalDateTimeAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.LocalDateTime)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.LocalDateTime)}
     */
    default AbstractLocalDateTimeAssert<?> assertThat(LocalDateTime actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLocalTimeAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.LocalTime)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.LocalTime)}
     */
    default AbstractLocalTimeAssert<?> assertThat(LocalTime actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLongAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Long)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Long)}
     */
    default AbstractLongAssert<?> assertThat(Long actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLongAssert<?> org.assertj.core.api.Assertions.assertThat(long)
     * {@link org.assertj.core.api.Assertions#assertThat(long)}
     */
    default AbstractLongAssert<?> assertThat(long actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractLongArrayAssert<?> org.assertj.core.api.Assertions.assertThat(long[])
     * {@link org.assertj.core.api.Assertions#assertThat(long[])}
     */
    default AbstractLongArrayAssert<?> assertThat(long[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.LongPredicateAssert org.assertj.core.api.Assertions.assertThat(java.util.function.LongPredicate)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.function.LongPredicate)}
     */
    default LongPredicateAssert assertThat(LongPredicate actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.ListAssert<java.lang.Long> org.assertj.core.api.Assertions.assertThat(java.util.stream.LongStream)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.stream.LongStream)}
     */
    default ListAssert<Long> assertThat(LongStream actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <K,V> org.assertj.core.api.MapAssert<K, V> org.assertj.core.api.Assertions.assertThat(java.util.Map<K, V>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Map)}
     */
    default <K,V> MapAssert<K, V> assertThat(Map<K, V> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractOffsetDateTimeAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.OffsetDateTime)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.OffsetDateTime)}
     */
    default AbstractOffsetDateTimeAssert<?> assertThat(OffsetDateTime actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractOffsetTimeAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.OffsetTime)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.OffsetTime)}
     */
    default AbstractOffsetTimeAssert<?> assertThat(OffsetTime actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <VALUE> org.assertj.core.api.OptionalAssert<VALUE> org.assertj.core.api.Assertions.assertThat(java.util.Optional<VALUE>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Optional)}
     */
    default <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.OptionalDoubleAssert org.assertj.core.api.Assertions.assertThat(java.util.OptionalDouble)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.OptionalDouble)}
     */
    default OptionalDoubleAssert assertThat(OptionalDouble actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.OptionalIntAssert org.assertj.core.api.Assertions.assertThat(java.util.OptionalInt)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.OptionalInt)}
     */
    default OptionalIntAssert assertThat(OptionalInt actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.OptionalLongAssert org.assertj.core.api.Assertions.assertThat(java.util.OptionalLong)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.OptionalLong)}
     */
    default OptionalLongAssert assertThat(OptionalLong actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractPathAssert<?> org.assertj.core.api.Assertions.assertThat(java.nio.file.Path)
     * {@link org.assertj.core.api.Assertions#assertThat(java.nio.file.Path)}
     */
    default AbstractPathAssert<?> assertThat(Path actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.PredicateAssert<T> org.assertj.core.api.Assertions.assertThat(java.util.function.Predicate<T>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.function.Predicate)}
     */
    default <T> PredicateAssert<T> assertThat(Predicate<T> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractShortAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.Short)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Short)}
     */
    default AbstractShortAssert<?> assertThat(Short actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractShortAssert<?> org.assertj.core.api.Assertions.assertThat(short)
     * {@link org.assertj.core.api.Assertions#assertThat(short)}
     */
    default AbstractShortAssert<?> assertThat(short actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractShortArrayAssert<?> org.assertj.core.api.Assertions.assertThat(short[])
     * {@link org.assertj.core.api.Assertions#assertThat(short[])}
     */
    default AbstractShortArrayAssert<?> assertThat(short[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.ListAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.stream.Stream<? extends ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.stream.Stream)}
     */
    default <ELEMENT> ListAssert<ELEMENT> assertThat(Stream<? extends ELEMENT> actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharSequenceAssert<?, java.lang.String> org.assertj.core.api.Assertions.assertThat(java.lang.String)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.String)}
     */
    default AbstractCharSequenceAssert<?, String> assertThat(String actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.assertThat(T)
     * {@link org.assertj.core.api.Assertions#assertThat(org.assertj.core.api.AssertDelegateTarget)}
     */
    default <T extends AssertDelegateTarget> T assertThat(T assertion) {
        return Assertions.assertThat(assertion);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.AbstractComparableAssert<?, T> org.assertj.core.api.Assertions.assertThat(T)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Comparable)}
     */
    default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> assertThat(T assertion) {
        return Assertions.assertThat(assertion);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.ObjectAssert<T> org.assertj.core.api.Assertions.assertThat(T)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Object)}
     */
    default <T> ObjectAssert<T> assertThat(T assertion) {
        return Assertions.assertThat(assertion);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.ObjectArrayAssert<T> org.assertj.core.api.Assertions.assertThat(T[])
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Object[])}
     */
    default <T> ObjectArrayAssert<T> assertThat(T[] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractThrowableAssert<?, ? extends java.lang.Throwable> org.assertj.core.api.Assertions.assertThat(java.lang.Throwable)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Throwable)}
     */
    default AbstractThrowableAssert<?, ? extends Throwable> assertThat(Throwable actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractUriAssert<?> org.assertj.core.api.Assertions.assertThat(java.net.URI)
     * {@link org.assertj.core.api.Assertions#assertThat(java.net.URI)}
     */
    default AbstractUriAssert<?> assertThat(URI actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractUrlAssert<?> org.assertj.core.api.Assertions.assertThat(java.net.URL)
     * {@link org.assertj.core.api.Assertions#assertThat(java.net.URL)}
     */
    default AbstractUrlAssert<?> assertThat(URL actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractZonedDateTimeAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.ZonedDateTime)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.ZonedDateTime)}
     */
    default AbstractZonedDateTimeAssert<?> assertThat(ZonedDateTime actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ACTUAL,ELEMENT,ELEMENT_ASSERT> org.assertj.core.api.ClassBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> org.assertj.core.api.Assertions.assertThat(ACTUAL,java.lang.Class<ELEMENT_ASSERT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Iterable,java.lang.Class)}
     */
    default <ACTUAL extends Iterable<? extends ELEMENT>,ELEMENT,ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>> ClassBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(ACTUAL arg0, Class<ELEMENT_ASSERT> arg1) {
        return Assertions.assertThat(arg0, arg1);
    }



    /**
     * Delegate call to public static <ACTUAL,ELEMENT,ELEMENT_ASSERT> org.assertj.core.api.FactoryBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> org.assertj.core.api.Assertions.assertThat(java.lang.Iterable<? extends ELEMENT>,org.assertj.core.api.AssertFactory<ELEMENT, ELEMENT_ASSERT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Iterable,org.assertj.core.api.AssertFactory)}
     */
    default <ACTUAL extends Iterable<? extends ELEMENT>,ELEMENT,ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>> FactoryBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(Iterable<? extends ELEMENT> arg0, AssertFactory<ELEMENT, ELEMENT_ASSERT> arg1) {
        return Assertions.assertThat(arg0, arg1);
    }



    /**
     * Delegate call to public static <ACTUAL,ELEMENT,ELEMENT_ASSERT> org.assertj.core.api.FactoryBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> org.assertj.core.api.Assertions.assertThat(java.util.List<? extends ELEMENT>,org.assertj.core.api.AssertFactory<ELEMENT, ELEMENT_ASSERT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.List,org.assertj.core.api.AssertFactory)}
     */
    default <ACTUAL extends List<? extends ELEMENT>,ELEMENT,ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>> FactoryBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(List<? extends ELEMENT> arg0, AssertFactory<ELEMENT, ELEMENT_ASSERT> arg1) {
        return Assertions.assertThat(arg0, arg1);
    }



    /**
     * Delegate call to public static <ELEMENT,ACTUAL,ELEMENT_ASSERT> org.assertj.core.api.ClassBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> org.assertj.core.api.Assertions.assertThat(java.util.List<? extends ELEMENT>,java.lang.Class<ELEMENT_ASSERT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.List,java.lang.Class)}
     */
    default <ELEMENT,ACTUAL extends List<? extends ELEMENT>,ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>> ClassBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(List<? extends ELEMENT> arg0, Class<ELEMENT_ASSERT> arg1) {
        return Assertions.assertThat(arg0, arg1);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractThrowableAssert<?, ? extends java.lang.Throwable> org.assertj.core.api.Assertions.assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default AbstractThrowableAssert<?, ? extends Throwable> assertThatCode(ThrowableAssert.ThrowingCallable shouldRaiseOrNotThrowable) {
        return Assertions.assertThatCode(shouldRaiseOrNotThrowable);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.ThrowableTypeAssert<T> org.assertj.core.api.Assertions.assertThatExceptionOfType(java.lang.Class<? extends T>)
     * {@link org.assertj.core.api.Assertions#assertThatExceptionOfType(java.lang.Class)}
     */
    default <T extends Throwable> ThrowableTypeAssert<T> assertThatExceptionOfType(Class<? extends T> exceptionType) {
        return Assertions.assertThatExceptionOfType(exceptionType);
    }



    /**
     * Delegate call to public static org.assertj.core.api.ThrowableTypeAssert<java.io.IOException> org.assertj.core.api.Assertions.assertThatIOException()
     * {@link org.assertj.core.api.Assertions#assertThatIOException()}
     */
    default ThrowableTypeAssert<IOException> assertThatIOException() {
        return Assertions.assertThatIOException();
    }



    /**
     * Delegate call to public static org.assertj.core.api.ThrowableTypeAssert<java.lang.IllegalArgumentException> org.assertj.core.api.Assertions.assertThatIllegalArgumentException()
     * {@link org.assertj.core.api.Assertions#assertThatIllegalArgumentException()}
     */
    default ThrowableTypeAssert<IllegalArgumentException> assertThatIllegalArgumentException() {
        return Assertions.assertThatIllegalArgumentException();
    }



    /**
     * Delegate call to public static org.assertj.core.api.ThrowableTypeAssert<java.lang.IllegalStateException> org.assertj.core.api.Assertions.assertThatIllegalStateException()
     * {@link org.assertj.core.api.Assertions#assertThatIllegalStateException()}
     */
    default ThrowableTypeAssert<IllegalStateException> assertThatIllegalStateException() {
        return Assertions.assertThatIllegalStateException();
    }



    /**
     * Delegate call to public static org.assertj.core.api.ThrowableTypeAssert<java.lang.NullPointerException> org.assertj.core.api.Assertions.assertThatNullPointerException()
     * {@link org.assertj.core.api.Assertions#assertThatNullPointerException()}
     */
    default ThrowableTypeAssert<NullPointerException> assertThatNullPointerException() {
        return Assertions.assertThatNullPointerException();
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractThrowableAssert<?, ? extends java.lang.Throwable> org.assertj.core.api.Assertions.assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default AbstractThrowableAssert<?, ? extends Throwable> assertThatThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
        return Assertions.assertThatThrownBy(shouldRaiseThrowable);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractThrowableAssert<?, ? extends java.lang.Throwable> org.assertj.core.api.Assertions.assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable,java.lang.String,java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable,java.lang.String,java.lang.Object[])}
     */
    default AbstractThrowableAssert<?, ? extends Throwable> assertThatThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable, String description, Object... args) {
        return Assertions.assertThatThrownBy(shouldRaiseThrowable, description, args);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Index org.assertj.core.api.Assertions.atIndex(int)
     * {@link org.assertj.core.api.Assertions#atIndex(int)}
     */
    default Index atIndex(int index) {
        return Assertions.atIndex(index);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.math.BigDecimal> org.assertj.core.api.Assertions.byLessThan(java.math.BigDecimal)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.math.BigDecimal)}
     */
    default Offset<BigDecimal> byLessThan(BigDecimal value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.math.BigInteger> org.assertj.core.api.Assertions.byLessThan(java.math.BigInteger)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.math.BigInteger)}
     */
    default Offset<BigInteger> byLessThan(BigInteger value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Byte> org.assertj.core.api.Assertions.byLessThan(java.lang.Byte)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Byte)}
     */
    default Offset<Byte> byLessThan(Byte value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Double> org.assertj.core.api.Assertions.byLessThan(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Double)}
     */
    default Offset<Double> byLessThan(Double value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Float> org.assertj.core.api.Assertions.byLessThan(java.lang.Float)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Float)}
     */
    default Offset<Float> byLessThan(Float value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Integer> org.assertj.core.api.Assertions.byLessThan(java.lang.Integer)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Integer)}
     */
    default Offset<Integer> byLessThan(Integer value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Long> org.assertj.core.api.Assertions.byLessThan(java.lang.Long)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Long)}
     */
    default Offset<Long> byLessThan(Long value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Short> org.assertj.core.api.Assertions.byLessThan(java.lang.Short)
     * {@link org.assertj.core.api.Assertions#byLessThan(java.lang.Short)}
     */
    default Offset<Short> byLessThan(Short value) {
        return Assertions.byLessThan(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.TemporalUnitOffset org.assertj.core.api.Assertions.byLessThan(long,java.time.temporal.TemporalUnit)
     * {@link org.assertj.core.api.Assertions#byLessThan(long,java.time.temporal.TemporalUnit)}
     */
    default TemporalUnitOffset byLessThan(long value, TemporalUnit unit) {
        return Assertions.byLessThan(value, unit);
    }



    /**
     * Delegate call to public static java.lang.Throwable org.assertj.core.api.Assertions.catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default Throwable catchThrowable(ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
        return Assertions.catchThrowable(shouldRaiseThrowable);
    }



    /**
     * Delegate call to public static <THROWABLE> THROWABLE org.assertj.core.api.Assertions.catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable,java.lang.Class<THROWABLE>)
     * {@link org.assertj.core.api.Assertions#catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable,java.lang.Class)}
     */
    default <THROWABLE extends Throwable> THROWABLE catchThrowableOfType(ThrowableAssert.ThrowingCallable shouldRaiseThrowable, Class<THROWABLE> type) {
        return Assertions.catchThrowableOfType(shouldRaiseThrowable, type);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.io.File)
     * {@link org.assertj.core.api.Assertions#contentOf(java.io.File)}
     */
    default String contentOf(File file) {
        return Assertions.contentOf(file);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.net.URL)
     * {@link org.assertj.core.api.Assertions#contentOf(java.net.URL)}
     */
    default String contentOf(URL url) {
        return Assertions.contentOf(url);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.io.File,java.nio.charset.Charset)
     * {@link org.assertj.core.api.Assertions#contentOf(java.io.File,java.nio.charset.Charset)}
     */
    default String contentOf(File file, Charset charset) {
        return Assertions.contentOf(file, charset);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.io.File,java.lang.String)
     * {@link org.assertj.core.api.Assertions#contentOf(java.io.File,java.lang.String)}
     */
    default String contentOf(File file, String charsetName) {
        return Assertions.contentOf(file, charsetName);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.net.URL,java.nio.charset.Charset)
     * {@link org.assertj.core.api.Assertions#contentOf(java.net.URL,java.nio.charset.Charset)}
     */
    default String contentOf(URL url, Charset charset) {
        return Assertions.contentOf(url, charset);
    }



    /**
     * Delegate call to public static java.lang.String org.assertj.core.api.Assertions.contentOf(java.net.URL,java.lang.String)
     * {@link org.assertj.core.api.Assertions#contentOf(java.net.URL,java.lang.String)}
     */
    default String contentOf(URL url, String charsetName) {
        return Assertions.contentOf(url, charsetName);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.condition.DoesNotHave<T> org.assertj.core.api.Assertions.doesNotHave(org.assertj.core.api.Condition<? super T>)
     * {@link org.assertj.core.api.Assertions#doesNotHave(org.assertj.core.api.Condition)}
     */
    default <T> DoesNotHave<T> doesNotHave(Condition<? super T> condition) {
        return Assertions.doesNotHave(condition);
    }



    /**
     * Delegate call to public static <K,V> org.assertj.core.data.MapEntry<K, V> org.assertj.core.api.Assertions.entry(K,V)
     * {@link org.assertj.core.api.Assertions#entry(java.lang.Object,java.lang.Object)}
     */
    default <K,V> MapEntry<K, V> entry(K key, V value) {
        return Assertions.entry(key, value);
    }



    /**
     * Delegate call to public static org.assertj.core.groups.Properties<java.lang.Object> org.assertj.core.api.Assertions.extractProperty(java.lang.String)
     * {@link org.assertj.core.api.Assertions#extractProperty(java.lang.String)}
     */
    default Properties<Object> extractProperty(String propertyName) {
        return Assertions.extractProperty(propertyName);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.groups.Properties<T> org.assertj.core.api.Assertions.extractProperty(java.lang.String,java.lang.Class<T>)
     * {@link org.assertj.core.api.Assertions#extractProperty(java.lang.String,java.lang.Class)}
     */
    default <T> Properties<T> extractProperty(String propertyName, Class<T> propertyType) {
        return Assertions.extractProperty(propertyName, propertyType);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.fail(java.lang.String)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String)}
     */
    default void fail(String failureMessage) {
        Assertions.fail(failureMessage);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.fail(java.lang.String,java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String,java.lang.Object[])}
     */
    default void fail(String failureMessage, Object... args) {
        Assertions.fail(failureMessage, args);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.fail(java.lang.String,java.lang.Throwable)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String,java.lang.Throwable)}
     */
    default void fail(String failureMessage, Throwable realCause) {
        Assertions.fail(failureMessage, realCause);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown(java.lang.Class<? extends java.lang.Throwable>)
     * {@link org.assertj.core.api.Assertions#failBecauseExceptionWasNotThrown(java.lang.Class)}
     */
    default void failBecauseExceptionWasNotThrown(Class<? extends Throwable> throwableClass) {
        Assertions.failBecauseExceptionWasNotThrown(throwableClass);
    }



    /**
     * Delegate call to public static <E> org.assertj.core.api.filter.Filters<E> org.assertj.core.api.Assertions.filter(E[])
     * {@link org.assertj.core.api.Assertions#filter(java.lang.Object[])}
     */
    default <E> Filters<E> filter(E[] array) {
        return Assertions.filter(array);
    }



    /**
     * Delegate call to public static <E> org.assertj.core.api.filter.Filters<E> org.assertj.core.api.Assertions.filter(java.lang.Iterable<E>)
     * {@link org.assertj.core.api.Assertions#filter(java.lang.Iterable)}
     */
    default <E> Filters<E> filter(Iterable<E> iterableToFilter) {
        return Assertions.filter(iterableToFilter);
    }



    /**
     * Delegate call to public static <F,T> java.util.function.Function<F, T> org.assertj.core.api.Assertions.from(java.util.function.Function<F, T>)
     * {@link org.assertj.core.api.Assertions#from(java.util.function.Function)}
     */
    default <F,T> Function<F, T> from(Function<F, T> extractor) {
        return Assertions.from(extractor);
    }



    /**
     * Delegate call to public static org.assertj.core.api.filter.InFilter org.assertj.core.api.Assertions.in(java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#in(java.lang.Object[])}
     */
    default InFilter in(Object... values) {
        return Assertions.in(values);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.io.File)
     * {@link org.assertj.core.api.Assertions#linesOf(java.io.File)}
     */
    default List<String> linesOf(File file) {
        return Assertions.linesOf(file);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.net.URL)
     * {@link org.assertj.core.api.Assertions#linesOf(java.net.URL)}
     */
    default List<String> linesOf(URL url) {
        return Assertions.linesOf(url);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.io.File,java.nio.charset.Charset)
     * {@link org.assertj.core.api.Assertions#linesOf(java.io.File,java.nio.charset.Charset)}
     */
    default List<String> linesOf(File file, Charset charset) {
        return Assertions.linesOf(file, charset);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.io.File,java.lang.String)
     * {@link org.assertj.core.api.Assertions#linesOf(java.io.File,java.lang.String)}
     */
    default List<String> linesOf(File file, String charsetName) {
        return Assertions.linesOf(file, charsetName);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.net.URL,java.nio.charset.Charset)
     * {@link org.assertj.core.api.Assertions#linesOf(java.net.URL,java.nio.charset.Charset)}
     */
    default List<String> linesOf(URL url, Charset charset) {
        return Assertions.linesOf(url, charset);
    }



    /**
     * Delegate call to public static java.util.List<java.lang.String> org.assertj.core.api.Assertions.linesOf(java.net.URL,java.lang.String)
     * {@link org.assertj.core.api.Assertions#linesOf(java.net.URL,java.lang.String)}
     */
    default List<String> linesOf(URL url, String charsetName) {
        return Assertions.linesOf(url, charsetName);
    }



    /**
     * Delegate call to public static <T> org.assertj.core.condition.Not<T> org.assertj.core.api.Assertions.not(org.assertj.core.api.Condition<? super T>)
     * {@link org.assertj.core.api.Assertions#not(org.assertj.core.api.Condition)}
     */
    default <T> Not<T> not(Condition<? super T> condition) {
        return Assertions.not(condition);
    }



    /**
     * Delegate call to public static org.assertj.core.api.filter.NotFilter org.assertj.core.api.Assertions.not(java.lang.Object)
     * {@link org.assertj.core.api.Assertions#not(java.lang.Object)}
     */
    default NotFilter not(Object valueNotToMatch) {
        return Assertions.not(valueNotToMatch);
    }



    /**
     * Delegate call to public static org.assertj.core.api.filter.NotInFilter org.assertj.core.api.Assertions.notIn(java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#notIn(java.lang.Object[])}
     */
    default NotInFilter notIn(Object... valuesNotToMatch) {
        return Assertions.notIn(valuesNotToMatch);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Double> org.assertj.core.api.Assertions.offset(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#offset(java.lang.Double)}
     */
    default Offset<Double> offset(Double value) {
        return Assertions.offset(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Float> org.assertj.core.api.Assertions.offset(java.lang.Float)
     * {@link org.assertj.core.api.Assertions#offset(java.lang.Float)}
     */
    default Offset<Float> offset(Float value) {
        return Assertions.offset(value);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.registerCustomDateFormat(java.text.DateFormat)
     * {@link org.assertj.core.api.Assertions#registerCustomDateFormat(java.text.DateFormat)}
     */
    default void registerCustomDateFormat(DateFormat userCustomDateFormat) {
        Assertions.registerCustomDateFormat(userCustomDateFormat);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.registerCustomDateFormat(java.lang.String)
     * {@link org.assertj.core.api.Assertions#registerCustomDateFormat(java.lang.String)}
     */
    default void registerCustomDateFormat(String userCustomDateFormatPattern) {
        Assertions.registerCustomDateFormat(userCustomDateFormatPattern);
    }



    /**
     * Delegate call to public static <T> void org.assertj.core.api.Assertions.registerFormatterForType(java.lang.Class<T>,java.util.function.Function<T, java.lang.String>)
     * {@link org.assertj.core.api.Assertions#registerFormatterForType(java.lang.Class,java.util.function.Function)}
     */
    default <T> void registerFormatterForType(Class<T> type, Function<T, String> formatter) {
        Assertions.registerFormatterForType(type, formatter);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setAllowComparingPrivateFields(boolean)
     * {@link org.assertj.core.api.Assertions#setAllowComparingPrivateFields(boolean)}
     */
    default void setAllowComparingPrivateFields(boolean allowComparingPrivateFields) {
        Assertions.setAllowComparingPrivateFields(allowComparingPrivateFields);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setAllowExtractingPrivateFields(boolean)
     * {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields(boolean)}
     */
    default void setAllowExtractingPrivateFields(boolean allowExtractingPrivateFields) {
        Assertions.setAllowExtractingPrivateFields(allowExtractingPrivateFields);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setLenientDateParsing(boolean)
     * {@link org.assertj.core.api.Assertions#setLenientDateParsing(boolean)}
     */
    default void setLenientDateParsing(boolean value) {
        Assertions.setLenientDateParsing(value);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setMaxElementsForPrinting(int)
     * {@link org.assertj.core.api.Assertions#setMaxElementsForPrinting(int)}
     */
    default void setMaxElementsForPrinting(int maxElementsForPrinting) {
        Assertions.setMaxElementsForPrinting(maxElementsForPrinting);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setMaxLengthForSingleLineDescription(int)
     * {@link org.assertj.core.api.Assertions#setMaxLengthForSingleLineDescription(int)}
     */
    default void setMaxLengthForSingleLineDescription(int maxLengthForSingleLineDescription) {
        Assertions.setMaxLengthForSingleLineDescription(maxLengthForSingleLineDescription);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace(boolean)
     * {@link org.assertj.core.api.Assertions#setRemoveAssertJRelatedElementsFromStackTrace(boolean)}
     */
    default void setRemoveAssertJRelatedElementsFromStackTrace(boolean removeAssertJRelatedElementsFromStackTrace) {
        Assertions.setRemoveAssertJRelatedElementsFromStackTrace(removeAssertJRelatedElementsFromStackTrace);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.shouldHaveThrown(java.lang.Class<? extends java.lang.Throwable>)
     * {@link org.assertj.core.api.Assertions#shouldHaveThrown(java.lang.Class)}
     */
    default void shouldHaveThrown(Class<? extends Throwable> throwableClass) {
        Assertions.shouldHaveThrown(throwableClass);
    }



    /**
     * Delegate call to public static org.assertj.core.groups.Tuple org.assertj.core.api.Assertions.tuple(java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#tuple(java.lang.Object[])}
     */
    default Tuple tuple(Object... values) {
        return Assertions.tuple(values);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.useDefaultDateFormatsOnly()
     * {@link org.assertj.core.api.Assertions#useDefaultDateFormatsOnly()}
     */
    default void useDefaultDateFormatsOnly() {
        Assertions.useDefaultDateFormatsOnly();
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.useDefaultRepresentation()
     * {@link org.assertj.core.api.Assertions#useDefaultRepresentation()}
     */
    default void useDefaultRepresentation() {
        Assertions.useDefaultRepresentation();
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.useRepresentation(org.assertj.core.presentation.Representation)
     * {@link org.assertj.core.api.Assertions#useRepresentation(org.assertj.core.presentation.Representation)}
     */
    default void useRepresentation(Representation customRepresentation) {
        Assertions.useRepresentation(customRepresentation);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Double> org.assertj.core.api.Assertions.withPrecision(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#withPrecision(java.lang.Double)}
     */
    default Offset<Double> withPrecision(Double value) {
        return Assertions.withPrecision(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Float> org.assertj.core.api.Assertions.withPrecision(java.lang.Float)
     * {@link org.assertj.core.api.Assertions#withPrecision(java.lang.Float)}
     */
    default Offset<Float> withPrecision(Float value) {
        return Assertions.withPrecision(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.math.BigDecimal> org.assertj.core.api.Assertions.within(java.math.BigDecimal)
     * {@link org.assertj.core.api.Assertions#within(java.math.BigDecimal)}
     */
    default Offset<BigDecimal> within(BigDecimal value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.math.BigInteger> org.assertj.core.api.Assertions.within(java.math.BigInteger)
     * {@link org.assertj.core.api.Assertions#within(java.math.BigInteger)}
     */
    default Offset<BigInteger> within(BigInteger value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Byte> org.assertj.core.api.Assertions.within(java.lang.Byte)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Byte)}
     */
    default Offset<Byte> within(Byte value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Double> org.assertj.core.api.Assertions.within(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Double)}
     */
    default Offset<Double> within(Double value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Float> org.assertj.core.api.Assertions.within(java.lang.Float)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Float)}
     */
    default Offset<Float> within(Float value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Integer> org.assertj.core.api.Assertions.within(java.lang.Integer)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Integer)}
     */
    default Offset<Integer> within(Integer value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Long> org.assertj.core.api.Assertions.within(java.lang.Long)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Long)}
     */
    default Offset<Long> within(Long value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Offset<java.lang.Short> org.assertj.core.api.Assertions.within(java.lang.Short)
     * {@link org.assertj.core.api.Assertions#within(java.lang.Short)}
     */
    default Offset<Short> within(Short value) {
        return Assertions.within(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.TemporalUnitOffset org.assertj.core.api.Assertions.within(long,java.time.temporal.TemporalUnit)
     * {@link org.assertj.core.api.Assertions#within(long,java.time.temporal.TemporalUnit)}
     */
    default TemporalUnitOffset within(long value, TemporalUnit unit) {
        return Assertions.within(value, unit);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Percentage org.assertj.core.api.Assertions.withinPercentage(java.lang.Double)
     * {@link org.assertj.core.api.Assertions#withinPercentage(java.lang.Double)}
     */
    default Percentage withinPercentage(Double value) {
        return Assertions.withinPercentage(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Percentage org.assertj.core.api.Assertions.withinPercentage(java.lang.Integer)
     * {@link org.assertj.core.api.Assertions#withinPercentage(java.lang.Integer)}
     */
    default Percentage withinPercentage(Integer value) {
        return Assertions.withinPercentage(value);
    }



    /**
     * Delegate call to public static org.assertj.core.data.Percentage org.assertj.core.api.Assertions.withinPercentage(java.lang.Long)
     * {@link org.assertj.core.api.Assertions#withinPercentage(java.lang.Long)}
     */
    default Percentage withinPercentage(Long value) {
        return Assertions.withinPercentage(value);
    }



}