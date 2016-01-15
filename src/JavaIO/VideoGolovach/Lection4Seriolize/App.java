package JavaIO.VideoGolovach.Lection4Seriolize;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Александр on 13.01.2016.
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Entity mike = new Entity(20, "Mike");
        mike.setBestFriends(new Entity[]{mike, null, new Entity( 1,"dog")} );
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(buff);
        out.writeObject(mike);
        out.flush();
        out.close();
        byte[] rawdata = buff.toByteArray();
        Entity human = (Entity) new ObjectInputStream(new ByteArrayInputStream(rawdata)).readObject();
        System.out.println(human.getAge());
        System.out.println(human.getName());



    }
}

class Entity implements  Serializable{
    private final int age;
    private final String name;
    private Entity [] bestFriends;

    public Entity(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Entity[] getBestFriends() {
        return bestFriends;
    }

    public void setBestFriends(Entity[] bestFriends) {
        this.bestFriends = bestFriends;
    }
}