package ExceptionsInJava.VideGolovach.Lection2;

/**
 * Created by Александр on 27.12.2015.
 */
public class E2

{
    public static void main(String[] args)
    {
        System.out.println(0);
        try
        {
            System.out.println(1);
            if (true)
            {
                throw new RuntimeException();
            }
            System.out.println(1);
        }
        catch
                (NullPointerException e)
        {
            System.out.println(2);

            if (true)
            {
                throw new RuntimeException();
            }
            System.out.println(2);
        }

        catch (Exception e)
        {
            System.out.println(3);


            if (true)
            {
                throw new RuntimeException();
            }
            System.out.println(3);
        }
        catch (Throwable e)
        {
            System.out.println(100);
        }
        finally {
            System.out.println(4);
            if (true)
            {
                throw new RuntimeException();
            }
            System.out.println(4);

        }
        System.out.println(5);
    }
}