
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();
        compras.add("Arroz");
        compras.add("Feijão");compras.add("Feijão");
        //compras.add(100); erro de compilação por causa do generics "<>"

        //1-Exibir a quantidade de elementos da lista
        int tamanho = compras.size();
        System.out.println("Itens na lista: " + tamanho);

        //2-Remover feijão da lista
        compras.remove("Feijão");

        //3-Validar se o macarrão está na lista
        System.out.println("Tem Macarrão?"+ compras.contains("Macarrão"));

        //4-Criar uma array(vetor) da lista
        String[] vetorcompras= compras.toArray(new String[]{});

        //5- Adicionar o macarrão na primeira posição
        compras.add(0,"Macarrão");

        //6- Recuperar o item da compra da posição 0
        compras.indexOf(0);

        //7- Apagar toda lista de compra
        compras.removeAll(compras);

        //8- Adicionar itens
        compras.add("Playstation");
        compras.add("Xbox");
        compras.add("Nintendo");
        compras.add("TV");

        //9- Substituir o item da posição 0 por chocolate
        compras.set(0,"Chocolate");

        //10- Achar a posição do primeiro Chocolate

        //Percorrer a lista
        for (String item : compras){
            System.out.println(item);
        }
    }
}