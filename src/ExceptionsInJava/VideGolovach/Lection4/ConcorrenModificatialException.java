package ExceptionsInJava.VideGolovach.Lection4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Александр on 30.12.2015.
 */
public class ConcorrenModificatialException
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        for (String str : set){
            set.remove(str);

   //     wrong0(set);
      //  wrong1(set);
      //  wrong2(set);



    }

        }


    }
