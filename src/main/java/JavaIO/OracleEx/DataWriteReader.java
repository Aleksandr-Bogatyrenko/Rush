package JavaIO.OracleEx;

import java.io.*;
import java.io.DataOutputStream;

/**
 * Created by Александр on 20.01.2016.
 */
public class DataWriteReader extends DataStreams{
    static String fileName = "d:\\tmp\\tes.txt";

    public static void main(String[] args) throws IOException {
        java.io.DataOutputStream out = new java.io.DataOutputStream(new FileOutputStream(new File(fileName)));
        DataInputStream in = new DataInputStream(new FileInputStream(new File(fileName)));

        write(out);
        read(in);
    }

    public static void write(DataOutputStream out) throws IOException {
        for (int i = 0; i < 3; i++) {
            out.writeDouble(DOUBLES[i]);
            out.writeInt(INTS[i]);
            out.writeUTF(STRINGS[i]);
        }
    }

    public static void read(DataInputStream in) throws IOException {
        double resDouble = 0;
        int resInt = 0;
        String resString = "";
        try {
            while (true) {
                resDouble += in.readDouble();
                resInt += in.readInt();
                resString += in.readUTF();
            }
        } catch (EOFException e) {
            System.out.println("End of the file");
            System.out.println("Sum of the double = " + resDouble);
            System.out.println("Sum of the double = " + resInt);
            System.out.println("String concat = " + resString);
        }
    }
}

  class DataStreams {
    static final double[] DOUBLES = {1.1, 2.2, 3.3};
    static final int[] INTS = {1, 2, 3};
    static final String[] STRINGS = {"A", "B", "C"};
}
