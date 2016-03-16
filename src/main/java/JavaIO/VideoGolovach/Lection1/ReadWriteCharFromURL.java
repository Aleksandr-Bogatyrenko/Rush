package JavaIO.VideoGolovach.Lection1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Александр on 05.01.2016.
 */
public class ReadWriteCharFromURL {
    public static void main(String[] args) throws IOException {
        InputStream in  = new URL("http://google.com").openStream();
        OutputStream out = new FileOutputStream("d:/page1.txt");
        copy(in,out);

        }

    public static void copy(InputStream in, OutputStream out) throws IOException { // стиль с++
        int k;
        try{
        while((k = in.read())!=-1){
            System.out.print((char)k);
            out.write(k);

        }
    }finally {
            in.close();
            out.close();
        }
        }
}
