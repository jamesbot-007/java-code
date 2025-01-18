// Access Modifier
// Access modifier determines wheather other classes can use proeeprty/method of current class. 
// Ex: public, private, protected, default 

// Note : default is not modifier it is when you do not used any modifier. explicitly you should not add "default" it gives error message.

/* 
Modifier | within |  within | inheritance | global 
Modifier |  class | Package | Subclass    | world 
-------- | ------ | ------- | ----------- | ----- 
Public   |  Y     |  Y      |  Y          |  Y 
Protected|  Y     |  Y      |  Y          |  N 
Default  |  Y     |  Y      |  N          |  N 
Private  |  Y     |  N      |  N          |  N   


** same package **
1. within package : same pakage but differet classs

2. within the package : not inheritence just one class try to access proeprty and method of another class by creating it's object

** outside package. Inherit a class from anothe package **
Note : if a file is present in default package(no in any package) then we can not inhherit/import(reuse) it.

3. subclass : same as above but via inheritance

*/
package file;

class Demo{
    public int num_public = 10;
    private int num_private = 11;
    protected int num_protected = 12;
    int num_default = 13;

    // 1. Within the class we can access all modifiers
    void show(){
        System.out.println("calling show() ....");
        System.out.println("num_public\t: " + num_public);
        System.out.println("num_private\t: " + num_private);
        System.out.println("num_protected\t: " + num_protected);
        System.out.println("num_default\t: " + num_default);
    }
    // the method is default menas where we can access the default values their we can also access above method
}






// 2. same package but different class or we can say (with/Without inheritance) in another class 
public class  MyClass {
    public static void main(String[] args) {
        

        Demo obj = new Demo();
        System.out.println(obj.num_public);
        // System.out.println(obj.num_private); // error 
        System.out.println(obj.num_protected);
        System.out.println(obj.num_default);

        obj.show();

    }


}