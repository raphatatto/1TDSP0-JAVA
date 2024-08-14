package br.com.fiap.main;

import br.com.fiap.model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do{
            System.out.println("Digite seu nome");
            String nome = scanner.next() + scanner.nextLine();

            System.out.println("Digite seu rm");
            String rm = scanner.next() + scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua nota 1");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite sua nota 2");
            double nota2 = scanner.nextDouble();

            Aluno aluno = new Aluno(nome, rm, idade, nota1, nota2);
            alunos.add(aluno);

            System.out.println("Deseja adicionar mais alunos (s/n)");
            resposta = scanner.next();



        }while(!resposta.equalsIgnoreCase("n"));
        scanner.close();
        double somaMediaGeral = 0;
        int somaIdadeGeral = 0;
        int menorIdade = alunos.get(0).getIdade();
        int maiorIdade = alunos.get(0).getIdade();
        for(Aluno aluno : alunos) {
            System.out.println(alunos);
            somaMediaGeral += aluno.calcularMedia();
            somaIdadeGeral += aluno.getIdade();
            if(aluno.getIdade() > maiorIdade)
                maiorIdade = aluno.getIdade();
            if(aluno.getIdade() < menorIdade)
                menorIdade = aluno.getIdade();


        }
        System.out.println("Quantidade de alunos: " + alunos.size());
        System.out.println("Media de notas: " + somaMediaGeral/alunos.size());
        System.out.println("Média de idade: " + somaIdadeGeral/alunos.size());
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("menor idade: " + menorIdade);
    }
}
