package JavaIO.VideoGolovach.Lecton2;

import javax.print.DocFlavor;
import javax.swing.event.UndoableEditListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Александр on 06.01.2016.
 */
public class Strem2
{
    public static void main(String[] args) throws IOException {
        try (
            InputStream in = new URL("http://www.ru").openStream() ;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
        ){copy(in, out);
            byte[]data = out.toByteArray();
            String str = new String(data, "UTF8");
            System.out.println(str);
        }


    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        byte[]buf = new byte[64];
        int count;
        while((count=in.read(buf))!=-1){
            out.write(buf, 0, count);
        }
    }
}
