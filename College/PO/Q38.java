package College.Exercixes_list;
import java.util.Scanner;

public class Q38 {
    // Programa que calcula o salário de um operário com horas extras

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char encerrar;

        do {
            // Leitura do código do operário e número de horas trabalhadas
            System.out.print("Digite o código do operário (C): ");
            int C = scanner.nextInt(); // Código do operário

            System.out.print("Digite o total de horas trabalhadas (N): ");
            int N = scanner.nextInt(); // Número de horas trabalhadas

            // Cálculo do salário
            double salarioBase = N * 10; // Salário base
            double excesso = 0; // Inicializa o pagamento excedente

            // Verifica se as horas trabalhadas excedem 50
            if (N > 50) {
                excesso = (N - 50) * 20; // Cálculo do pagamento excedente
            }

            double salarioTotal = salarioBase + excesso; // Salário total

            // Exibição dos resultados
            System.out.printf("Salário total: R$ %.2f%n", salarioTotal);
            System.out.printf("Pagamento excedente: R$ %.2f%n", excesso);

            // Pergunta ao usuário se deseja encerrar o programa
            System.out.print("Deseja encerrar o programa? (S/N): ");
            encerrar = scanner.next().charAt(0);

        } while (encerrar != 'S' && encerrar != 's'); // Permite 'S' ou 's' para encerrar

        scanner.close();
        System.out.println("Encerrando programa...");
    }
}