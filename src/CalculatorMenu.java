import java.util.HashMap;
import java.util.Map;

public class CalculatorMenu {
    Map<Integer,CalculatorOperation> menu=new HashMap<>();
    void initializeMenu(){
        menu.put(1,new Addition());
        menu.put(2,new Subtraction());
    }
}
