package JavaIO.VideoGolovach.Lection5Files;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Александр on 15.01.2016.
 */
public class App0 {
    public static void main(String[] args) {
        String [] names = new File("d:/tmp/").list();
        System.out.println(Arrays.toString(names));

        File file = new File("d:/tmp/xxx.txt");
        System.out.println(file.isFile());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());


    }
}
