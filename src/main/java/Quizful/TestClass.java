package Quizful;

/**
 * Created by Александр on 08.01.2016.
 */
class TestClass {
    int i = getInt();
    int k = 20;
    public int getInt() {  return k+2;  }
    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.i + "  " + t.k);
    }
}
