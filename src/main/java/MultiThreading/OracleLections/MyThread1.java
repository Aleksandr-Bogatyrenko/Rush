package MultiThreading.OracleLections;

/**
 * Created by Александр on 31.01.2016.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {


        System.out.println("In run method Thread name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        while (true) {
            Thread Thread1 = new MyThread1();
            Thread1.start();




        }

    }
}