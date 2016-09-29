package BookExamples.Shild.PacagesInterfases;

/**
 * Created by Alex on 13.09.2016.
 */
public class ex implements bb, cc {

}


interface bb{

}
interface cc{};

class Balanse{
    String a;
    int b;

    Balanse(String s, int e){
        a = s;
        b= e;
    }
    void show() {
        if (b < 0)
            System.out.println("-->");
        System.out.println(a + " $ " + b);
    }
}
class CheckBalanse{
    public static void main(String[] args) {
        Balanse cuttert [] = new Balanse[3];
        cuttert[0] = new Balanse("rol",1);
        cuttert[1]= new Balanse("rol",2);
        cuttert[2] = new Balanse("rol",3);

        for (int i = 0; i < 3 ; i++)
            cuttert[i].show();


    }
}