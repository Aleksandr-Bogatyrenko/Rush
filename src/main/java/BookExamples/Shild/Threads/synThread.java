package BookExamples.Shild.Threads;

/**
 * Created by Alex on 26.09.2016.
 */
public class synThread implements Runnable {
    Thread t;
    synThread() {
        t = new Thread(this, "Demo thread" );
        System.out.println("Дочерний поток создан");
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний Поток прерван");


        }
        System.out.println("Дочерний поток завершен");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        new synThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный Поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}