## Why we use multithreading ?
Analogy : different waiters are serving different food 

Generally, we wait untill completing one proces after completion of one process we start another process.
Instead of that while the one process is running we start another process this is called multithreading. increase optimization, save time.

Multiprocessing and Multithreading both are used to achieve multitasking.

**multitasking**/**multiuser** : multiple user at same computer
**multiprocessing** : one same os different process are running simultaneously

when we want to do multitasking within a process that time we use threads 
Ex: chrome tab send data to chrome server also save data to database


Thread is part of process. Thread(s) shares the memory of process
It is lightweight and procss is heavy weight.
** Topic of Operating System

- Thread use share memory
- Fast content switching. means thread can communicate with each other faster another words CPU can load another thread when one is busy in user IP or H/W access.
- thread is lightweight and process is heavy weight. That's why we're not using multiprocessing we're using **multithreading**. multiprocessing take more memory, more computation resources. can overwhelm computer.
- threads are independent
Ex : In word document. auto saving has a thread, kwy listner has a thread.


wihout thread : methods are working simultaneously. one method execute at a time
with thread : parallel threads execution. more than one method execute at a time

This way we can decrease execution time.


## Creating a thread in java (2 ways)
1. Extend Thread class
2. By implementing Runnable interface

---

# Thread in os
A **thread** is the smallest unit of execution within a process. while a process is independent in executio, a thread is lightweight, small components of process that can execute independently and concurrently with other threads within the same process.

Thread within the same process share
- code section
- data section
- opened files

each thread has its own
- program counter
- register
- stack

# Thread in java
Threads are used to achieve **multitasking** by running multiple task concurrently. The `thread` class and `Runnable` interface in the java. The `java.lang ` package are used for create and manage threads.

#### Mathdos of thread class
- start : start the thread
- run : entry point of thread, contain code to be executed.
- sleep(milicsecond) : pause the thread for specific time
- join : wait for thread to die. It is like th thread join to the main thread
- isAlive : check if thread is running
- getName : retrive name of the thread


#### Difference between creating thread using Thread class and Runnable interface

Thread class
- Inherit `thread` class directly
- can not extend any other class due to java support single inheritance only
- code writtein in `run()` method of `Thread` class

Runnable interface 
- implements the Runnable interface
- Allow extending another class
- code is written in `run()` method pf the class implementing `Runnable`

- Actully name of interface is `Runnable` that's why it is called Runnable interface
