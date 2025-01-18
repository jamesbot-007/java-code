// Inside same package we can not have two class with same name. it give error
// But if files are in same directory then it doesn't give error

// Access modifier specifies where the property/method is accessible 
// public,private,protected,default
/* 
 * Modifier | classs | Package | Subclass | world 
 * -------- | ------ | ------- | -------- | ----- 
 * Public   |  Y     |  Y      |  Y       |  Y 
 * Protected|  Y     |  Y      |  Y       |  N 
 * Default  |  Y     |  Y      |  N       |  N 
 * Private  |  Y     |  N      |  N       |  N  
 */

// getter : must returns something, not take argument
// setter : take as argument and set value for attribute, do not return anything

// When the attribute name and argument name both are same OR when you're working multiple with multiple objects in the method then you can use "this" keyword. "this" refers to 'address od the object'. 

class Employee {

    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }


    public void setName(String n){
        name = n;
    }
    public String getName()
    {
        return name;
    }



}



/* 
// Contructor :
 * constructor is special type of member function, whose name is same as class name  
 * It is used to intialize the object
 * 
 * constructor does not resturn anything, donesn't have return type
 * But it should have access modifier and that should be public. otherwise there is no mean of creating constructor
 * constructor 'automatically called' as soon as object is created 
 */ 

// Constructor overloading 
// It same as method overloading
// constructor can have different signature/parameter list.




class Student{
    private String name;
    private int salary ;

    // Default constructor
    public Student(){
        name = "None";
        salary = 0;
    }
    

    // Parameterize constructor
    Student(String n, int s){
        name = n;
        salary = s;
    }

    // constructor overloading
    Student(int s){
        salary = s;
    }

    Student(String n){
        name = n;
    }


    public void show(){
        System.out.println("name " + name);
        System.out.println("salary " + salary);
        System.out.println();
    }


}


public class Java_23_getter_setter_constructor{
    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.setId(10);
        System.out.println(obj.getId());


        System.out.println(obj.getName());
        obj.setName("James");
        System.out.println(obj.getName());

        // Constructor

        // Student s1 = new Student();
        // s1.name = "James";
        // s1.salary = 100;

        Student s1 = new Student("James", 100);
        s1.show();

        
        // To know object belongs to which class
        System.out.println(s1.getClass());
        // Another way
        System.out.println(s1 instanceof Student); // return boolean

        
    }
}

// if there is no constructor then class will create a empty defult constructor for object which is not visible 

/* 
 * public Employee(){
 *      
 * }
 */


// if you created a paramterized constructor then is wise move to create a defult constructor 


