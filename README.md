# extended-mockito
Convenient extensions to the [Mockito] (http://mockito.org/) unit-testing mock object library.

Requires Java 8 (or higher)

Adds a mixin interface (built by [interface-it] (https://github.com/aro-tech/interface-it)) called ExtendedMockito (and there is also ExtendedBDDMockito) and extra matchers, including lambda-capable matchers.

##Latest release
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.aro-tech/extended-mockito/badge.svg)](http://search.maven.org/#artifactdetails|com.github.aro-tech|extended-mockito|2.7.17.1|jar)

[Release notes on github] (https://github.com/aro-tech/extended-mockito/releases/tag/v2.7.17.1) 

[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/com.github.aro-tech/extended-mockito/badge.svg)](http://www.javadoc.io/doc/com.github.aro-tech/extended-mockito/2.7.17.1)

[Binary downloads] (https://oss.sonatype.org/content/groups/public/com/github/aro-tech/extended-mockito/2.7.17.1/ "binaries")


In Maven:

```html
<dependency>
  <groupId>com.github.aro-tech</groupId>
  <artifactId>extended-mockito</artifactId>
  <version>2.7.17.1</version>
  <scope>test</scope>
</dependency>
```


##Example usage 
```
	public class EmployeeTest implements ExtendedMockito { 
```	

```
	when(mock.acceptExtractedInformation(toStringContainsAllOf("Shire", "Baggins", "Precious"))).thenReturn(Boolean.TRUE);
```

```
when(mock.checkCVBuzzwords(toStringContainsOneOrMoreOf("SCRUM", "Kanban", "TDD", "DDD", "ROTFL")))
				.thenReturn(Boolean.TRUE);
```

```		
		when(mock.doAThingWithAList(oneOrMoreItemsMatch((str) -> str.startsWith("item")))).thenReturn(Boolean.TRUE);
```

```		
		when(mock.doAThingWithADouble(doubleMatches((val) -> val < Math.PI, "< PI"))).thenReturn(Boolean.TRUE);
```		

```
		verify(mock).doAThingWithABean(hasToString("[Employee] name=John Smith, group=R&D"));	
```

```
when(mock.doAThingWithAList(listContainsExactlyInAnyOrder("Parsley", "Rosemary", "Sage", "Thyme"))).thenReturn(Boolean.TRUE);
```

See [the unit tests] (https://github.com/aro-tech/extended-mockito/blob/master/src/test/java/com/github/aro_tech/extended_mockito) for more examples.  

##List of added matchers:

**String matchers** 
 * containsAllOf
 * containsOneOrMoreOf
 * hasToString
 * toStringContainsAllOf
 * toStringContainsOneOrMoreOf
 
**Lambda Predicate matchers for collections**
 * allListItemsMatch
 * oneOrMoreListItemsMatch
 * allSetItemsMatch
 * oneOrMoreSetItemsMatch
 * mapThat
 
 **Other matchers for collections**
 * listContainsExactlyInAnyOrder
 
**Lambda Predicate matchers for objects and primitives**

*Mockito already accepts lambdas for argThat(), intThat(), etc. but does not accept Predicate instances, and the lambdas accepted by argThat(), intThat() etc. require type casts (Note - this seems to be an area which is rapidly changing in the 2.0.XX betas of Mockito). The following methods accept a Predicate instance or a lambda without the need for a type cast.*
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
