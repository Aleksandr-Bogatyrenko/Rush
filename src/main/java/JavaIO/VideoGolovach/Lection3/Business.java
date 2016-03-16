package JavaIO.VideoGolovach.Lection3;

import java.io.*;

/**
 * Created by Александр on 08.01.2016.
 */
public class Business {
    public static void main(String[] args) throws IOException {
        write();
        User user = new BusinessDataInput(new DataInputStream(new FileInputStream(new File("d:/tmp/xxx.txt")))).readUser();
        System.out.println(user);
    }
    


        private static void write()throws IOException{
         FileOutputStream outputStream = new FileOutputStream(new File("d:/tmp/xxx.txt"));
        BusinessOutput out = new BusinessDataOutput(
                new DataOutputStream(outputStream));

        out.writeUser(new User("Mike", 25));
        outputStream.flush();
        outputStream.close();
    }

}

class BusinessDataOutput implements BusinessOutput {

    private final DataOutput out;

    BusinessDataOutput(DataOutput out) {
        this.out = out;
    }

    public void writeUser(User user) throws IOException {
        out.writeUTF(user.getName());
        out.writeInt(user.getAge());

    }
}

class BusinessDataInput implements BusinessInput {

    private final DataInput in;

    BusinessDataInput(DataInput in) {
        this.in=in;
    }

    public User readUser() throws IOException {
       return new User(in.readUTF(), in.readInt());


    }
}

interface BusinessOutput{

    void writeUser(User user) throws IOException;
}

interface BusinessInput{

    User readUser() throws IOException;
}

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
