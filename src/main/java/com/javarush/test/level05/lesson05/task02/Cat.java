package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat("tiger",10,2,3);
        Cat cat2 = new Cat("huk",3,2,2);
        if (cat1.fight(cat2)){
            System.out.println("tiger won");
        }
        else{
            System.out.println("huk won");



        }

    }





    public boolean fight(Cat anotherCat)
    {


        boolean cool = this.age + this.weight + this.strength > anotherCat.age + anotherCat.weight + anotherCat.strength;
return cool;

    }
}
