

class MyThread extends Thread {
    public MyThread(String name){
        super(name);
 
    }
    // @Override
    // public void run(){
    //         System.out.println( this.getName() + " thread is Running" );
    // }
    @Override
    public void run(){

        for( int i = 0; i <1000; i++ )
            System.out.println( this.getName() + " thread is Running" );
    }
}


public class  Java_48_Thread_priority  {
    public static void main(String[] args) {
        
        // The java virtual machine contains a "Ready queue"
        // ready queue is maitained by the JVM. it provide CPU and memory to each thread
        // we can specify thread priorities for each thread

    
        // There are some constants that is used to set Thread priority

        // min      = 1  , java.lang.Thread.MIN_PRIORITY = 1            
        // normal   = 5  , java.lang.Thread.NORM_PRIORITY = 5           // if priority is not set, default value is normal priority
        // max      = 10 , java.lang.Thread.MAX_PRIORITY = 10

        MyThread t1 = new MyThread("Alfa");
        MyThread t2 = new MyThread("Beta (Medium)");
        MyThread t3 = new MyThread("Charlie");
        MyThread t4 = new MyThread("Delta (Most Important)");
        MyThread t5 = new MyThread("Emma");

        t3.setPriority(Thread.MAX_PRIORITY);        
        t2.setPriority(2);             // we can pass an integer also
                                                    // using constant is make the code more readable and easy to understand.
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // use commented run() method and,
        // Run this and in every execution you see different output
        // which thread gets execution is dependent on OS, CPU. when cpu becomes free and exeucte what it depends on it. 

        // by setting the priority 
        // we can mention which thread execute most 

        // It is like each thread run for some time(each time the "time" is different that thing depends on CPU how execution it perform) and after that another will run
        // every thread run untill the task(e.g. getting response of a request) is not completed. when completed thread exeucuted(deleted)

        // even we set priority still at the end how the htreads are executed it depends on CPU.

    }
}