import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> esportes = new HashSet<>();

        esportes.add("Break Dance");
        esportes.add("Volei");
        esportes.add("Basquete");
        esportes.add("Natação");

        for (String item : esportes){
            System.out.println(item);
        }



    }
}
