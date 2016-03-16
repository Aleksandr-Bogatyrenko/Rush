package JavaIO.OracleEx;
import java.io.*;

/**
 * Created by Александр on 19.01.2016.
 */
public class DataOutputStream {
    public static void main(String[] args)  {
        File file = new File("d:/tmp/Test2.txt");

        int extanzion = 0xCAFEBABE;
        try(
            DataInputStream inputStream = new DataInputStream(new FileInputStream(file))){
            while (true){
                int spesialsimbol = inputStream.readInt();
                if(spesialsimbol==extanzion){
                    System.out.println("This is a .class extension ");
                }
            }
        }catch (EOFException e){
            System.out.println("End of file");

        }
        catch (IOException e){
            System.out.println("File not found");
        }






    }
}
