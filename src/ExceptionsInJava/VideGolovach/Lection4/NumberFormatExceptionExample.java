package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 03.01.2016.
 */
public class NumberFormatExceptionExample
{
    public static void main(String[] args)
    {
        int port;

        try{
            port = Integer.parseInt(args[0]);

        }catch (NumberFormatException e){
            throw new IllegalArgumentException("sdfsdfsdgsdgsdgsgsd", e);
        }
    }
}
