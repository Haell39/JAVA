package College.Exercixes_list;

import java.util.Scanner;

public class Q34 {

    // Programa que exibe o menor e o maior número de um conjunto de números positivos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int num;

        System.out.println("Digite um conjunto de números (positivos) ou 'sair' para encerrar: ");

        while (true) {
            System.out.print("Digite um número: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num > maior) {
                    maior = num; // Atualiza o maior número
                }

                if (num < menor) {
                    menor = num; // Atualiza o menor número
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("sair")) {
                    break; // Encerra o loop se o usuário digitar "sair"
                } else {
                    System.out.println("Por favor, insira um número inteiro válido ou 'sair' para encerrar.");
                }
            }
        }

        // Verifica se algum número válido foi inserido
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi inserido.");
        } else {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        scanner.close();
    }
}