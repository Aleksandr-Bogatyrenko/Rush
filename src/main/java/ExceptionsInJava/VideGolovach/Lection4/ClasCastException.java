package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 30.12.2015.
 */
public class ClasCastException
{
    public static void main(String[] args)
    {
        f(new int[0]);
    }
    private static void f(Object arg){
        String x = (String) arg;

    }
}
