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
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
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
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Consumer;
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
import org.assertj.core.api.AbstractCollectionAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractDurationAssert;
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
import org.assertj.core.api.AbstractPeriodAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractStringAssert;
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
import org.assertj.core.api.Boolean2DArrayAssert;
import org.assertj.core.api.Byte2DArrayAssert;
import org.assertj.core.api.Char2DArrayAssert;
import org.assertj.core.api.ClassAssert;
import org.assertj.core.api.ClassBasedNavigableIterableAssert;
import org.assertj.core.api.ClassBasedNavigableListAssert;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.Condition;
import org.assertj.core.api.Double2DArrayAssert;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableIterableAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.Float2DArrayAssert;
import org.assertj.core.api.FutureAssert;
import org.assertj.core.api.InstanceOfAssertFactory;
import org.assertj.core.api.Int2DArrayAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IterableAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.ListAssert;
import org.assertj.core.api.Long2DArrayAssert;
import org.assertj.core.api.LongAdderAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.MapAssert;
import org.assertj.core.api.NotThrownAssert;
import org.assertj.core.api.Object2DArrayAssert;
import org.assertj.core.api.ObjectArrayAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.PredicateAssert;
import org.assertj.core.api.Short2DArrayAssert;
import org.assertj.core.api.SpliteratorAssert;
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
import org.assertj.core.description.Description;
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

//    /** {@link org.assertj.core.api.Assertions#ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> ARRAY = Assertions.ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#ARRAY_2D} */
//    static final InstanceOfAssertFactory<Object, Object> ARRAY_2D = Assertions.ARRAY_2D;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_BOOLEAN} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_BOOLEAN = Assertions.ATOMIC_BOOLEAN;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_INTEGER} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_INTEGER = Assertions.ATOMIC_INTEGER;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_INTEGER_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_INTEGER_ARRAY = Assertions.ATOMIC_INTEGER_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_INTEGER_FIELD_UPDATER} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_INTEGER_FIELD_UPDATER = Assertions.ATOMIC_INTEGER_FIELD_UPDATER;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_LONG} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_LONG = Assertions.ATOMIC_LONG;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_LONG_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_LONG_ARRAY = Assertions.ATOMIC_LONG_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_LONG_FIELD_UPDATER} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_LONG_FIELD_UPDATER = Assertions.ATOMIC_LONG_FIELD_UPDATER;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_MARKABLE_REFERENCE} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_MARKABLE_REFERENCE = Assertions.ATOMIC_MARKABLE_REFERENCE;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_REFERENCE} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_REFERENCE = Assertions.ATOMIC_REFERENCE;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_REFERENCE_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_REFERENCE_ARRAY = Assertions.ATOMIC_REFERENCE_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_REFERENCE_FIELD_UPDATER} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_REFERENCE_FIELD_UPDATER = Assertions.ATOMIC_REFERENCE_FIELD_UPDATER;
//
//    /** {@link org.assertj.core.api.Assertions#ATOMIC_STAMPED_REFERENCE} */
//    static final InstanceOfAssertFactory<Object, Object> ATOMIC_STAMPED_REFERENCE = Assertions.ATOMIC_STAMPED_REFERENCE;
//
//    /** {@link org.assertj.core.api.Assertions#BIG_DECIMAL} */
//    static final InstanceOfAssertFactory<Object, Object> BIG_DECIMAL = Assertions.BIG_DECIMAL;
//
//    /** {@link org.assertj.core.api.Assertions#BIG_INTEGER} */
//    static final InstanceOfAssertFactory<Object, Object> BIG_INTEGER = Assertions.BIG_INTEGER;
//
//    /** {@link org.assertj.core.api.Assertions#BOOLEAN} */
//    static final InstanceOfAssertFactory<Object, Object> BOOLEAN = Assertions.BOOLEAN;
//
//    /** {@link org.assertj.core.api.Assertions#BOOLEAN_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> BOOLEAN_2D_ARRAY = Assertions.BOOLEAN_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#BOOLEAN_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> BOOLEAN_ARRAY = Assertions.BOOLEAN_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#BYTE} */
//    static final InstanceOfAssertFactory<Object, Object> BYTE = Assertions.BYTE;
//
//    /** {@link org.assertj.core.api.Assertions#BYTE_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> BYTE_2D_ARRAY = Assertions.BYTE_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#BYTE_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> BYTE_ARRAY = Assertions.BYTE_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#CHARACTER} */
//    static final InstanceOfAssertFactory<Object, Object> CHARACTER = Assertions.CHARACTER;
//
//    /** {@link org.assertj.core.api.Assertions#CHAR_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> CHAR_2D_ARRAY = Assertions.CHAR_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#CHAR_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> CHAR_ARRAY = Assertions.CHAR_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#CHAR_SEQUENCE} */
//    static final InstanceOfAssertFactory<Object, Object> CHAR_SEQUENCE = Assertions.CHAR_SEQUENCE;
//
//    /** {@link org.assertj.core.api.Assertions#CLASS} */
//    static final InstanceOfAssertFactory<Object, Object> CLASS = Assertions.CLASS;
//
//    /** {@link org.assertj.core.api.Assertions#COLLECTION} */
//    static final InstanceOfAssertFactory<Object, Object> COLLECTION = Assertions.COLLECTION;
//
//    /** {@link org.assertj.core.api.Assertions#COMPLETABLE_FUTURE} */
//    static final InstanceOfAssertFactory<Object, Object> COMPLETABLE_FUTURE = Assertions.COMPLETABLE_FUTURE;
//
//    /** {@link org.assertj.core.api.Assertions#COMPLETION_STAGE} */
//    static final InstanceOfAssertFactory<Object, Object> COMPLETION_STAGE = Assertions.COMPLETION_STAGE;
//
//    /** {@link org.assertj.core.api.Assertions#DATE} */
//    static final InstanceOfAssertFactory<Object, Object> DATE = Assertions.DATE;
//
//    /** {@link org.assertj.core.api.Assertions#DOUBLE} */
//    static final InstanceOfAssertFactory<Object, Object> DOUBLE = Assertions.DOUBLE;
//
//    /** {@link org.assertj.core.api.Assertions#DOUBLE_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> DOUBLE_2D_ARRAY = Assertions.DOUBLE_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#DOUBLE_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> DOUBLE_ARRAY = Assertions.DOUBLE_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#DOUBLE_PREDICATE} */
//    static final InstanceOfAssertFactory<Object, Object> DOUBLE_PREDICATE = Assertions.DOUBLE_PREDICATE;
//
//    /** {@link org.assertj.core.api.Assertions#DOUBLE_STREAM} */
//    static final InstanceOfAssertFactory<Object, Object> DOUBLE_STREAM = Assertions.DOUBLE_STREAM;
//
//    /** {@link org.assertj.core.api.Assertions#DURATION} */
//    static final InstanceOfAssertFactory<Object, Object> DURATION = Assertions.DURATION;
//
//    /** {@link org.assertj.core.api.Assertions#FILE} */
//    static final InstanceOfAssertFactory<Object, Object> FILE = Assertions.FILE;
//
//    /** {@link org.assertj.core.api.Assertions#FLOAT} */
//    static final InstanceOfAssertFactory<Object, Object> FLOAT = Assertions.FLOAT;
//
//    /** {@link org.assertj.core.api.Assertions#FLOAT_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> FLOAT_2D_ARRAY = Assertions.FLOAT_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#FLOAT_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> FLOAT_ARRAY = Assertions.FLOAT_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#FUTURE} */
//    static final InstanceOfAssertFactory<Object, Object> FUTURE = Assertions.FUTURE;
//
//    /** {@link org.assertj.core.api.Assertions#INPUT_STREAM} */
//    static final InstanceOfAssertFactory<Object, Object> INPUT_STREAM = Assertions.INPUT_STREAM;
//
//    /** {@link org.assertj.core.api.Assertions#INSTANT} */
//    static final InstanceOfAssertFactory<Object, Object> INSTANT = Assertions.INSTANT;
//
//    /** {@link org.assertj.core.api.Assertions#INTEGER} */
//    static final InstanceOfAssertFactory<Object, Object> INTEGER = Assertions.INTEGER;
//
//    /** {@link org.assertj.core.api.Assertions#INT_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> INT_2D_ARRAY = Assertions.INT_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#INT_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> INT_ARRAY = Assertions.INT_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#INT_PREDICATE} */
//    static final InstanceOfAssertFactory<Object, Object> INT_PREDICATE = Assertions.INT_PREDICATE;
//
//    /** {@link org.assertj.core.api.Assertions#INT_STREAM} */
//    static final InstanceOfAssertFactory<Object, Object> INT_STREAM = Assertions.INT_STREAM;
//
//    /** {@link org.assertj.core.api.Assertions#ITERABLE} */
//    static final InstanceOfAssertFactory<Object, Object> ITERABLE = Assertions.ITERABLE;

//    /** {@link org.assertj.core.api.Assertions#ITERATOR} */
//    static final InstanceOfAssertFactory<Object, Object> ITERATOR = Assertions.ITERATOR;
//
//    /** {@link org.assertj.core.api.Assertions#LIST} */
//    static final InstanceOfAssertFactory<Object, Object> LIST = Assertions.LIST;
//
//    /** {@link org.assertj.core.api.Assertions#LOCAL_DATE} */
//    static final InstanceOfAssertFactory<Object, Object> LOCAL_DATE = Assertions.LOCAL_DATE;
//
//    /** {@link org.assertj.core.api.Assertions#LOCAL_DATE_TIME} */
//    static final InstanceOfAssertFactory<Object, Object> LOCAL_DATE_TIME = Assertions.LOCAL_DATE_TIME;
//
//    /** {@link org.assertj.core.api.Assertions#LOCAL_TIME} */
//    static final InstanceOfAssertFactory<Object, Object> LOCAL_TIME = Assertions.LOCAL_TIME;
//
//    /** {@link org.assertj.core.api.Assertions#LONG} */
//    static final InstanceOfAssertFactory<Object, Object> LONG = Assertions.LONG;
//
//    /** {@link org.assertj.core.api.Assertions#LONG_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> LONG_2D_ARRAY = Assertions.LONG_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#LONG_ADDER} */
//    static final InstanceOfAssertFactory<Object, Object> LONG_ADDER = Assertions.LONG_ADDER;
//
//    /** {@link org.assertj.core.api.Assertions#LONG_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> LONG_ARRAY = Assertions.LONG_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#LONG_PREDICATE} */
//    static final InstanceOfAssertFactory<Object, Object> LONG_PREDICATE = Assertions.LONG_PREDICATE;
//
//    /** {@link org.assertj.core.api.Assertions#LONG_STREAM} */
//    static final InstanceOfAssertFactory<Object, Object> LONG_STREAM = Assertions.LONG_STREAM;
//
//    /** {@link org.assertj.core.api.Assertions#MAP} */
//    static final InstanceOfAssertFactory<Object, Object> MAP = Assertions.MAP;
//
//    /** {@link org.assertj.core.api.Assertions#OFFSET_DATE_TIME} */
//    static final InstanceOfAssertFactory<Object, Object> OFFSET_DATE_TIME = Assertions.OFFSET_DATE_TIME;
//
//    /** {@link org.assertj.core.api.Assertions#OFFSET_TIME} */
//    static final InstanceOfAssertFactory<Object, Object> OFFSET_TIME = Assertions.OFFSET_TIME;
//
//    /** {@link org.assertj.core.api.Assertions#OPTIONAL} */
//    static final InstanceOfAssertFactory<Object, Object> OPTIONAL = Assertions.OPTIONAL;
//
//    /** {@link org.assertj.core.api.Assertions#OPTIONAL_DOUBLE} */
//    static final InstanceOfAssertFactory<Object, Object> OPTIONAL_DOUBLE = Assertions.OPTIONAL_DOUBLE;
//
//    /** {@link org.assertj.core.api.Assertions#OPTIONAL_INT} */
//    static final InstanceOfAssertFactory<Object, Object> OPTIONAL_INT = Assertions.OPTIONAL_INT;
//
//    /** {@link org.assertj.core.api.Assertions#OPTIONAL_LONG} */
//    static final InstanceOfAssertFactory<Object, Object> OPTIONAL_LONG = Assertions.OPTIONAL_LONG;
//
//    /** {@link org.assertj.core.api.Assertions#PATH} */
//    static final InstanceOfAssertFactory<Object, Object> PATH = Assertions.PATH;
//
//    /** {@link org.assertj.core.api.Assertions#PERIOD} */
//    static final InstanceOfAssertFactory<Object, Object> PERIOD = Assertions.PERIOD;
//
//    /** {@link org.assertj.core.api.Assertions#PREDICATE} */
//    static final InstanceOfAssertFactory<Object, Object> PREDICATE = Assertions.PREDICATE;
//
//    /** {@link org.assertj.core.api.Assertions#SHORT} */
//    static final InstanceOfAssertFactory<Object, Object> SHORT = Assertions.SHORT;
//
//    /** {@link org.assertj.core.api.Assertions#SHORT_2D_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> SHORT_2D_ARRAY = Assertions.SHORT_2D_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#SHORT_ARRAY} */
//    static final InstanceOfAssertFactory<Object, Object> SHORT_ARRAY = Assertions.SHORT_ARRAY;
//
//    /** {@link org.assertj.core.api.Assertions#SPLITERATOR} */
//    static final InstanceOfAssertFactory<Object, Object> SPLITERATOR = Assertions.SPLITERATOR;
//
//    /** {@link org.assertj.core.api.Assertions#STREAM} */
//    static final InstanceOfAssertFactory<Object, Object> STREAM = Assertions.STREAM;
//
//    /** {@link org.assertj.core.api.Assertions#STRING} */
//    static final InstanceOfAssertFactory<Object, Object> STRING = Assertions.STRING;
//
//    /** {@link org.assertj.core.api.Assertions#STRING_BUFFER} */
//    static final InstanceOfAssertFactory<Object, Object> STRING_BUFFER = Assertions.STRING_BUFFER;
//
//    /** {@link org.assertj.core.api.Assertions#STRING_BUILDER} */
//    static final InstanceOfAssertFactory<Object, Object> STRING_BUILDER = Assertions.STRING_BUILDER;
//
//    /** {@link org.assertj.core.api.Assertions#THROWABLE} */
//    static final InstanceOfAssertFactory<Object, Object> THROWABLE = Assertions.THROWABLE;
//
//    /** {@link org.assertj.core.api.Assertions#URI_TYPE} */
//    static final InstanceOfAssertFactory<Object, Object> URI_TYPE = Assertions.URI_TYPE;
//
//    /** {@link org.assertj.core.api.Assertions#URL_TYPE} */
//    static final InstanceOfAssertFactory<Object, Object> URL_TYPE = Assertions.URL_TYPE;
//
//    /** {@link org.assertj.core.api.Assertions#ZONED_DATE_TIME} */
//    static final InstanceOfAssertFactory<Object, Object> ZONED_DATE_TIME = Assertions.ZONED_DATE_TIME;


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
     * Delegate call to public static <T,ASSERT> org.assertj.core.api.InstanceOfAssertFactory<T, ASSERT> org.assertj.core.api.Assertions.as(org.assertj.core.api.InstanceOfAssertFactory<T, ASSERT>)
     * {@link org.assertj.core.api.Assertions#as(org.assertj.core.api.InstanceOfAssertFactory)}
     */
    default <T,ASSERT extends AbstractAssert<?, ?>> InstanceOfAssertFactory<T, ASSERT> as(InstanceOfAssertFactory<T, ASSERT> assertFactory) {
        return Assertions.as(assertFactory);
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
     * Delegate call to public static org.assertj.core.api.Boolean2DArrayAssert org.assertj.core.api.Assertions.assertThat(boolean[][])
     * {@link org.assertj.core.api.Assertions#assertThat(boolean[][])}
     */
    default Boolean2DArrayAssert assertThat(boolean[][] actual) {
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
     * Delegate call to public static org.assertj.core.api.Byte2DArrayAssert org.assertj.core.api.Assertions.assertThat(byte[][])
     * {@link org.assertj.core.api.Assertions#assertThat(byte[][])}
     */
    default Byte2DArrayAssert assertThat(byte[][] actual) {
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
     * Delegate call to public static org.assertj.core.api.Char2DArrayAssert org.assertj.core.api.Assertions.assertThat(char[][])
     * {@link org.assertj.core.api.Assertions#assertThat(char[][])}
     */
    default Char2DArrayAssert assertThat(char[][] actual) {
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
     * Delegate call to public static <E> org.assertj.core.api.AbstractCollectionAssert<?, java.util.Collection<? extends E>, E, org.assertj.core.api.ObjectAssert<E>> org.assertj.core.api.Assertions.assertThat(java.util.Collection<? extends E>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Collection)}
     */
    default <E> AbstractCollectionAssert<?, Collection<? extends E>, E, ObjectAssert<E>> assertThat(Collection<? extends E> actual) {
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
     * Delegate call to public static org.assertj.core.api.Double2DArrayAssert org.assertj.core.api.Assertions.assertThat(double[][])
     * {@link org.assertj.core.api.Assertions#assertThat(double[][])}
     */
    default Double2DArrayAssert assertThat(double[][] actual) {
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
     * Delegate call to public static org.assertj.core.api.AbstractDurationAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.Duration)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.Duration)}
     */
    default AbstractDurationAssert<?> assertThat(Duration actual) {
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
     * Delegate call to public static org.assertj.core.api.Float2DArrayAssert org.assertj.core.api.Assertions.assertThat(float[][])
     * {@link org.assertj.core.api.Assertions#assertThat(float[][])}
     */
    default Float2DArrayAssert assertThat(float[][] actual) {
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
     * Delegate call to public static org.assertj.core.api.Int2DArrayAssert org.assertj.core.api.Assertions.assertThat(int[][])
     * {@link org.assertj.core.api.Assertions#assertThat(int[][])}
     */
    default Int2DArrayAssert assertThat(int[][] actual) {
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
     * Delegate call to public static <ELEMENT> org.assertj.core.api.IteratorAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.Iterator<? extends ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Iterator)}
     */
    default <ELEMENT> IteratorAssert<ELEMENT> assertThat(Iterator<? extends ELEMENT> actual) {
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
     * Delegate call to public static org.assertj.core.api.Long2DArrayAssert org.assertj.core.api.Assertions.assertThat(long[][])
     * {@link org.assertj.core.api.Assertions#assertThat(long[][])}
     */
    default Long2DArrayAssert assertThat(long[][] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.LongAdderAssert org.assertj.core.api.Assertions.assertThat(java.util.concurrent.atomic.LongAdder)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.concurrent.atomic.LongAdder)}
     */
    default LongAdderAssert assertThat(LongAdder actual) {
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
     * Delegate call to public static org.assertj.core.api.AbstractPeriodAssert<?> org.assertj.core.api.Assertions.assertThat(java.time.Period)
     * {@link org.assertj.core.api.Assertions#assertThat(java.time.Period)}
     */
    default AbstractPeriodAssert<?> assertThat(Period actual) {
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
     * Delegate call to public static org.assertj.core.api.Short2DArrayAssert org.assertj.core.api.Assertions.assertThat(short[][])
     * {@link org.assertj.core.api.Assertions#assertThat(short[][])}
     */
    default Short2DArrayAssert assertThat(short[][] actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static <ELEMENT> org.assertj.core.api.SpliteratorAssert<ELEMENT> org.assertj.core.api.Assertions.assertThat(java.util.Spliterator<ELEMENT>)
     * {@link org.assertj.core.api.Assertions#assertThat(java.util.Spliterator)}
     */
    default <ELEMENT> SpliteratorAssert<ELEMENT> assertThat(Spliterator<ELEMENT> actual) {
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
     * Delegate call to public static org.assertj.core.api.AbstractStringAssert<?> org.assertj.core.api.Assertions.assertThat(java.lang.String)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.String)}
     */
    default AbstractStringAssert<?> assertThat(String actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharSequenceAssert<?, ? extends java.lang.CharSequence> org.assertj.core.api.Assertions.assertThat(java.lang.StringBuffer)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.StringBuffer)}
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(StringBuffer actual) {
        return Assertions.assertThat(actual);
    }



    /**
     * Delegate call to public static org.assertj.core.api.AbstractCharSequenceAssert<?, ? extends java.lang.CharSequence> org.assertj.core.api.Assertions.assertThat(java.lang.StringBuilder)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.StringBuilder)}
     */
    default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(StringBuilder actual) {
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
     * Delegate call to public static <T> org.assertj.core.api.AbstractThrowableAssert<?, T> org.assertj.core.api.Assertions.assertThat(T)
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Throwable)}
     */
    default <T extends Throwable> AbstractThrowableAssert<?, T> assertThat(T assertion) {
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
     * Delegate call to public static <T> org.assertj.core.api.Object2DArrayAssert<T> org.assertj.core.api.Assertions.assertThat(T[][])
     * {@link org.assertj.core.api.Assertions#assertThat(java.lang.Object[][])}
     */
    default <T> Object2DArrayAssert<T> assertThat(T[][] actual) {
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
     * Delegate call to public static org.assertj.core.api.NotThrownAssert org.assertj.core.api.Assertions.assertThatNoException()
     * {@link org.assertj.core.api.Assertions#assertThatNoException()}
     */
    default NotThrownAssert assertThatNoException() {
        return Assertions.assertThatNoException();
    }



    /**
     * Delegate call to public static org.assertj.core.api.ThrowableTypeAssert<java.lang.NullPointerException> org.assertj.core.api.Assertions.assertThatNullPointerException()
     * {@link org.assertj.core.api.Assertions#assertThatNullPointerException()}
     */
    default ThrowableTypeAssert<NullPointerException> assertThatNullPointerException() {
        return Assertions.assertThatNullPointerException();
    }



    /**
     * Delegate call to public static <T> org.assertj.core.api.ObjectAssert<T> org.assertj.core.api.Assertions.assertThatObject(T)
     * {@link org.assertj.core.api.Assertions#assertThatObject(java.lang.Object)}
     */
    default <T> ObjectAssert<T> assertThatObject(T actual) {
        return Assertions.assertThatObject(actual);
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
     * Delegate call to public static <T> org.assertj.core.api.ObjectAssert<T> org.assertj.core.api.Assertions.assertWith(T,java.util.function.Consumer<T>...)
     * {@link org.assertj.core.api.Assertions#assertWith(java.lang.Object,java.util.function.Consumer[])}
     */
    default <T> ObjectAssert<T> assertWith(T actual, Consumer<T>... requirements) {
        return Assertions.assertWith(actual, requirements);
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
     * Delegate call to public static java.lang.Exception org.assertj.core.api.Assertions.catchException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default Exception catchException(ThrowableAssert.ThrowingCallable shouldRaiseException) {
        return Assertions.catchException(shouldRaiseException);
    }



    /**
     * Delegate call to public static java.io.IOException org.assertj.core.api.Assertions.catchIOException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchIOException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default IOException catchIOException(ThrowableAssert.ThrowingCallable shouldRaiseIOException) {
        return Assertions.catchIOException(shouldRaiseIOException);
    }



    /**
     * Delegate call to public static java.lang.IllegalArgumentException org.assertj.core.api.Assertions.catchIllegalArgumentException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchIllegalArgumentException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default IllegalArgumentException catchIllegalArgumentException(ThrowableAssert.ThrowingCallable shouldRaiseIllegalArgumentException) {
        return Assertions.catchIllegalArgumentException(shouldRaiseIllegalArgumentException);
    }



    /**
     * Delegate call to public static java.lang.IllegalStateException org.assertj.core.api.Assertions.catchIllegalStateException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchIllegalStateException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default IllegalStateException catchIllegalStateException(ThrowableAssert.ThrowingCallable shouldRaiseIllegalStateException) {
        return Assertions.catchIllegalStateException(shouldRaiseIllegalStateException);
    }



    /**
     * Delegate call to public static java.lang.IndexOutOfBoundsException org.assertj.core.api.Assertions.catchIndexOutOfBoundsException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchIndexOutOfBoundsException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default IndexOutOfBoundsException catchIndexOutOfBoundsException(ThrowableAssert.ThrowingCallable shouldRaiseIndexOutOfBoundException) {
        return Assertions.catchIndexOutOfBoundsException(shouldRaiseIndexOutOfBoundException);
    }



    /**
     * Delegate call to public static java.lang.NullPointerException org.assertj.core.api.Assertions.catchNullPointerException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchNullPointerException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default NullPointerException catchNullPointerException(ThrowableAssert.ThrowingCallable shouldRaiseNullPointerException) {
        return Assertions.catchNullPointerException(shouldRaiseNullPointerException);
    }



    /**
     * Delegate call to public static java.lang.ReflectiveOperationException org.assertj.core.api.Assertions.catchReflectiveOperationException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchReflectiveOperationException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default ReflectiveOperationException catchReflectiveOperationException(ThrowableAssert.ThrowingCallable shouldRaiseReflectiveOperationException) {
        return Assertions.catchReflectiveOperationException(shouldRaiseReflectiveOperationException);
    }



    /**
     * Delegate call to public static java.lang.RuntimeException org.assertj.core.api.Assertions.catchRuntimeException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)
     * {@link org.assertj.core.api.Assertions#catchRuntimeException(org.assertj.core.api.ThrowableAssert$ThrowingCallable)}
     */
    default RuntimeException catchRuntimeException(ThrowableAssert.ThrowingCallable shouldRaiseRuntimeException) {
        return Assertions.catchRuntimeException(shouldRaiseRuntimeException);
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
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.fail(java.lang.String)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String)}
     */
    default <T> T fail(String failureMessage) {
        return Assertions.fail(failureMessage);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.fail(java.lang.String,java.lang.Object...)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String,java.lang.Object[])}
     */
    default <T> T fail(String failureMessage, Object... args) {
        return Assertions.fail(failureMessage, args);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.fail(java.lang.String,java.lang.Throwable)
     * {@link org.assertj.core.api.Assertions#fail(java.lang.String,java.lang.Throwable)}
     */
    default <T> T fail(String failureMessage, Throwable realCause) {
        return Assertions.fail(failureMessage, realCause);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown(java.lang.Class<? extends java.lang.Throwable>)
     * {@link org.assertj.core.api.Assertions#failBecauseExceptionWasNotThrown(java.lang.Class)}
     */
    default <T> T failBecauseExceptionWasNotThrown(Class<? extends Throwable> throwableClass) {
        return Assertions.failBecauseExceptionWasNotThrown(throwableClass);
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
     * Delegate call to public static void org.assertj.core.api.Assertions.setDescriptionConsumer(java.util.function.Consumer<org.assertj.core.description.Description>)
     * {@link org.assertj.core.api.Assertions#setDescriptionConsumer(java.util.function.Consumer)}
     */
    default void setDescriptionConsumer(Consumer<Description> descriptionConsumer) {
        Assertions.setDescriptionConsumer(descriptionConsumer);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setExtractBareNamePropertyMethods(boolean)
     * {@link org.assertj.core.api.Assertions#setExtractBareNamePropertyMethods(boolean)}
     */
    default void setExtractBareNamePropertyMethods(boolean barenamePropertyMethods) {
        Assertions.setExtractBareNamePropertyMethods(barenamePropertyMethods);
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
     * Delegate call to public static void org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(int)
     * {@link org.assertj.core.api.Assertions#setMaxStackTraceElementsDisplayed(int)}
     */
    default void setMaxStackTraceElementsDisplayed(int maxStackTraceElementsDisplayed) {
        Assertions.setMaxStackTraceElementsDisplayed(maxStackTraceElementsDisplayed);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setPrintAssertionsDescription(boolean)
     * {@link org.assertj.core.api.Assertions#setPrintAssertionsDescription(boolean)}
     */
    default void setPrintAssertionsDescription(boolean printAssertionsDescription) {
        Assertions.setPrintAssertionsDescription(printAssertionsDescription);
    }



    /**
     * Delegate call to public static void org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace(boolean)
     * {@link org.assertj.core.api.Assertions#setRemoveAssertJRelatedElementsFromStackTrace(boolean)}
     */
    default void setRemoveAssertJRelatedElementsFromStackTrace(boolean removeAssertJRelatedElementsFromStackTrace) {
        Assertions.setRemoveAssertJRelatedElementsFromStackTrace(removeAssertJRelatedElementsFromStackTrace);
    }



    /**
     * Delegate call to public static <T> T org.assertj.core.api.Assertions.shouldHaveThrown(java.lang.Class<? extends java.lang.Throwable>)
     * {@link org.assertj.core.api.Assertions#shouldHaveThrown(java.lang.Class)}
     */
    default <T> T shouldHaveThrown(Class<? extends Throwable> throwableClass) {
        return Assertions.shouldHaveThrown(throwableClass);
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
     * Delegate call to public static java.time.Duration org.assertj.core.api.Assertions.withMarginOf(java.time.Duration)
     * {@link org.assertj.core.api.Assertions#withMarginOf(java.time.Duration)}
     */
    default Duration withMarginOf(Duration allowedDifference) {
        return Assertions.withMarginOf(allowedDifference);
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