import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // miguelon02
        // miguel angel rojas rodriguez

        Map<String, Perras> perros = new HashMap<>();
        perros.put("1",new Perras());

        for (String clave: perros.keySet()){
            System.out.println("clave: "+clave+", info: "+perros.get(clave));
        }
        perros.remove("1");
    }
}