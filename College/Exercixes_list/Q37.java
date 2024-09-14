package College.Exercixes_list;

import java.util.Scanner;

public class Q37 {
    // Programa de conversão de base numérica com operações matemáticas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Calculadora");
            System.out.println("------------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a opção: ");
            
            int opcao = scanner.nextInt();
            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();
            double resultado = 0;
            boolean operacaoValida = true; // Flag para verificar se a operação é válida

            switch (opcao) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    if (n2 != 0) {
                        resultado = n1 / n2;
                    } else {
                        System.out.println("Erro: divisão por zero!");
                        operacaoValida = false; // Marca a operação como inválida
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    operacaoValida = false; // Marca a operação como inválida
                    break;
            }

            // Exibe o resultado apenas se a operação foi válida
            if (operacaoValida) {
                System.out.printf("O resultado é:%.2f%n ", resultado);
            }

            System.out.println();
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');    // Permite 'S' ou 's' para continuar

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}