package BookExamples.Shild.Threads;

/**
 * Created by Alex on 24.09.2016.
 */
public class Current {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Main thread " + t);

        t.setName("second Tread");

        System.out.println("After thread rename " + t);

        try{
        for (int i = 5; i > 0 ; i--) {
            System.out.println("time " + i );
            Thread.sleep(1000);
        }
        }catch (InterruptedException e){
            System.out.println("Thread main is interupted");
        }

    }
}
