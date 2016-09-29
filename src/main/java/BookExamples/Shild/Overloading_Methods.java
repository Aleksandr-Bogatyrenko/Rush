package BookExamples.Shild;

/**
 * Created by Alex on 26.08.2016.
 */
public class Overloading_Methods {
   void test(){
       System.out.println("параметры отсутствуют");
   }void test(int a){
        System.out.println("a = " + a);
    }
    void test (int a, int b){
        System.out.println("a = " + a + " b= " +b);
    }
    double test (double a){
        System.out.println("double a = " + a);
        return a*a;
    }

}
class Overload{
    public static void main(String[] args) {
        Overloading_Methods demo = new  Overloading_Methods();
        double result;

        demo.test();
        demo.test(3);
        demo.test(4,5);
        result= demo.test(123.12);
        System.out.println("result = " + result);


    }
}