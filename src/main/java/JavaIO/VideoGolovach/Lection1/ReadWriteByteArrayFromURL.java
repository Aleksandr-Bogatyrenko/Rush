package JavaIO.VideoGolovach.Lection1;

import java.io.*;
import java.net.URL;

/**
 * Created by Александр on 05.01.2016.
 */
public class ReadWriteByteArrayFromURL {
    public static void main(String[] args) throws IOException {
        InputStream in  = new URL("http://google.com").openStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        copy(in,out);
        byte[]data = out.toByteArray();
        String str = new String(data,"UTF8");
        System.out.println(str);

    }

    public static void copy(InputStream in, OutputStream out) throws IOException { // стиль с++
        int k;
        try{
            while((k = in.read())!=-1){

                out.write(k);

            }
        }finally {
            in.close();
            out.close();
        }
    }
}

