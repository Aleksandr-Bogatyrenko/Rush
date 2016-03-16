package JavaIO.VideoGolovach.Lection1;

import java.io.*;

/**
 * Created by Александр on 05.01.2016.
 */
public class SimpleIO {
    public static void main(String[] args) throws IOException {


    }
    public static void copy(InputStream in, OutputStream out) throws IOException {
        int k;
        while(true){
            k = in.read();
            if (k == -1){
                break;}
                else{
                    out.write(k);
                }
            }
        }
    }

