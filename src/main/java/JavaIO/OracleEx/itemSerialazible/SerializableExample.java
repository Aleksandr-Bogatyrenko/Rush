package JavaIO.OracleEx.itemSerialazible;

import java.io.*;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class SerializableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "d:/tmp/fileForObjects.txt";
        User user = new User(100, 25, "Karl", "secure", new Test());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        out.writeObject(user);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fileName)));
        User userFromFile = (User) in.readObject();
        System.out.println(userFromFile);
    }
}