package ExceptionsInJava.VideGolovach.Lection5;

import java.io.*;

/**
 * Created by Александр on 04.01.2016.
 */
public class InputStream
{
    public static void main(String[] args) throws FileNotFoundException
    {

        try
        {
            try (FileInputStream in = new FileInputStream("d:/tmp/xyz.txt"); FileOutputStream out = new FileOutputStream("d:/tmp/xyz1.txt")){

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}


