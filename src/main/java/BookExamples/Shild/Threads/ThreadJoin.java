package BookExamples.Shild.Threads;

/**
 * Created by Alex on 27.09.2016.
 */
public class ThreadJoin implements Runnable {
    String name;
    Thread t;

    ThreadJoin(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try {


            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println(name + "Thread interupted");

        }
        System.out.println(name + "Thread end");
    }

}
class DemoJoin{
    public static void main(String[] args) {
        ThreadJoin ob1 = new ThreadJoin("one");
        ThreadJoin ob2 = new ThreadJoin("two");
        ThreadJoin ob3 = new ThreadJoin("three");
        System.out.println("Thread one start : " + ob1.t.isAlive());
        System.out.println("Thread two start : " + ob2.t.isAlive());
        System.out.println("Thread three start : " + ob3.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main stream is interrupted");

        }
        System.out.println("Thread 1 enter : " + ob1.t.isAlive() );
        System.out.println("Thread 2 enter : " + ob2.t.isAlive() );
        System.out.println("Thread 3 enter : " + ob3.t.isAlive() );

    }
}
