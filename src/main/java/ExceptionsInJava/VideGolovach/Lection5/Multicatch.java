package ExceptionsInJava.VideGolovach.Lection5;

import java.io.IOException;

/**
 * Created by Александр on 04.01.2016.
 */
public class Multicatch
{
    public static void main(String[] args)
    {
        try
        {
            if (true)
            {
                throw new IOException();
            } else
            {
                throw new InterruptedException();
            }

        }
        catch (InterruptedException | IOException e){
            e.printStackTrace();

        }
    }
}



