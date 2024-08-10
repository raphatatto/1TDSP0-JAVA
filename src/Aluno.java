import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        String palavra;

        Scanner estudantes = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();
        alunos.add("Marcos");
        alunos.add("Raphaela");
        alunos.add("Joao");
        alunos.add("Henrique");

        System.out.printf("Adicione um aluno na lista:\n ");
        palavra = estudantes.next();



    }
}
