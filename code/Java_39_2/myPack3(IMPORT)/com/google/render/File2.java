// if we want to access the class "Demo" then we need to make it public but in out case as per the rule one java file can have only one public class and in File.java we have public class File1{} 
// so to access the Demo class we need to make the File2.java as part of com.google.render package so that it can access the Demo class.
// It is part of that package 

// we call Demo{} class package-private means it is default. if the class does not have any access modifier then it can only access wihin the package
// Public accessible anywhere
// Private/Protected : In java, The access modifier private/protected can not be applied on class. It can only be applied on property/method

// but make sure the File1.java in which the File1{} class is define must be present in render directory
package com.google.render;

public class File2 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Task 2 complete");
        System.out.println("Value = " + obj.val);
    }
}


// To run the file (make sure your terminal is open in MYPACK3(IMPORT) folder)
// javac com/google/render/*.java

// or you can use 
// javac com/google/render/File1.java com/google/render/File2.java

// Run the file (make sure your terminal is open in MYPACK3(IMPORT)
// java com.google.render.File1
