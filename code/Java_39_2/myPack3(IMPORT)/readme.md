when we want to use Demo{} class in File2.java that time File1.java must be present in render folder not in MYPACK3(IMPORT) folder that thing gives you error.
**Q.** but why ? what the File2.java needs i.e. Demo{} class it is alread present in render folder then why it give error. ?
like this 

myPack3
├── com
│   └── google
│       └── render
│           ├── File1.java
│           ├── Demo.class
│           └── File2.java
|── File1.class

`Ans`

The package decalration in java is depends on logical structure of the classes. not depends on physical location of file system.
The logical structure means the decalred package stmt at top of java file.

File1.java decleres` package com.google.render;` This means file1 and Demo logically belongs to the package com.google.render.

if we don't add the package stmt in file2.java it consider as part of default package and this way it can not be intrect with classes of com.google.render package.

Let's address the asked question,
**Files belogs to the same package must reside in same direciory** `Java Rule` relative the root folder where you're running javac and java commands


if you place Fil1.java in different directory MYPACK3(IMPORT) instead of com/google/render the java compiler can not resolve package content correctly.
First of all it assume all files belongs to same package are in same folder or not 
- Demo is package-private.
- The compiler assumes all files of the same package (com.google.render) are compiled together and reside in the correct directory structure.
If File1.java is outside the correct folder (com/google/render), the compiler gets confused, as it expects all package-related files to exist in the same directory. 

- During compilation, the Java compiler uses this structure to resolve classes that belong to the same package.
If you violate this rule (e.g., place File1.java in myPack3 instead of com/google/render), the Java compiler cannot link the Demo class to its package properly, even if the Demo.class file exists in the right folder.
Solution : put Fil1.java in com/google/render
---
Even the File2.java only references the `Demo` class file, The Demo class originally declared in File1.java/ **Java relies on source structure to compile correctly**
The compiler might not find Demo during compilation (because Demo is tied to File1.java in the package context).
Thus, both the .java and .class files must adhere to the declared package and directory structure for everything to work seamlessly.

---
In short, There is rule of java. The files belongs to same package should be present in same Directory if you don't follow the rule java give error. 
it is as simple as that, java rule for declaration of vairable `(access_modifier) datatype variable_name = value;` if you don't follow the rule and write something else like this `variable = value` then it gives error.