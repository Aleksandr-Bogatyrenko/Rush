import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Александр on 11.12.2015.
 */
public class MyExamples
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
