package JavaIO.OracleEx;

import java.io.*;

/**
 * Created by Александр on 19.01.2016.
 */
public class ReadWrite {
    public static void main(String[] args) throws IOException {
        String FileForRead = "d:/tmp/readEx.txt";
        String FileForWrite = "d:/tmp/writeEx.txt";

        Reader inputStream = null;
        PrintWriter outputStream = null;
        BufferedReader bufferedReader;

        try {
            inputStream = new FileReader(new File(FileForRead));
            bufferedReader = new BufferedReader(inputStream);
            outputStream = new PrintWriter(new File(FileForWrite));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                outputStream.println(line);
                //               outputStream.flush();
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");


        } catch (IOException e) {
            System.out.println("Error in reading, writing");


        } finally {
            if (inputStream != null) {
                inputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            }


        }
    }
}
