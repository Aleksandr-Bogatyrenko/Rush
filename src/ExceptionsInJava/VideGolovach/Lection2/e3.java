package ExceptionsInJava.VideGolovach.Lection2;

/**
 * Created by Александр on 28.12.2015.
 */
public class e3
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
