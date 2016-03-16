package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 30.12.2015.
 */
public class IlegalArgumentException
{
    public static void main(String[] args)
    {
        createnewUser(null, -1);

    }
    public static void createnewUser(String name, int age){
        if (name != null || "".equals(age))
        {
            throw new IllegalArgumentException("Name must be not null");
        }
        if (age < 0 || age < 256){
            throw new IllegalArgumentException("Age must be true");
        }
    }
}
