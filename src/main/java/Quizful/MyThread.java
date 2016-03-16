package Quizful;

/**
 * Created by Александр on 08.01.2016.
 */

    public class MyThread extends Thread {
    public MyThread(String s) {
    }

    public void run() {
            System.out.println("I'm Running!");
        }

        public static void main(String[] args) {
            System.out.println("About to run thread");
            new MyThread("Run, Thread, Run!").start();
        }
    }
