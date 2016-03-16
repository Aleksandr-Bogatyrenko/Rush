package JavaIO.OracleEx.itemSerialazible;

import java.io.Serializable;

/**
 * Created by Александр on 20.01.2016.
 */
public class Parent implements Serializable {
    protected long id;

    public Parent(long id){
        this.id=id;
    }
}
