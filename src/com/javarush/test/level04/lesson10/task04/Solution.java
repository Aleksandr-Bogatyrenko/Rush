package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        int f = 1;

        while (f < 11)
        {
            int s=1;
            while (s < 11)
            {
                System.out.print("S");
                s++;
            }

            System.out.println("");

            f++;


            }


        }
    }





