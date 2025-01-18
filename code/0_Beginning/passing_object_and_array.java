class Demo2{

    String name;

    Demo2(){
        System.out.println(this + " object is created");
    }
    
    // passing method object to method
    boolean isEqual(Demo2 obj){
        if (this.name == obj.name)
            return true;
        return false;    
    }

}


public class passing_object_and_array {
    public static void main(String[] args) {
        
        // array of objects
        Demo2 obj[] = new Demo2[5];     // remember here you should not call the constructor

        obj[0] = new Demo2();
        obj[1] = new Demo2();
        obj[2] = new Demo2();

        obj[0].name = "foo";
        obj[1].name = "foo";
        obj[2].name = "bar";

        System.out.println(obj[0].isEqual(obj[1])); // true
        System.out.println(obj[0].isEqual(obj[2])); // false    


    }
}
