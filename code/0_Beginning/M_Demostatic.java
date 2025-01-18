class Demo{
    static int val = 10;
    int val2 = 12;

    void show(){
        System.out.println("Value in " +this+ " = " +val);
    }

    static void incr(){
        System.out.println(val++);
        // System.out.println(val2); // error
    }

}

public class M_Demostatic {
    
    public static void main(String[] args) {
       Demo obj = new Demo(); 
       obj.show();

        // System.out.println(obj.val); // no error but not reccommended

        // obj.incr(); // error

        Demo.incr();
        Demo.incr();
        Demo.incr();

        // This is proof each object share static proeprty
        obj.show();


        Demo d2 = new Demo();
        d2.show();
    }
}
