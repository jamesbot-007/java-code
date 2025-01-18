Publishing Java Library so that others can use it 
- fist make your package unique such as `com.example.myLibrary`
- add **pom.xml** if you're using maven
- build project using maven or gradle
- create JAR file using build automation tool(Maven,gradle)

> Platforms for publishing package
- maven (mostly used)
- JitPack
- Github packages
- Bintray

> See other people's publishes package
- [Maven Central Repository](https://search.maven.org/)
- [JitPack](https://jitpack.io/)
- GitHub packages
- Apache Software Foundation: Libraries hosted by the Apache Foundation.
- Google’s Maven Repository: Popular for Android development.


---


> How to use someones hosted package
> Prequiesite : Learn maven

### **How to Install and Use a Package from Maven Central Repository**

Maven Central Repository is the largest repository for Java libraries. If someone has published a package on Maven Central, you can easily add and use it in your Java project. Here's a step-by-step guide:

---

### **Step 1: Find the Package on Maven Central**

1. **Go to Maven Central Repository**:  
   URL: [https://search.maven.org/](https://search.maven.org/)

2. **Search for the Package**:  
   Enter the name of the library, groupId, or artifactId in the search bar.  
   For example, if you're looking for the `Gson` library (used for JSON parsing), search for "Gson."

3. **Get the Maven Dependency Code**:  
   Once you find the package, you will see the dependency snippet in XML format.  
   For example, for `Gson`, you might see this:
   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.9</version>
   </dependency>
   ```

---

### **Step 2: Add the Dependency to Your Project**

#### **For Maven Projects**:
1. Open your project's `pom.xml` file.
2. Add the dependency snippet inside the `<dependencies>` section:
   ```xml
   <dependencies>
       <!-- Other dependencies -->
       <dependency>
           <groupId>com.google.code.gson</groupId>
           <artifactId>gson</artifactId>
           <version>2.8.9</version>
       </dependency>
   </dependencies>
   ```

3. Save the file. Maven will automatically download the library and its dependencies when you build the project.

#### **For Gradle Projects**:
1. Open your `build.gradle` file.
2. Add the dependency in the `dependencies` block:
   ```gradle
   dependencies {
       implementation 'com.google.code.gson:gson:2.8.9'
   }
   ```

3. Save the file. Gradle will sync the project and download the library.

---

### **Step 3: Use the Package in Your Code**

Once the package is added to your project, you can use its classes and methods.

#### **Example: Using Gson**
If you added `Gson` for JSON parsing, you could write code like this:
```java
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Serialize an object to JSON
        MyObject obj = new MyObject("John", 25);
        String json = gson.toJson(obj);
        System.out.println("Serialized JSON: " + json);

        // Deserialize JSON to an object
        String jsonString = "{\"name\":\"Jane\",\"age\":30}";
        MyObject deserializedObj = gson.fromJson(jsonString, MyObject.class);
        System.out.println("Deserialized Object: " + deserializedObj.getName());
    }
}

class MyObject {
    private String name;
    private int age;

    // Constructor, Getters, and Setters
    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

#### Output:
```
Serialized JSON: {"name":"John","age":25}
Deserialized Object: Jane
```

---

### **Step 4: Verify the Dependency is Downloaded**
Maven or Gradle will automatically download the required JAR files and store them in your local repository:
- **Maven**: `.m2` directory (usually located in `~/.m2/repository`)
- **Gradle**: `.gradle` directory (usually located in `~/.gradle/caches`)

You don't need to manage these files manually.

---

### **Step 5: Build and Run Your Project**
1. **Maven**:
   - Use `mvn compile` to compile the project.
   - Use `mvn exec:java` to run the project (if using the `exec-maven-plugin`).

2. **Gradle**:
   - Use `gradle build` to build the project.
   - Use `gradle run` (if you have a `JavaExec` task configured in your `build.gradle` file).

---

### **Key Tips for Using Maven Central Packages**
- **Check Documentation**: Visit the library's GitHub or official documentation page for usage examples.
- **Version Management**: Always specify the exact version in your `pom.xml` or `build.gradle` to avoid unexpected updates.
- **Check Compatibility**: Ensure the library version is compatible with your Java version.

---

Let me know if you'd like help setting this up in a specific IDE like IntelliJ IDEA or Eclipse!





















