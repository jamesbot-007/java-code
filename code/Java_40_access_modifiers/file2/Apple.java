package file2;
import file.MyClass2;
// we are in usine file2 package and we're importing package form some another package file.MyClass



// 3. take a class from another package and extend it.
// with interitance
class Banana extends MyClass2{

    // it access public and default protperty/methods of Parent class.
    void show(){
        System.out.println(class2_public);
        // System.out.println(class2_private);  // error message     
        System.out.println(class2_protected);       
        // System.out.println(class2_default);  // error message
    }
    
}



// 4. take a class from another package but not extend it.
// wihout inheritace means we're in globe

public class Apple {
    public static void main(String[] args) {

        System.out.println("3. show method's result");
        Banana b = new Banana();
        b.show();
        
        
        
        System.out.println("\n4. Globally");
        MyClass2 obj = new MyClass2();
        System.out.println(obj.class2_public);
        // System.out.println(obj.class2_private);          // error message
        // System.out.println(obj.class2_protected);        // error message
        // System.out.println(obj.class2_default);          // error message
    }


}
