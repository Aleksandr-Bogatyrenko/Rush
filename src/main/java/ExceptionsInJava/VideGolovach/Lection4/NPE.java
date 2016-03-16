package ExceptionsInJava.VideGolovach.Lection4;

/**
 * Created by Александр on 30.12.2015.
 */
public class NPE
{
    public static void main(String[] args) throws InterruptedException
    {
        double a = 0;
        int d = 0;
        double c = a/d;
        System.out.println(c);
        NPE inf = new NPE();
        inf.a();

    }
    public void a() throws InterruptedException
    {
        int k=1;
        while (true){
            k*=3;
            System.out.println(k);
            {
                Thread.sleep(100);


            }
        }

    }

}

