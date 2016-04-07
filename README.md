# extended-mockito
Convenient extensions to the [Mockito] (http://mockito.org/) unit-testing mock object library.

Requires Java 8 (or higher)

Adds a mixin interface and extra matchers, including lambda-capable matchers.

##Latest release

Coming soon

##Example usage 
```
	public class EmployeeTest implements extended-mockito { 
		
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

See [the unit tests] for more examples. (https://github.com/aro-tech/extended-mockito/blob/master/src/test/java/com/github/aro_tech/extended_mockito/ExtendedMockitoTest.java) 

##List of added matchers:

String matchers 
 * containsAllOf
 * containsOneOrMoreOf

Lambda Predicate matchers for lists
 * allItemsMatch
 * oneOrMoreItemsMatch

Lambda Predicate matchers for objects and primitives
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
