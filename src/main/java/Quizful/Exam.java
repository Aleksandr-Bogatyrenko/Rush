package Quizful;

/**
 * Created by Александр on 08.01.2016.
 */
public class Exam  {
    public static void main(String[] arg) {
        Object obj = null;
        String str = new String("str");
        System.out.println(1);
        str = (String) obj;
        obj = new String("obj");
        System.out.print(obj + ", " + str);
    }
}
