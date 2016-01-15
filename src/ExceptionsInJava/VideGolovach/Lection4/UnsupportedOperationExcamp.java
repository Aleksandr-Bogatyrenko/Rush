package ExceptionsInJava.VideGolovach.Lection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Александр on 03.01.2016.
 */
public class UnsupportedOperationExcamp
{
    public static void main(String[] args)
    {
        List<String> list = Collections.unmodifiableList(new ArrayList<String>());
        list.add("Hello");
    }
    }
