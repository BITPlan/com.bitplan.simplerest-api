# com.bitplan.simplerest-api
simple RESTFul Jersey API

# Implementation
see https://github.com/BITPlan/com.bitplan.simplerest

### Project
[![Build Status](https://travis-ci.org/BITPlan/com.bitplan.simplerest-api.svg?branch=master)](https://travis-ci.org/BITPlan/com.bitplan.simplerest-api)

* Open Source hosted at https://github.com/BITPlan/com.bitplan.simplerest-api
* License based on license of libraries used (see [pom.xml](https://github.com/BITPlan/com.bitplan.simplerest-api/blob/master/pom.xml))
* Maven based Java project including JUnit 4 tests.

### How to build
* git clone https://github.com/BITPlan/com.bitplan.simplerest-api
* cd com.bitplan.simplerest-api
* mvn install

### Distribution
Available at Maven Central see 

http://search.maven.org/#artifactdetails|com.bitplan.rest|com.bitplan.simplerest-api|0.0.7|jar

Maven dependency:

```xml
<dependency>
	<groupId>com.bitplan.rest</groupId>
	<artifactId>com.bitplan.simplerest-api</artifactId>
	<version>0.0.7</version>
</dependency>
```

## Version history
* 0.0.1: 2016-06-18 First release via GitHub / Maven central
* 0.0.2: 2016-06-19 adds Basic Authentication support via UserManager
* 0.0.3: 2017-03-18 adds com.bitplan.datatypes package
* 0.0.7: 2017-03-19 updates version to same as com.bitplan.simplerest
* 0.0.8: 2017-03-25 add Postable interface