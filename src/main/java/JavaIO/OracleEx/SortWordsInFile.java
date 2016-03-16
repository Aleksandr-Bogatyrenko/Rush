package JavaIO.OracleEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * Created by Александр on 19.01.2016.
 */
public class SortWordsInFile {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String>  words = new TreeSet<>();
        String Filename = "d://tmp/Test.txt";

        try (Scanner toconizingScanner  = new Scanner(new  FileReader(Filename))){

            toconizingScanner.useDelimiter("\\W");

            while (toconizingScanner.hasNext()){
                String word = toconizingScanner.next();
                if (!word.equals("")){
                    words.add(word);
                }
            }
        }
        for (String word: words){
            System.out.println(word);

        }



    }
}
