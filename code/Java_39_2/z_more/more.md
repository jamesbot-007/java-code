## Commmand you see while working with java

### java -cp \<classpath\> \<MainClass\>

-cp (or classpath) is used to specify the classpath when the class file is not present in current working directory.

- `<classpath>` can be list of directories, JAR file, or ZIP file that JVM should search for classfile.
- for multiple path, use (;) as seprator on windows and on other os use (:)
- if you do not specify class path the deafault class path is curent working directory.

### set classpath
It is command used in windows os to set classpath as environment variable **for current command-line session**.(till terminal is open)

Example : `set classpath=C:\Java\bin`

you can set multiple classpath also, `set classpath=C:\Java\bin;C:\Java\lib\some-library.jar`


- Once you se the path you can run the program without explicitly specifying the classpath in java command
```bash
java MyApp
```

The difference between  java `-cp` and `set classpath` is 
-cp is used for one command only
whereas set classpath is for entire one terminal session


---

## What is JAR file ?
A JAR(Java ARchive) is package that bundle multiple files together, including compiled java files, images, etc. into a single compressed file. it uses a ZIP format and hsa a `.jar` extension
```bash
jar cf MyApp.jar MyApp.class Helper.classs config.properties
```
- `c` : create
- `f` : filename(MyApp.jar)



- It help Easy to distribute java program and libraries
- A jar can have a Main-Class manifest file that we can run by using jar 
```bash
java -jar MyApp.jar
```

mainly used to distribute program and crate libraries like mysql-connector-java.jar 


The `config.properties` is like .env file. It is plain text file. It is simple text file used to store configuration stroing for programs. These configurations are stored in kwy-value pair.

##### This way the `config.properties` looks like,
```plaintext
# Database Configuration
db.url=jdbc:mysql://localhost:3306/mydatabase
db.user=root
db.password=12345

# Application Settings
app.name=My Application
app.version=1.0.0

# File Paths
log.file.path=/var/log/myapp/logfile.log
temp.dir=/tmp

```

chnage settings withour modifying the code.
- key-value pair seprated by =,: and # are used for comments 

---

## JVM with zip files
JVM can read .clss file inside a .zip file, but only if the .zip is treated as jar file. By defult JVM can not recognize .zip file directly. as part of class path we need  to explicitly mention the

A .jar file essentially a .zip file with .jar extension. The JVM knows how to read .jar files because it knows specific convention having a META-INF/MANIFEST.MF fle for metadata 

Example of using .zip file directly
1. we have .zip file : my-classes.zip
my-class.zip
|--com
    |--example
        |--MyApp.class

2. To JVM recognoze it specify .zip as classpath
java -cp my-classes.zip com.exmaple.MyApp

OR 
rename .zip to .jar
mv my-classes.zip my-classes.jar
java -cp my-classes.jar com.exmaple.MyApp

---

## What is manifest file
A manifest file in java is special metadata file included in jar file. it is named as MANIFEST.MF and is stored in META-INF  directory. The manifest file provide information about jar file for JVM

manifest file 

```plaintext
Manifest-Version: 1.0
Main-Class: com.example.MyApp
Class-Path: lib/library1.jar lib/library2.jar
```
- Manifest-Version: Version of the manifest file format.
- Main-Class: Specifies the entry point for the program (the class with the main method).
- Class-Path: Specifies additional JAR files or directories the JVM should load.

---

## official site to publish java packages
https://mvnrepository.com/