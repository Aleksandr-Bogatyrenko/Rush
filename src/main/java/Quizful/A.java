package Quizful;

/**
 * Created by Александр on 08.01.2016.
 */
class A {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

class B extends A {
    int i = 1;                                        // 1
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        B b = (B) new A();                            // 2
        System.out.println(b.increment());
    }
}