import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> veiculos =  new HashMap<>();

        veiculos.put("ABC-1234"," Gol 1.0 Bege");
        veiculos.put("KD23FS0","Civic 2.0");
        veiculos.put("JKS12KD","Fusca 1.0 amarelo");

        System.out.println(veiculos.get("ABC-1234"));

        Set<String> chaves = veiculos.keySet();
        for (String item :  chaves){
          System.out.println(item + " : " + veiculos.get(item));
      }



    }
}
