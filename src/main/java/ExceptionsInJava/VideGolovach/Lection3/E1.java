package ExceptionsInJava.VideGolovach.Lection3;

import java.lang.*;

/**
 * Created by Александр on 29.12.2015.
 */
public class E1
{
    public static void main(String[] args)
    {
        try{
            f();
        } catch (Throwable t){
            StackTraceElement [] stack = t.getStackTrace();
            System.out.println(stack.length);
            for (int i = 0; i <stack.length ; i++)
            {
                System.out.println(stack[i].getMethodName());

            }
        }



    }
    public static void f(){
        h();

    }
    public static void h(){
        int b = 1 / 0;

}

}
class T1{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();


        new Thread(new Runnable()
        {
            public void run()
            {
                while (true)
                {
                    System.out.println("Hello");
                    try
                    {
                        Thread.sleep(1000);

                    }
                    catch (InterruptedException e)
                    {
                    }
                }
            }
        }).start();
    }
}

