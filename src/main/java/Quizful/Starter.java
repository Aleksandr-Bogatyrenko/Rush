package Quizful;

/**
 * Created by Александр on 06.01.2016.
 */

    public class Starter extends Thread {
        private int x = 3;

        public static void main(String[] args) throws Exception {
            new Starter().makeItSo();
            System.out.println(1);
        }

        public Starter() {
            x = 12;
            start();
        }

        public void makeItSo() throws Exception {
            join();
            x = x - 1;
            System.out.println(x);
        }

        public void run() { x *= 2; }
    }
