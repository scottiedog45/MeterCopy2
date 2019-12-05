<!--
	Markdown
	Copyright 2016-2018 IS2T. All rights reserved.
	IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
-->

## 1.4.2 (2018-09-17)
Bugfixes:
  - Generation fails with NullPointerException when the project does not contain any test.

## 1.4.1 (2018-09-14)
Bugfixes:
  - Generation fails with ArrayIndexOutOfBoundsException when tests are in several packages.

## 1.4.0 (2018-09-07)
Features:
  - Generate class that runs all tests from all classes.	

## 1.3.0 (2017-09-06)
Features:
  - Improved Wrapper API and generated code so it can be used from apps, possibly through a SharedInterface.	

## 1.2.1 (2017-08-08)
Bugfixes:
  - WI20069 JUnit @Test(expected=...) not importing class in generated wrappers. 	

## 1.2.0 (2017-04-27)
Bugfixes:
  - WI19630 Split the runTestMethods method.

## 1.1.4 (2017-03-21)
Features:
  - WI19204 Remove warnings to generate source code.

## 1.1.3 (2017-03-01)
Bugfixes:
  - WI19204 JUnit Addon Preprocessor: error when Java source of a test is not valid.

## 1.1.2 (2017-02-13)
Bugfixes:
  - WI19077 Missing package declaration in generated test classes.

## 1.1.1 (2017-02-09)
Bugfixes:
  - WI18758 NullPointer exceptions for tests in default package.
Features:
  - WI18782 Add support for Ignore annotation.

## 1.1.0 (2017-01-25)
Features:
  - WI18782 Add support for Ignore annotation.

## 1.0.2 (2016-16-26)
Bugfixes:
  - WI18427 Use NameEpr.getName() to find the simple name of the annotation.

## 1.0.1 (2016-11-02)
Bugfixes:
  - Fixed packaging to include dependencies in the .adp file.
   
## 1.0.0 (2016-10-24)
Features:
  - Initial revision.