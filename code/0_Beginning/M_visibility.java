// In java,  it is not like parent's protected thing becomes private in child class. the interitence in java does not change thhe access modifier.
// only follow the access specifier table
// bro it is java not C++(in which after inheritence the access modifiers are changed).


// In java, we can not reduce the visibility of inherited method(method we override in child class). 
class Demo1{
    protected void display(){
        System.out.println("display in demo1");
    }
    void show(){
        System.out.println("show in demo1");
    }

    private void myPri(){
        System.out.println("private");
    }

}
class Demo2 extends Demo1{
    protected void display(){
        System.out.println("display in demo2");
    }

    // private void display(){} // error

    // protected --> public 
    // also, default --> public 
    // this way we increase the visibility of method
    // Note: default provide less visibility as compare to public
    // there is no "default" keyword it is just name(like access specifier) that we use when there is no acess specifier  

    // and private method can not access outside the class

    @Override
    public void show(){
        System.out.println("show in demo2");
    }


    
    // @Override
    // public void myPri(){
        //     System.out.println("This private ");
    // }
}

    // Here we're not overriding the method instead of it. we create another method belongs to Demo2 class.
    // see the @Override gives error because method is not overridden
    

public class  M_visibility  {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.display();   
        d2.show();
    }
}