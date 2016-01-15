package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
  String name;
    int  heigh;
    String color;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, int heigh)
    {
        this.name = name;
        this.heigh = heigh;
    }

    public Dog(String name, int heigh, String color)
    {
        this.name = name;
        this.heigh = heigh;
        this.color = color;
    }
}
