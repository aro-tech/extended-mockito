# extended-mockito
Convenient extensions to the [Mockito] (http://mockito.org/) unit-testing mock object library.

Requires Java 8 (or higher)

Adds a mixin interface (built by [interface-it] (https://github.com/aro-tech/interface-it)) and extra matchers, including lambda-capable matchers.

##Latest release
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.aro-tech/extended-mockito/badge.svg)](http://search.maven.org/#artifactdetails|com.github.aro-tech|extended-mockito|2.0.44-beta.1|jar)

[Release notes on github] (https://github.com/aro-tech/extended-mockito/releases/tag/v2.0.44-beta.1) 

[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/com.github.aro-tech/extended-mockito/badge.svg)](http://www.javadoc.io/doc/com.github.aro-tech/extended-mockito/2.0.44-beta.1)

[Binary downloads] (https://oss.sonatype.org/content/groups/public/com/github/aro-tech/extended-mockito/2.0.44-beta.1/ "binaries")


In Maven:

```html
<dependency>
  <groupId>com.github.aro-tech</groupId>
  <artifactId>extended-mockito</artifactId>
  <version>2.0.44-beta.1</version>
</dependency>
```


##Example usage 
```
	public class EmployeeTest implements ExtendedMockito { 
		
		@Test
		public void can_update_vacation_days() {
			Assert.assertEquals(0, underTest.getCurrentVacationDaysForEmployee(testEmployee));
		
			when(admin.getAnnualVacationDays(objectMatches(
				(emp) -> emp.getStartDate().isBefore(LocalDate.now().minus(3, ChronoUnit.YEARS)))))
						.thenReturn(SENIOR_EMPLOYEE_VACATION_DAYS);
			
			underTest.updateVacationDaysForNewPeriod();
			Assert.assertEquals(SENIOR_EMPLOYEE_VACATION_DAYS, underTest.getCurrentVacationDaysForEmployee(testEmployee));
		}
	}

```

See [the unit tests] (https://github.com/aro-tech/extended-mockito/blob/master/src/test/java/com/github/aro_tech/extended_mockito/ExtendedMockitoTest.java) for more examples.  

##List of added matchers:

**String matchers** 
 * containsAllOf
 * containsOneOrMoreOf

**Lambda Predicate matchers for lists**
 * allItemsMatch
 * oneOrMoreItemsMatch

**Lambda Predicate matchers for objects and primitives**

*Mockito already accepts lambdas for argThat(), intThat(), etc. but does not accept Predicate instances, and the lambdas accepted by argThat(), intThat() etc. require type casts. The following methods accept a Predicate instance or a lambda without the need for a type cast.*
 * objectMatches (use only for objects, not for auto-boxed primitive types)
 * intMatches
 * longMatches
 * shortMatches
 * doubleMatches
 * floatMatches
 * byteMatches
 * charMatches

##Blog
[![The Green Bar](https://img.shields.io/badge/My_Blog:-The_Green_Bar-brightgreen.svg)](https://thegreenbar.wordpress.com/)
