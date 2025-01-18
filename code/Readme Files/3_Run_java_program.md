## basically we use,
javac main.java   (compile java file. It convert main.java --> main.class)
java main         (Run java file. It runs main.class file)

Running a javac command also known as creating a build
build means crating a human-readable code to machine-code

In traditional Programming languages like C,C++, Java include build process for linking and compilation purpose or process.


## Advance things
#### Running both with single command
javac main.java && java main

#### After compilation put the class file in perticular folder instead of current directiory
javac -d directory_path Java_file
javac -d out main.java

`-d` : directiory path

#### Run a .class from anywhere using relativepath
java -cp Path_to_class_file main
java -cp out main

`-cp` : class file path

---

As we see writing `main.class` is not necessary we can write `main` only and it will work. But that doesn't mean `main.class` gives error. we can use `main.class` also.
