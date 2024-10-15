package com.revature;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("========================(Threads)");

        //Instantiate two Threads (from InterfaceBasedThread)
        InterfaceBasedThread thread1 = new InterfaceBasedThread();
        InterfaceBasedThread thread2 = new InterfaceBasedThread();

//        thread1.run();
//        thread2.run();

        //This^ doesn't look concurrent at all... we didn't actually create new Threads
        //We just ran the run() method, but we needed the start() method to invoke a new thread
            //That's why we saw "main----" in the output

        //Let's use start() to instantiate 3 Threads
        Thread t1 = new Thread(thread1);
        t1.start();

        Thread t2 = new Thread(thread2);
        t2.start();

        //NOTE: it doesn't matter what Thread we use in the constructor, as long as it's a valid one
        Thread t3 = new Thread(thread2);
        //t3.setName("Cool Named Thread"); //we can name Threads if we want!

        //We'll also try to set this Thread with the highest priority
            //This doesn't necessarily mean it will start and finish first, but will be given more CPU time
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();




        System.out.println("========================(Streams)");

    }

}
