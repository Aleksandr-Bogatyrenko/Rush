package ExceptionsInJava.VideGolovach.Lection2;

/**
 * Created by Александр on 27.12.2015.
 */
public class E1
{
    public static void main(String[] args)
    {
        System.out.println(f());
    }
    public static int f(){
        try{
            if(true)
            throw new RuntimeException();
        }

        finally
        {
           return 0;

        }

    }
}
