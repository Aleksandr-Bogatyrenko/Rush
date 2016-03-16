package ExceptionsInJava.VideGolovach.Lection1;

/**
 * Created by Александр on 27.12.2015.
 */
public class Ex3
{
    public static void main(String[] args)
    {
        try
        {

            a();
        }
            catch (Exception e){
                System.out.println(1);
            }
        System.out.println(2);

    }

    private static void a()
    {
        b();
        System.out.println("A");
    }

    private static void b()
    {
        c();
        System.out.println("B");
    }

    private static void c()
    {
        throw new RuntimeException();

    }
}