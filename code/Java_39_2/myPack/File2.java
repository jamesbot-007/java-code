// In Java_39_1_Package have `package myPack;` for that statement IDE like VS Code. Ecllipse, etc.. will give error. But program rus.
// becuase as per the java standards The java file that is used to create package it should be present in directiory whose name is same as package name.

// Default behaviuor of `javac` : compiler compile the code and produce the .class file in current directory.
// That time if you have `package myPack;` . But your class file is created in your current directiory and  java expect directory structure myPack/file1.class. so java file1 gives error.
// visit temp folder

// Solution : if your java file is not in direcioty whose name same as package name then you can use `javac -d . file1.java`
// -d option is used to create sub directory where .class file should be created. and (.) means create a sub directiory in current working directory.

// After that running a file also has different
// Without a package decalratio in java file the clas is part of default package. so the java runtime(Java) can find the .class file without needin a package name because it is part of default package.
// when we declare package in java file. the .class file is tied up with the package. now it is not part of default package.  also it is located in directiory whose name same as package name.
// java run time can not find it that's why we need to specify package also while running java file. java myPack.File2

// Note : java file with default package can not be imported onnly java file with same package can be imported.
/* 
 
The behavior changes because of **how the Java runtime (`java`) works with packages and fully qualified class names**.

When you include `package myfiles;` in your Java code and compile it with the `javac -d .` command, it creates a `.class` file in a directory structure corresponding to the package name. This changes how the Java runtime expects to locate and execute the compiled class file.

---

### Summary of Behavior

| **Compilation Command**         | **Resulting `.class` Location** | **Run Command**       |
|----------------------------------|----------------------------------|------------------------|
| `javac file1.java`               | `file1.class` (current dir)     | `java file1`          |
| `javac -d . file1.java`          | `myfiles/file1.class`           | `java myfiles.file1`  |

---


 */

// Note : By default java.labg.*; is imported in every java file. That has classes like System, String, etc ...

// Creating package
package myPack;

// A package in Java is essentially a namespace that organizes classes and interfaces. Think of it as a folder in your file system.
// Pakage menas Compile once,Resuee the bytecode that is what slogan of Java.

public class File2 {
    public static void main(String[] args) {
        System.out.println("File1.java");
    }
}
