class MyThread extends Thread {
    public MyThread(String name){
        super(name);
 
    }
    @Override
    public void run(){

        for( int i = 0; i <10; i++ )
            System.out.println( this.getName() + " thread is Running" );
    }
}
class MyThread2 extends Thread {
    public MyThread2(String name){
        super(name);
 
    }
    @Override
    public void run(){

        // while(true){
        //     System.out.println( this.getName() + " thread is Running" );

        //     // we can make a sleep/ means stop thread \
        //     // sleep method also called in try...catch because there is chance thread is already sleeping. so to avoid error we use try...catch
        //     try {
        //         Thread.sleep(400);       // sleep() is static method that can be accessible by class name
        //                                         // it takes argument in mili seconds 
        //     } catch (Exception e) {
        //         System.out.println(e.getMessage());
        //     }

        // }


        for(int i = 0; i<20;i++){
            System.out.println( this.getName() + " thread is Running " + i);

     
            try {
                Thread.sleep(400);       
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}


public class Java_49_Thread_method {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Alfa");
        MyThread t2 = new MyThread("Beta    ");
        
        
/*          
        t1.start();
        t2.start(); */
    

        // we know both run parallely. (after sometime both get some time of exeuction). 
        // also Which thread execute first that thing is random you can see it bu running above line multiple times. 
        // but we want like untill the t1 is not completed t2 will not start.

        /*
         // t1.start();
         // t1.join();  // means join my t1 thread to the main thread. and execute(delete) t1. 
         // t2.start();
         */

        // but the thing is may be t1 is executed before the call of t1.join() we made for that type of warning. it gives error.
        // so we need to put it in try...catch block and handel the intruptedException 


/* 
        t1.start();

        // try...catch is used to prevent our program from crash. we can handle the error.
        try {
            t1.join();
        }catch (InterruptedException ie){

            // If thread is already interrupted(already being stopped by JVM) then we handle that error(exception)
            System.out.println(ie.getMessage());
        }

        t2.start(); */

        // now each time first t1 will run, executed then t2 will run


        // ----------------------------------------------------------------

        MyThread2 t3 = new MyThread2("Delta");
        MyThread t4 = new MyThread("Charlie     ");


        t3.start();
        t4.start();

        // when t3 starts as soon as the t3 sleeps for 400 miliseconds, and then t4 execute
        // after t4 execution is completed (or t4 go in sleep) then t3 will run

        // [Note for commented run() method]
        // In our code, there is t3 runs a lot will not executed(completed and deleted) but t4 runs limited times after that it executes(completed and deleted) 


        // after performing each iteration delata takes sleep of 400 miliseconds
        try {
            t4.join();
        } catch (Exception e) {
            // if due to some reason the code in try block will not execute then it will run below line 
            System.out.println(e.getMessage());
        }
    }    
}



// Q. a situation when thread prints catched error message ?
// Ans. for that you can use thread.intrupt(). it is method to intrupt thread explicitly then you will error and that is handled by try...catch

// Thread is topic of OS(Operating System)
// here you know OS subject.
// But in future if you encounter something like, there is requirement to learn that subject(e.g. microservices) that  you don't know then you can search for one shot of that to understand things very well.
