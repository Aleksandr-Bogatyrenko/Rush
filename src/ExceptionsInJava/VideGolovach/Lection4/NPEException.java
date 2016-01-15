package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 03.01.2016.
 */
public class NPEException
{
    public static void main(String[] args)
    {
        Object x = null;
        x.toString();
    }
}
