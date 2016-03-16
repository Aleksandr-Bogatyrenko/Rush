package JavaIO.VideoGolovach.Lection5Files.ExamleJavaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Александр on 15.01.2016.
 */
public class RhinoEngine {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager mng = new ScriptEngineManager();
        ScriptEngine engine = mng.getEngineByName("JavaScript");
        try {
            engine.put("name", " Mike");
            engine.eval("print('Hello ' + name + '!')");

        }catch (ScriptException e){
            e.printStackTrace();
        }
    }
}
