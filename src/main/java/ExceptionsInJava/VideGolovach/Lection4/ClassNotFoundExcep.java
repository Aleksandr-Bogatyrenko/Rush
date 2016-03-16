package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 30.12.2015.
 */
public class ClassNotFoundExcep
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class class0 = Integer.class;
        Class class1 = "Hello".getClass();
        Class class2 = Class.forName("com.lib.MyClass");

    }
}
