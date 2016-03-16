package JavaIO.VideoGolovach.Lection5Files;

import java.io.File;

/**
 * Created by Александр on 17.01.2016.
 */
public class LookFor
{
    public static void main(String[] args) {
        File file = new File("d:/tmp");
        print(file);
    }
    public static void print(File root){
        if(root.isFile()) {
            System.out.println(root);
        }

            else{
            File [] fileArray = root.listFiles();
            for (File file: fileArray)
            {
                print(file);
                
            }

            }
        }

}
