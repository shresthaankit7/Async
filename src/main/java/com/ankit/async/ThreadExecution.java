package com.ankit.async;

/**
 * Created by ankit07 on 1/26/17.
 */
public class ThreadExecution {

    public static void main(String[] args) {

        System.out.println("ThreadExecution Thread Name::::" + Thread.currentThread().getName());

        FirstThread firstThread = new FirstThread();
        firstThread.start();

        for (int i = 0; i < 50; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);
    }
}

class FirstThread extends Thread{
    public void run(){
        System.out.println("FirtThread Name:::: " + FirstThread.currentThread().getName());
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
                System.out.print ('*');
            System.out.print ('\n');
        }
    }
}
