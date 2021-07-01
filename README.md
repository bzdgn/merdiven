TOC
---
- [0  Introduction](#0-introduction) <br/>
- [1  Setup](#1-setup) <br/>
- [2  Example](#2-example) <br/>
- [3  TODO List](#3-todo-list) <br/>
- [4  Future Plan](#4-future-plan) <br/>

 0 Introduction
---------------

![merdiven-logo](https://github.com/bzdgn/merdiven/blob/main/misc/merdiven.bmp)

[![Maven Central](https://img.shields.io/maven-central/v/io.github.bzdgn/merdiven.svg)](https://search.maven.org/artifact/io.github.bzdgn/merdiven)

**Merdiven** is a simple generic statement builder for generic purposes. During different development projects, there was the need to have a generic statement builder that produces immutable statements thus I've created this open-source project.


[Go back to TOC](#toc)


 1 Setup
--------

You can simply add **merdiven** to your project as a maven dependency;

```xml
<dependency>
    <groupId>io.github.bzdgn</groupId>
    <artifactId>merdiven</artifactId>
    <version>0.0.2</version>
</dependency>
```


[Go back to TOC](#toc)


 2 Example
----------
**Merdiven** is easy to use. A simple example to produce a statement is as follows to produce a **json** object;

```java
Statement statement = builder
		.openBracket()
			.openCurlyBracket()
				.add("name", "Levent", ":", "\"")
				.and(",")
				.add("id", "717", ":", "\"")
				.and(",")
				.add("isOccupied", "true", ":", "\"")
				.and(",")
				.addParam("info", "\"")
				.eq(":")
				.openCurlyBracket()
					.addParam("languages", "\"")
					.eq(":")
					.openBracket()
						.addParam("english", "\"")
						.and(",")
						.addParam("turkish", "\"")
						.and(",")
						.addParam("dutch", "\"")
					.closeBracket()
				.closeCurlyBracket()
			.closeCurlyBracket()
		.closeBracket()
		.build();
		
System.out.println(statement.toString());
```

And the output will be as follows;

```[ { "name":"Levent" , "id":"717" , "isOccupied":"true" , "info" : { "languages" : [ "english" , "turkish" , "dutch" ] } } ]
```

Pretty printed output will be;

```json
[
    {
        "name": "Levent",
        "id": "717",
        "isOccupied": "true",
        "info": {
            "languages": [
                "english",
                "turkish",
                "dutch"
            ]
        }
    }
]
```

Or to make an undefined query by your own as follows;

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
        
System.out.println(statement.toString());
```

And the string output is as follows;

```
firstName="Levent" and lastName="Divilioglu" number="717" github="bzdgn" [ type="Engineer" or type="Guitarist" ]
```


[Go back to TOC](#toc)


 3 TODO List
------------

- Field to list structure will be added.
- Configuration object to be implemented for generic templates


[Go back to TOC](#toc)


 4 Future Plan
--------------

As a Camel user, I want to dig into the Camel components and want to create a camel component for **merdiven**. Also json/xml conversions may be added to the project.


[Go back to TOC](#toc)

