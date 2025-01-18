// concurantely : Do multiple things but one by one.Ex: one main thread
// parallelism : Do multiple things at same time.Ex: more than one thread

// without threading
// suppose you make request on internet and you wait for response (even the wait is for 100 miliseconds you wait) that time you wait

// with threading
// instead of waiting we run another function. it another function also waits then execute next function and so on... 


// create a new thread
class MyThread1 extends Thread {
    // Thread belongs to java.lang.Thread
    
    @Override
    public void run() {
        // while(true){
        //     System.out.println("Cooking...");
        // }

        int i = 0;
        while( i < 10000){

            // System.out.println("My Thread is Running");
            System.out.println("Cooking..." + i);
            i++;
        }
    }
}

// create another thread
class MyThread2 extends Thread {
    
    // while(true){
    //     System.out.println("Cooking...");
    // }

    
        @Override
        public void run() {
            
            int i = 0;
            while( i < 10000){
    
                // System.out.println("My Thread2 is Running");
                System.out.println("Learning..." + i);
            i++;
        }
    }
}

public class  java_44_multithreading  {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); // it internally runs the run() method
        t2.start(); 

        // That implementation written in Thread.java we don't need to worry about it.

    }
}

// Run the program and immediately stop it 
// then check output for some time it runs thread 1 and for some time it runs thread 2 untill they completed execute. here both are in while loop they were not executed/completed

// to solve this thing we run loop for a large no. of times and we can see in output it runs both thread one by one this we we get faster execution and we can see parallism. This is the way how we say thread running at same time. 
// actully cpu can not process two things at same time. but for assume 2 unit of time cpu execute thred 1 then 2 unit of time cpu execute thred 2 this way we can say both are running parallely not concurrently(one function excuted completely then another function)

// if thread is not taking any input still after a random number of executions it runs another thread
    // - The JVM's thread scheduler determines how the CPU time is allocated to each thread.
    // - Each time you run the program, the output might be different because the thread scheduler may allocate CPU time differently.
    // Since the scheduler decides how to allocate CPU time, you cannot predict the exact sequence of "Cooking..." and "Learning..." messages.


// pros/ cons
// concurrency (multiprogramming)           : High speed, low performance.
// prallisum (multitasking/multithreading)  : Low speed, High performance.
// you can revise OS notes if needed. (but if you understand(just, keep it in mind) then you don't need to revise )

// you can search on google : Thread method in java + oracle 


