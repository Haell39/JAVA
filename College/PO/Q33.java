package College.Exercixes_list;

import java.util.Scanner;

public class Q33 {
    //Programa que calcula a média das notas dos alunos de uma turma

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaNotas = 0;
        int countAlunos = 0;

        while (true) {
            System.out.print("Digite a matricula do aluno (ou 0 para encerrar): ");
            int matricula = scanner.nextInt();

            if (matricula == 0) {
                break;
            }

            System.out.print("Digite a nota do Aluno: ");
            int nota = scanner.nextInt();

            somaNotas += nota;
            countAlunos++;
        }

        if (countAlunos > 0){
            double media = (double) somaNotas / countAlunos;
            System.out.printf("A media das notas dos alunos é: %.2f%n ", media);
        } else {
            System.out.println("Nenhum aluno foi inserido.");
        }

        scanner.close();
        }


    
}
