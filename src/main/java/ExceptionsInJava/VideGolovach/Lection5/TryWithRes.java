package ExceptionsInJava.VideGolovach.Lection5;

import java.io.*;

/**
 * Created by Александр on 04.01.2016.
 */
public class TryWithRes
{
    public static void main(String[] args) throws IOException
    {

            FileInputStream in = null;
            FileOutputStream out = null;
        try{
            in = new FileInputStream("d:/temp.txt");
            out = new FileOutputStream("d:/temp1.txt");
        }
        finally
        {
            closeQuirtly(in);
            closeQuirtly(out);

        }

    }
    private static void closeQuirtly(Closeable closeMe) throws IOException{
        if (closeMe != null){
            closeMe.close();
        }
    }

}
