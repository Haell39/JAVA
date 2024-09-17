package College.Exercixes_list;

import java.util.Scanner;

public class Q42 {
    // Programa que determina o maior e o menor entre N números lidos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um número (ou 'sair' para encerrar): ");
            input = scanner.nextLine(); // Lê a entrada como string

            // Verifica se o usuário deseja sair
            if (input.equalsIgnoreCase("sair")) {
                break; // Sai do loop se o usuário digitar "sair"
            }

            try {
                int num = Integer.parseInt(input); // Tenta converter a entrada para inteiro

                // Atualiza o maior e o menor
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número ou 'sair'.");
            }
        } while (true); // Loop infinito até que o usuário decida sair

        // Exibe os resultados
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número foi informado.");
        }

        scanner.close();
    }
}