Package name should not camelcase or not pascal case
- all letter should be in small caps
- words are seprated by dot(.) it creates sub packages(folder) for modularity.
- start the name with organization's domain in reverse to avoid conflict at global level.
- avoid reserved words int,void,main

Ex : Example.com

package : com.example.projectname.module
not : com.Example.projectname.Module

**It is java standards**



### Quick Recap of Java Naming Conventions
| Entity         | Convention    | Example                    |
|----------------|---------------|----------------------------|
| **Package**    | lowercase     | `com.example.myproject`    |
| **Class**      | PascalCase    | `LibraryService`           |
| **Interface**  | PascalCase    | `DataProvider`             |
| **Method**     | camelCase     | `calculateTotal()`         |
| **Variable**   | camelCase     | `bookCount`                |
| **Constant**   | UPPER_SNAKE   | `MAX_BOOKS`                |


# Folder structure

standard folder structure

```
project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── App.java
│   │   │           ├── utils/
│   │   │           │   └── Utils.java
│   │   │           └── services/
│   │   │               └── Service.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── AppTest.java
│       └── resources/
│           └── test-config.properties

```

src/main/java : Application main code files
src/main/resources : Application configuration files. that are non-code files such as XML
src/test/java : Test code files
src/test/resources : resources used for resting and Test configuration files. 

Use this folder structure for
- IDE friendly project
- maven, gradle like build tools
- maintain scalability of code 