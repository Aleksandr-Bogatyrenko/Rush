package JavaIO.OracleEx;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Александр on 19.01.2016.
 */
public class ReadByteStream {
    public static void main(String[] args) {
        File file = new File("d:/tmp/Test2.txt");

        byte[]  ClasIndifier = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        try{
            FileInputStream stream = new FileInputStream(file);
            byte[] buffer = new byte[4];

            if(stream.read(buffer)!=-1){
                if (Arrays.equals(ClasIndifier, buffer)){
                    System.out.println("This file has .class extension");
                }
                    else{
                    System.out.println("This is not a .class file");

                    }
                }

            }catch (FileNotFoundException e){
            System.out.println("Can not find current file");

        }catch (IOException e){
            System.out.println("error when processing file ");
        }


    }
}
