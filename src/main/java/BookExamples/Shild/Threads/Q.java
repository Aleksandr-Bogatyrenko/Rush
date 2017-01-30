package BookExamples.Shild.Threads;

import com.sun.xml.internal.ws.client.sei.ValueSetter;

/**
 * Created by Alex on 29.09.2016.
 */
public class Q {
    int n;
    boolean ValueSet = false;
    synchronized int get(){
        while (!ValueSet)
            try {
                wait();

            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        System.out.println("Get " + n);
        ValueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (ValueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Int");
            }
        this.n = n;
        ValueSet = true;

        System.out.println("Send " + n);
        notify();
    }
    }
class Produser implements Runnable{
    Q q;
    Produser (Q q){
        this.q = q;
        new Thread(this,"Sender").start();

    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Costumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
class PC{
    public static void main(String[] args) {
        Q q = new Q();
        new Produser(q);
        new Consumer(q);

        System.out.println("For end press Ctrl+c");
    }
}