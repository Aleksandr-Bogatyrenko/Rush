package JavaIO.BookExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Александр on 07.01.2016.
 */
public class BrReader {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Введите символы, q для выхода");

        do {
            c = (char) reader.read();
            System.out.println(c);

        }while (c!='q');

    }
}
