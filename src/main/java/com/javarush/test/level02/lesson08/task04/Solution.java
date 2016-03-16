package com.javarush.test.level02.lesson08.task04;



/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        int m2; int z; int x;
        if (a<b)
            z=a;
    else
        z=b;
        if (z<c)
            x=z;
        else
            x=c;
        if (x<d)
            m2=x;
        else
            m2=d;
        return m2;
    }
    public static int min(int a, int b)
    {
        int m3;
        int z;
        if (a<b)
            z=a;
        else
            z=b;
        if (z<b)
            m3=z;
        else
            m3=b;
        return m3;
    }



    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}