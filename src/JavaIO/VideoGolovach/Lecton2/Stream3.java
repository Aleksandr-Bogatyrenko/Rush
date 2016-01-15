package JavaIO.VideoGolovach.Lecton2;

import java.io.*;
import java.net.URL;

/**
 * Created by Александр on 07.01.2016.
 */
public class Stream3 {
    public static void main(String[] args) throws IOException {
        try (
                InputStream in = new URL("http://dom2.ru").openStream();
                OutputStream out = new PallOutputStream(new FileOutputStream("d:/test21"))
        ){copy(in, out);

        }


    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        byte[]buf = new byte[2000];
        int count;
        while((count=in.read(buf))!=-1){
            out.write(buf, 0, count);
        }
    }
}
