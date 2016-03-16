package JavaIO.OracleEx;

import ExceptionsInJava.VideGolovach.Lection5.InputStream;

import java.io.*;

/**
 * Created by Александр on 19.01.2016.
 */
public class MyReader {
    public static void main(String[] args) {
        File file = new File("d:/tmp/tmp1.txt");
        try (Reader inputStream = new FileReader(file)) {
                int val;

                while((val=inputStream.read())!=-1)

                {
                    System.out.println((char) val);

                }
            }catch (FileNotFoundException e){
                System.out.println("Can't find file");
            } catch (IOException e1) {
            System.out.println("Error when procesing code");

        }



    }
    }