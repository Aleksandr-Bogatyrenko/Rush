package JavaIO.OracleEx.itemProperty;
import java.io.*;
import java.util.Properties;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
public class PropertyWorker {
    public static void main(String[] args) throws IOException {
        String properies = "C:\\JavaRushHomeWork\\JavaRushHomeWork\\src\\JavaIO\\OracleEx\\itemProperty\\example.properties";

        readProperties(properies);
        writeProperties(properies);
    }

    public static void writeProperties(String path) throws IOException {
        Properties prop = new Properties();
        OutputStream out = new FileOutputStream(new File(path));

        prop.setProperty("key1", "value500");
        prop.setProperty("key2", "value300");

        prop.store(out, "my comment");

    }

    public static void readProperties(String path) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(new File(path));

        prop.load(input);

        String key1 = prop.getProperty("key1");
        String key2 = prop.getProperty("key2");

        System.out.println(key1);
        System.out.println(key2);
    }
}
