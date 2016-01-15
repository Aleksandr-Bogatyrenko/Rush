package JavaIO.VideoGolovach.Lection3;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by Александр on 08.01.2016.
 */
public class App01 {
    public static void main(String[] args) throws IOException {
        write();
        read();

    }
    public static void read() throws IOException {

        File file = new File("d:/XXX.txt");
        InputStream inputStream0 = new FileInputStream(file);
        InputStream inputStream1 = new BufferedInputStream(inputStream0);
        InputStream inputStream2 = new GZIPInputStream(inputStream1);

        DataInput dataInput = new DataInputStream(inputStream2);

        System.out.println(dataInput.readDouble());
        System.out.println(dataInput.readDouble());
        System.out.println(dataInput.readDouble());

        inputStream2.close();

    }
public static void write() throws IOException{


        File file = new File("d:/XXX.txt");
        OutputStream outputStream0 = new FileOutputStream(file);
        OutputStream outputStream1 = new BufferedOutputStream(outputStream0);
        OutputStream outputStream2 = new GZIPOutputStream(outputStream1);
        DataOutput dataOutput = new DataOutputStream(outputStream2);

    for (int i = 0; i <1_000_000 ; i++) {
        dataOutput.writeDouble(123E123);
    }


        outputStream2.flush();
        outputStream2.close();


    }
}
