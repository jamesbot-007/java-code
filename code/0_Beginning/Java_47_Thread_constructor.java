
// Contructors
// Thread()
// Thread(String)

// Thread(Runnable)
// Thread(Runnable, string)


class MyThread extends Thread {

    public MyThread(String name){

        // Thread class already have contructor that takes "name" as paramater using it we can assign name to the Thread.

        super(name);
        // Note: Only the constructor of child class can call constructor of parent class  not other method of child class can call. using super(name). Because it ensur parent class is properly initialized before child start it's initialization.
        
    }


    @Override
    public void run(){
            System.out.println( this + " thread is Running" );
    }
}




public class Java_47_Thread_constructor {
    public static void main(String[] args) {
        
        MyThread myThread = new MyThread("T1");
        myThread.start();

        // After there is started we can access it's properties
        // we can acces the name assigned to threat by getName()
        
        System.out.println(myThread.getName());

        /* Thread class is best example of Abstraction */
        // no need to learn everythin. just learn most commonly used methoda and then you learn as you need 



        // same way access "id" of thread
        // System.out.println(myThread.getId());    // depreciated
        System.out.println(myThread.threadId());

        /* when program teminate along with it thread is also terminate */

        // ----------------------------------------------------------------

        MyThread2 obj = new MyThread2();
        Thread thread_obj = new Thread(obj, "web request");
        thread_obj.start();

        System.out.println("name = "+thread_obj.getName());


    }
}

// In java classes should be in it's logical order for code readability but if is not then ok. not effect on execution.
class MyThread2 implements Runnable {
    public MyThread2() {
        System.out.println("Object of MyThread2 is created");
    }


    // public MyThread2(String name){
    //     super(name);
    // }

    // You must need to overide the run() method when you implement Runnable interface. otherwise it gives error.
    @Override
    public void run() {
        System.out.println("MyThread2 is running");
    }
}




/*Explain
 * 
 * First we create object of MyThread class. till then the Thread is created not called.
 in constructor we call parent's constructor using "super" it initialize thread with name "T1"
 * when we call myThread.start() method. It starts execution of thread of myThread. start() method intenally invoke run() method internally but not immediately that thing is managed by **Java Thread Scheduler**
 * 
 * The line myThread.getId() and myThread.threadId() . This line does not wait till the tread start. before starting it return id and name assigned to the Thread.
 * 
 * Then we create object of MyThread2
 *
 
Q. so when/in which situation Java Thread Scheduler execute myThread object and run it's run() method.

Ans. 
Thread execution order is not deterministic(can not be determined). The JVM(Java Virtual Machine) relies on the operating system's thread scheduler to determine which thread to execute when.

in our code, main thread starts execution that execute getName(), threadId(), while myThread which was started earlier by myThread.start() may be waiting in waiting queue for CPU and to exectute it's run() method. so, when main thread stops it starts it execution

run() method immediately run 

 */

// ThreadGroup 
// Another thing that we can use in Thread constructor
// we can create thread group. that create group of thread that have similar functionality
// we can pass the thread group as an argument to the Thread() constructor