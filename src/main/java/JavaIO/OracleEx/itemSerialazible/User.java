package JavaIO.OracleEx.itemSerialazible;

import java.io.Serializable;

/**
 * Created by Александр on 20.01.2016.
 */
public class User extends Parent implements Serializable {
    private int age;
    private String name;
    private String field= "NEW";
    private Test test; // NotSerializableException
    private transient String password;
    private static String example = "example";

//    private static final long serialVersionUID = 100l;

    public User(long id, int age, String name, String password, Test test) {
        super(id);
        this.age = age;
        this.name = name;
        this.password = password;
        this.test = test;
    }



    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", test=" + test +
                ", password='" + password + '\'' +
                '}' +" example = " + example + " new_field = " + field;
    }
}
