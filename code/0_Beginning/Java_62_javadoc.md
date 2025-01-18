## Advance java 2

Generate documentation for your java code 
reading documentation is easy comapre reading comments inside code 
java doc is command line utility that helps to generate documentation of java code. It create documentation in html(html,css,js) format. 

From intellij IDE : Tools > generate JavaDocs
That docs look very similar to Java's official documentation

When we learn about JDK we say it contains some tools along with JVM. Javadoc is one of them tool. 

## Tags for for class & Package
There are  some tags for package, class and method specific.
A java doc should must be positioned above class and below package otherwise not work properly.

java doc above method means documentation for method
java doc above class means documentation for class


- Tags for class
    - \<Description\> 
    - @author
    - @version
    - @since 
    - @see 
    
- Tags for methods 
    - \<Description\> 
    - @param args  : Arguments supplied to the method
        -  @params i : variable i passed as argument
        -  @params j : variable j passed as argument
    - @return  : return value and it's type 
    - @throws Exeption if i is 0.          // if method is throeing exception
    - #deprecated : If method is deprecated then write a wanrning description


and for more you can refer to the documentation of Oracle java. 


## Create java doc 

add doc string to .java file
> `/** */` format
and run javadoc command

javadoc -d doc .\Java_63_javadoc.java
javadoc -d doc *.java                       // for all files in current directiory

open index.html

> Note: once generating documentation if you modified doc string in .java file then you again need to generate documentation. Just by refreshing the documentation will not update












---
---
---

<summary>
<details>
Java documentation generation by command line 
</details>



The `javadoc` command-line utility is used to generate API documentation in HTML format from Java source code. This utility extracts documentation comments (written in the special `/** */` format) from the source code and creates well-structured documentation.

Here’s a quick guide on how to use the `javadoc` utility:

---

### **Prerequisites**
1. **Install Java Development Kit (JDK)**: Ensure that the JDK is installed and the `JAVA_HOME` environment variable is properly set. The `javadoc` tool is included in the JDK.
2. **Java Source Code**: Have a Java file that includes documentation comments (`/** */`) for classes, methods, and fields.

---

### **Syntax**
```bash
javadoc [options] [packagenames] [sourcefiles] [@argfiles]
```

---

### **Steps to Generate Documentation**

#### 1. **Write Documentation Comments in Your Code**
In your Java code, include comments using `/** */` for classes, methods, and fields.

Example: `MyClass.java`
```java
/**
 * This class demonstrates the usage of Javadoc.
 * 
 * @author Mayank
 * @version 1.0
 */
public class MyClass {

    /**
     * This method adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * This method prints a greeting message.
     */
    public void greet() {
        System.out.println("Hello, World!");
    }
}
```

---

#### 2. **Run the `javadoc` Command**
Run the `javadoc` utility in the terminal or command prompt.

```bash
javadoc -d docs MyClass.java
```

- `-d docs`: Specifies the output directory (`docs`) for the generated HTML files.
- `MyClass.java`: Specifies the source file to process.

---

#### 3. **View the Generated Documentation**
1. Navigate to the `docs` directory.
2. Open `index.html` in a browser to view the generated documentation.

---

### **Common Options**
Here are some commonly used options for `javadoc`:

| Option                   | Description                                                    |
|--------------------------|----------------------------------------------------------------|
| `-d <directory>`         | Specifies the output directory for HTML files.               |
| `-sourcepath <path>`     | Specifies the path to the Java source files.                 |
| `-subpackages <package>` | Processes all classes in a package and its sub-packages.     |
| `-author`                | Includes the `@author` tag in the generated documentation.   |
| `-version`               | Includes the `@version` tag in the generated documentation.  |
| `-private`               | Shows all classes and members, including `private`.          |
| `-classpath <path>`      | Specifies the classpath for referenced classes.              |

---

### **Example: Generate Documentation for a Package**
If you have a package structure like this:

```
src/
├── com/
│   ├── example/
│       ├── MyClass.java
```

Run:
```bash
javadoc -d docs -sourcepath src -subpackages com.example
```

This will generate documentation for all classes in the `com.example` package.

---

Let me know if you need further clarification or assistance!
</summary>














