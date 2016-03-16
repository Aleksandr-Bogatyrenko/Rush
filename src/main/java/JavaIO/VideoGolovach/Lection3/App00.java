package JavaIO.VideoGolovach.Lection3;

import java.io.*;

/**
 * Created by Александр on 08.01.2016.
 */
public class App00 {
    public static void main(String[] args) throws IOException {

        Writer writer0 = new OutputStreamWriter
                (new FileOutputStream(
                        new File("d:/XXX.txt")));

        writer0.write(new char[]{'A', 'B', 'C'});

        Writer writer1 = new FileWriter(
                new File("d:/XXX.txt"));

        writer1.write(new char[]{'A', 'B', 'C'});
    }
}