
class Base{
    public int value;
    
    public Base(){
        this.value = 0; 
        System.out.println("Base class constructor");
    }

    // Copy constructor
    public Base(Base object){
        this.value = object.value;
    }

}

public class Java_26_copy_constructor {
    public static void main(String[] args) {

        Base b1 = new Base();
        System.out.println(b1.value);
        
        b1.value = 100;
        System.out.println(b1.value);

        Base b2 = new Base(b1);
        System.out.println(b2.value);

    }
}
