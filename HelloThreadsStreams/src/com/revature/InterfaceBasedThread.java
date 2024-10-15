package com.revature;

public class InterfaceBasedThread implements Runnable{

    //Remember, the run() method defines what our custom Thread does when we run it
    @Override
    public void run() {

        //this method will run through a for loop and print a message
        //we're going to make some Threads race

        String name = Thread.currentThread().getName();
        System.out.println(name + " has started!");

        for(int i = 0; i < 10; i++){

            System.out.println(name + " is on iteration: " + i);

            //TODO: might add some delay here

        }

        System.out.println(name + " has finished!");

    }

}
