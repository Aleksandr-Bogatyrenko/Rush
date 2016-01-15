package ExceptionsInJava.VideGolovach.Lection3;

/**
 * Created by Александр on 29.12.2015.
 */
public class Thr
{
    private String message;
    private Thr cause;

    public Thr(){}

    public Thr(Thr cause){}

    public Thr(String message) {}

    public Thr (String message, Thr cause){}

    public String getMessage;

    public Thr getCause;

}
class Exception extends Thr{
}

class Test extends Exception{
    public static void main(String[] args)
    {
        System.out.println(new Exception().getCause);
    }
}