package ExceptionsInJava.VideGolovach.Lection1;

/**
 * Created by Александр on 21.12.2015.
 */
public class Ex
{
    public static void main(String[] args) throws Throwable
    {
        try
        {
            boolean status = Load();
            System.out.println("Status = " + status);
        }
        catch (RuntimeException e)
        {
            System.out.println("Sorry");


        }
        System.out.println("Next Step" );
    }
            private static boolean Load () {
            return 1/1 <42;
        }


    }