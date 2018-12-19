[![API](https://img.shields.io/badge/API-16%2B-red.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![Build Status](https://travis-ci.org/wupdigital/android-maven-publish.svg?branch=master)](https://github.com/Krunal-Kevadiya/RxPreference)
[ ![Download](https://api.bintray.com/packages/kevadiyakrunalk/MyFramework/rxpreference/images/download.svg) ](https://bintray.com/kevadiyakrunalk/MyFramework/rxpreference/_latestVersion) 
[![License](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](https://opensource.org/licenses/Apache-2.0)

# RxPreference

* you can use two ways simple and with RxJava also it will apply ENCRYPTION MODEL, so your data will be secure.
* Code :-
```java
   /*initilization of preference object*/
   RxSharedPreferences mRxSharedPreferences = 
            new RxSharedPreferences(
            EncryptedPreferences.getInstance(
            getActivity() /*Activity object of given class*/, 
            "sample", /*Preference file name*/
            "example" /*Preference file password*/));
  /*save value in preference*/
  mRxSharedPreferences.putString("Name" /*key name of value save in file*/, 
                                 "abc" /*value if you want to save*/);
 /* get value fro preference */
```
-> Gradle
```groovy
//add dependencies for app level build.gradle
repositories {
    jcenter()
}
dependencies {
  compile 'com.kevadiyakrunalk:rxpreference:1.0@aar'
}
```
-> Maven
```xml
<dependency>
  <groupId>com.kevadiyakrunalk</groupId>
  <artifactId>rxpreference</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```
