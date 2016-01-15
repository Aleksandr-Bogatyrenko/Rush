package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 03.01.2016.
 */
public class OutOfMemoryErrorExcample
{
    public static void main(String[] args)
    {
        long [] array = new long[Integer.MAX_VALUE];
    }
}
