

    // OOPS match real world things with programming
    // OOP is for solving near by world problems 
    // It's like you want to learn Java then you have to first learn Object Oriented Programming

    // using OOPS we follow DRY principle : Do not Repeat Yourself.
    //  so that we can change all the occurences by changing only one thing. same way, Deleting one thing remove it from everywhere.

    // Rome was not build in a day

    // class is template. it doesn't take memory only the code and static method, properties associated with class takes memory.
    
    // object is instance of class. memory only allocate after object creation

    // Terminology
    // class, Attributes or properties, method
    // Abstaction : hiding internal details
    // Not understand able and no need to understand because work is going well 
    // Show only information 
    // Phone circit betwork connection, camera button.
    // Ex . Android sdk
    
    
    // Encapsulation : 
    // Put multiple things in single box
    // Example : Laptop, car

    //     Inheritance: using old thing create new better thing.
    // Drive  things from prototype
    // It implement dry very well

    // Polymorphism 
    // Phone has Calculator and MP3 plyer and camera



    // Note : One java file can have only one public class
    // and if we don't specify then by default access modifier is "default"

    // OOPs decrease gap between real world and programming world
    // Method name looks like real world work


class Employee{

    // If property is private then obejct can not directly access it.
    // Alhough, only mathod of class can access it 
    // Alhough, only mathoed of class canc access it 
    private int id = -1;
    String name; 
    int salary = 0;

    public void setId(int i){
        id = i;
    }
    public void getSalary(){
        System.out.println(salary);
    }

    public void incrementSalary(int a){
        salary += a;
        System.out.println("salary incrememeted by " + a);
    }

    public void info(){
        System.out.println("id \t: \t" + id);
        System.out.println("name \t: \t" + name);
        System.out.println("salary \t: \t" + salary);
        
    }

}

public class Java_22_oops {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.id =1 ; error
        emp.setId(1);
        emp.name = "James";
        emp.salary = 2000;

        emp.getSalary();
        emp.incrementSalary(1000);
        emp.getSalary();


        Employee emp2 = new Employee();
        // emp2.id =2 ;
        emp2.setId(2);
        emp2.getSalary();

        emp.info();
        emp2.info();

        // if "name" property is not assigned, also it doesn't have some by default value then it gives null not a  garbage value.

    }
}
