
abstract class Telephone{
    abstract void ring(); 
    abstract void call(); 
    abstract void disconnect(); 
}

class SmartPhone extends Telephone{

    // implement the abstract methods of the Telephone class

    @Override
    public void ring(){
        System.out.println("Ringing");
    }

    @Override
    public void call(){
        System.out.println("Calling");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnecting");
    }

    
    // concrete method 
    public void service(){
        System.out.println("Service");
    }
    boolean hasBattery(){
        return  true;
    } 
}

public class Java_37_practice_abstract_interface {
    public static void main(String[] args) {
         
        // Dynamic method dispatch with abstract class
        Telephone t = new SmartPhone();
        t.ring();
        // t.service(); // error 
        // t.hasBattery(); // error
    }
}
