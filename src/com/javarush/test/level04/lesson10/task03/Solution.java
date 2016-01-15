package com.javarush.test.level04.lesson10.task03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String n = reader.readLine();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i <N ; i++)

            System.out.println(n);

        }


    }
