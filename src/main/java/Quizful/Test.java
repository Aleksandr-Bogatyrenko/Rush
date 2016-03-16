package Quizful;

/**
 * Created by Александр on 08.01.2016.
 */
public class Test {
    int i = 1;

    void add(int i) {
        i += i;
        System.out.println(i);
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.add(10);
    }
}