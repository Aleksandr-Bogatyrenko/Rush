package BookExamples.Shild.Overloading_Constructors;

/**
 * Created by Alex on 26.08.2016.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(double  w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box ( double len ) {
        width = height = depth = len;
    }
    double volume(){
        return width*height*depth;
    }
}
class Test{
    public static void main(String[] args) {
        Box newbox = new Box(1, 2, 3);
        Box newbox1 = new Box();
        Box newbox2 = new Box(23.14);
        double vol;
        vol=newbox.volume();
        System.out.println("Обьем newbox равен" + vol);
        vol=newbox1.volume();
        System.out.println("Обьем newbox1 равен" + vol);
        vol=newbox2.volume();
        System.out.println("Обьем newbox2 равен" + vol);
    }
}