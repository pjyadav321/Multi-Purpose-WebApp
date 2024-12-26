package practice;
/*
Methods of thread class:
 start() : used to start execution of the thread
 run(): is the entry point for a thread's execution in Java.  The run() method is defined in the Runnable interface
 sleep(): sleeps the thread for specified amount of time
 getPriority(): used to return the thread priority.
 setPriority(): Used to change the priority of the thread // by default 5
 getName(): Used to get the name of the provided thread.
 interrupt(): Used to interrupt the execution of the thread
 */


class MyThread extends Thread {

    public void run(){
        try{
            for (int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(5000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread is interuppted: " + e);
        }
    }

}

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();

        t1.setPriority(1);
        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Name of the Thread t1: " + t1.getName());

        t1.start();

        t1.interrupt();
    }
}

//resume(), destroy()