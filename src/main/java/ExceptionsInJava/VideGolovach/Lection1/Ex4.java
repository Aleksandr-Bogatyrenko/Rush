package ExceptionsInJava.VideGolovach.Lection1;

/**
 * Created by Александр on 27.12.2015.
 */
public class Ex4
{
    public static void main(String[] args)
    {
        try
        {
            saveToBD();
            {
            }
        } catch (NOConnect n){
            System.out.println("No connect");
        }
        catch (ExxDeny e)
        {
            System.out.println("Exx");
        }
        catch (DBException d)
        {
            System.out.println("Crash");
        }
    }
    public static void saveToBD(){
        double rand = Math.random();
        if (rand > 0.5) {
            System.out.println("OK");
        }
        else if (rand < 0.1){
            throw new NOConnect(){};
        }
else {
            throw new ExxDeny(){};
        }
    }
}
class DBException extends RuntimeException{}

class NOConnect extends DBException{}

class ExxDeny extends DBException{}


