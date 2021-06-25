TOC
---
- [0  Introduction](#0-introduction) <br/>
- [1  Setup](#1-setup) <br/>
- [2  Example](#2-example) <br/>
- [3  Future Plan](#3-future-plan) <br/>

 0 Introduction
---------------

![merdiven-logo](https://github.com/bzdgn/merdiven/blob/main/misc/merdiven.bmp)

**Merdiven** is a simple generic statement builder for generic purposes. During different development projects, there was the need to have a generic statement builder that produces immutable statements thus I've created this open-source project.


[Go back to TOC](#toc)


 1 Setup
--------

You can simply add **merdiven** to your project as a maven dependency;

```xml
<dependency>
    <groupId>io.github.bzdgn</groupId>
    <artifactId>merdiven</artifactId>
    <version>0.0.1</version>
</dependency>
```


[Go back to TOC](#toc)


 2 Example
----------
**Merdiven** is easy to use. A simple example to produce a statement is as follows;

```java
Statement statement = builder
        .add("firstName", "Levent")
        .and()
        .add("lastName", "Divilioglu")
        .add("number", "717")
        .add("github", "bzdgn")
        .openBracket()
            .add("type", "Engineer")
            .or()
            .add("type", "Guitarist")
        .closeBracket()
        .build();
```

And the string output is as follows;

```
firstName="Levent" and lastName="Divilioglu" number="717" github="bzdgn" ( type="Engineer" or type="Guitarist" ) 
```


[Go back to TOC](#toc)


 3 Future Plan
--------------

As a Camel user, I want to dig into the Camel components and want to create a camel component for **merdiven**. Also json/xml conversions may be added to the project.


[Go back to TOC](#toc)

