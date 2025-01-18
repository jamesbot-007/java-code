// package JAR_tutorial.com.example;
package com.example; // above line not give error

class Helper{
    int val = 10;
}

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// terminal is opened in: JAR tutorial

// compile java program
// javac -d . MyApp.java

// run
// java com.example.MyApp


// Note : make sure to move MyApp.java in com/example folder


// Create a jar file (Not this run next command with manifest file)
// jar cf MyApp.jar .\com\example\MyApp.class .\com\example\Helper.class config.properties

// java -jar .\MyApp.jar  



// *** For custom manifest ***
// create manifest.txt and run the command 
// jar cfm MyApp.jar manifest.txt -C . .


// Jar is used with packages
// manifest is used with jar. (Again and agin power will increase)