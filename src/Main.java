
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();
        compras.add("Arroz");
        compras.add("Feijão");
        //compras.add(100); erro de compilação por causa do generics "<>"

        //Percorrer a lista
        for (String item : compras){
            System.out.println(item);
        }
    }
}