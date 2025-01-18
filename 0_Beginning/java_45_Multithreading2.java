
// Mk : Make your vs code as light weight as possible to increse performance
// delete not required extensions
// disable required but not in use extensions


class MyThread1 implements Runnable {

    // Runnable interface also provided by java and same as `Thread` class. we need to override run() method

    // while overriding make sure about access modifiers is public and return type is void because both thing matters in method overriding
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread1");
        }
    }
    
}
class MyThread2 implements Runnable {
    
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread2");
        }
    }
    
}

public class java_45_Multithreading2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // t1.start();
        // t2.start();

        // using Runnable interface we can not use start method because, it is like it is not implemented
        // Analogy: it is like you throw the bullet and wihout loading in gun. so let's load it in gun.
        // for each bullet(t1 object) we need to create gun. after creating gun we need to fit bullet in it.
        
        // Thread gun = new Thread(bullet);
        
        
        // This is rule of java when you use Runnable interface to create Thread this is procedure same as after creating class we need to create object to use it.
        // menans, create Thread object and pass Runnable

        Thread obj = new Thread(t1);
        
        // now we can start run() method using Thread object 'obj'
        obj.start();
        
        
        // same way
        Thread obj2 = new Thread(t2);
        obj2.start();

    }
}


// means a class that implements the interface Runnable that's object we need to pass as argument to Thread constructor. 
// internally we can there is custructor overloading happend and when we pass object to Thread() object's run() will override the Thread's run()