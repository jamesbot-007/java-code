class MyTherad1 extends Thread{
    
    @Override
    public void run() {
        for(int i=0; i<100;i++) {
            System.out.println("Welcome" + i );
            try {                
                Thread.sleep(100);  // 100 miliseconds
            } catch (Exception e) {
                System.out.println(e);                
            }
        }
    }
}
class MyTherad2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {

            System.out.println("Good Morning!" + i);
            System.out.println(this.getState());            
            try {
                Thread.sleep(1000);     // 1 sec       
                System.out.println(this.getState());           
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyTherad3 extends Thread{
    @Override
    public void run() {

            System.out.println("Good Morning!");
            System.out.println(this.getState());            // return Runnable (Ready to run)
            try {
                Thread.sleep(2000);     // 2 sec       
                System.out.println(this.getState());            // return Running
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}

public class Java_50_practice {
    public static void main(String[] args) {
        MyTherad1 T1 = new MyTherad1();
        MyTherad2 T2 = new MyTherad2();
        
        // T1.setPriority(6);
        // T2.setPriority(9);

        // get Priority                               // New thing
        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());

        T1.start();
        T2.start();

        System.out.println(Thread.currentThread());     // return Currently running thread
        


        // Comment out line 58 and 59 to see the below code's output 
        // Determine state of Thread
        MyTherad3 T3 = new MyTherad3();
        System.out.println(T3.getState());  // retuns new
        T3.start();



    }   
}
