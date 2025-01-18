#### There are two different ways to create Thread
1. extend Thread
2. implementing Runnable Thread
    - we need to pass object of class that implements the interface to the Thread() constructor by creating a new object of Thread

## Life Cycle of Thread
There are different stages :-

1. New: instance of Thread is created 
2. Runnable : apply start() function on Thread
Thead scheduler can select that thread for running. means Now thread can be run that's why it calle Runnable
3. Running : when Thread scheduler run thread, it is called Running 
4. Non Runnable stage : When a thread is waiting for input, respose from server, etc..
for that much time cpu should not be idle so thread scheduler put it in non runnable state
- untill each thread is entirely not finished, scheduler execute it (if time is not specified or if therer is not input wait, not sleep then for a **Random** amount of time)
Analogy : indian shadi me kaha lene jana. and pet bharane pe ruk jana.
5. Terminated : Thead executed completely and terminated(deleted/destroyed).

> There can be multiple thereds Ex: 15 to 20 at same time 


### We can set prioprity of threat
Then it will be like high priority Threat should execute first and treat with lower priority execute later.
Ex:
- high priority : Database connnectivity
- low priority : Serve and update data as API route

