package BookExamples.Shild.Threads;

import ExceptionsInJava.VideGolovach.Lection3.Thr;

/**
 * Created by Alex on 28.09.2016.
 */
public class Callme  {
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");

    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "to synchronized");
        Caller ob3 = new Caller(target, "World");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted.");
        }

    }

}