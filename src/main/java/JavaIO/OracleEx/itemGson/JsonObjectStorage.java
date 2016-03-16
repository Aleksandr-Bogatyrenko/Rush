package JavaIO.OracleEx.itemGson;
import com.google.gson.Gson;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
class JsonObjectStorage {

    static String filePath = "C:\\JavaRushHomeWork\\JavaRushHomeWork\\src\\main\\java\\JavaIO\\OracleEx\\itemGson\\jsonObj.json";

    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        Test test = new Test(10, "Test", list);

        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(test);


        //write converted json data to a file named "file.json"
        FileWriter writer = new FileWriter(filePath);
        writer.write(json);
        writer.close();


        System.out.println(json);

    }
}

class Test {
    int age;
    String name;
    List<String> stringList;

    public Test(int age, String name, List<String> stringList) {
        this.age = age;
        this.name = name;
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stringList=" + stringList +
                '}';
    }
}