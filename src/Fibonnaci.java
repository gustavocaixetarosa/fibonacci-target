import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Fibonnaci {
    public static String pertence(int a){
        int x = 0;
        int y = 1;
        int z;
        while (a >= y) {
            if ( a == y)
                return "O número informado percente à sequência de Fibonacci!";
            z = x + y;
            x = y;
            y = z;
        }
        return "O número informado NÃO percente à sequência de Fibonacci!";
    }
}
