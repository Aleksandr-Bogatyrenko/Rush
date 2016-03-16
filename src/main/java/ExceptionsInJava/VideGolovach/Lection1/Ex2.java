package ExceptionsInJava.VideGolovach.Lection1;


/**
 * Created by Александр on 22.12.2015.
 */
public class Ex2
{
    public static void main(String[] args) throws Throwable
    {
        System.err.println(0);
        try
        {
            System.err.println(1);
            throw new NullPointerException();

        }
        catch (NullPointerException e)
        {


            if (true)
            {
                throw new RuntimeException();

            }
            System.err.println("r");
        }


        System.err.println(4);
    }
}
