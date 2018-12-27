package com.github.aro_tech.extended_mockito;

import com.github.aro_tech.extended_mockito.wrappers.AssertJ;
import org.assertj.core.api.AbstractStringAssert;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;

public class InjectorTest implements ExtendedMockito, AssertJ {

    public static final String TO_INJECT = "bar";

    private static class BeanA {
        private String member1 = "foo";

        public String getMember1() {
            return member1;
        }
    }

    private static class BeanB extends BeanA {
        private String member2 = "";
        private Long member3 = null;
        private Predicate<String> member4 = null;
        private Predicate<String> member5 = null;
        private Predicate<Long> member6 = null;
        private Comparable<String> member7 = null;

        public String getMember2() {
            return member2;
        }

        public Long getMember3() {
            return member3;
        }

        public Predicate<String> getMember4() {
            return member4;
        }

        public Predicate<String> getMember5() {
            return member5;
        }

        public Predicate<Long> getMember6() {
            return member6;
        }

        public Comparable<String> getMember7() {
            return member7;
        }

    }

    @Test
    public void shouldInjectByNameWithNoInheritance() throws NoSuchFieldException, IllegalAccessException {
        BeanA target = new BeanA();
        this.injectByName(target, "member1", TO_INJECT);
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
    }

    @Test(expected = NoSuchFieldException.class)
    public void shouldThrowIfFieldNameIsWrong() throws NoSuchFieldException, IllegalAccessException {
        BeanA target = new BeanA();
        this.injectByName(target, "mamboNumber5", TO_INJECT);
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
    }

    @Test
    public void shouldInjectByNameWithInheritance() throws NoSuchFieldException, IllegalAccessException {
        BeanB target = new BeanB();
        this.injectByName(target, "member1", TO_INJECT);
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
    }

    @Test
    public void shouldInjectByType() throws NoSuchFieldException, IllegalAccessException {
        BeanB target = new BeanB();
        Comparable<String> comp = (Comparable<String>) this.mock(Comparable.class);
        Predicate<String> longerThanZero =(String s) ->
                null != s && s.length() > 0;
        Predicate<Long> alwaysTrue = (Long val) -> true;
        this.when(comp.compareTo("A")).thenReturn(5);
        this.injectByType(target, Long.valueOf(111L), comp,
                TO_INJECT, "Hello",
                longerThanZero, (Predicate<String>) (String s) -> s.length() > 4
                    , alwaysTrue);
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
        this.assertThat(target.getMember2()).isEqualTo("Hello");
        this.assertThat(target.getMember3()).isEqualTo(111L);
        this.assertThat(target.getMember4().test("123")).isTrue();
        this.assertThat(target.getMember5().test("123")).isFalse();
        this.assertThat(target.getMember6().test(0L)).isTrue();
        this.assertThat(target.getMember7().compareTo("A")).isEqualTo(5);
    }

    @Test
    public void injectByTypeShouldHandleLackOfInjectees() throws NoSuchFieldException, IllegalAccessException {
        BeanB target = new BeanB();
        this.injectByType(target);
        this.assertThat(target.getMember1()).isEqualTo("foo");
        this.assertThat(target.getMember2()).isEmpty();
        this.assertThat(target.getMember3()).isNull();
        this.assertThat(target.getMember4()).isNull();
        this.assertThat(target.getMember5()).isNull();
        this.assertThat(target.getMember6()).isNull();
        this.assertThat(target.getMember7()).isNull();
    }

    @Test
    public void injectByTypeShouldHandleANullInjectee() throws NoSuchFieldException, IllegalAccessException {
        BeanB target = new BeanB();
        this.injectByType(target,TO_INJECT, null);
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
        this.assertThat(target.getMember2()).isEmpty();
        this.assertThat(target.getMember3()).isNull();
        this.assertThat(target.getMember4()).isNull();
        this.assertThat(target.getMember5()).isNull();
        this.assertThat(target.getMember6()).isNull();
        this.assertThat(target.getMember7()).isNull();
    }

    @Test
    public void injectByTypeShouldHandleExcessInjectees() throws NoSuchFieldException, IllegalAccessException {
        BeanA target = new BeanA();
        this.injectByType(target,TO_INJECT, "A","B","C","");
        this.assertThat(target.getMember1()).isEqualTo(TO_INJECT);
    }

}