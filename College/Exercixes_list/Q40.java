package College.Exercixes_list;

import java.util.Scanner;
import java.util.Locale;

public class Q40 {
    // Programa que emite notificações para indústrias com base no índice de poluição

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Set the locale to US to use '.' as decimal separator
        char encerrar;

        do {
            System.out.print("Digite o índice de poluição: ");
            double indice = scanner.nextDouble();

            // Verificação do índice de poluição
            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Limites aceitáveis!");
            } else if (indice >= 0.3 && indice <= 0.4) {
                System.out.println("Indústrias do 1º grupo devem suspender suas atividades!");
            } else if (indice >= 0.5 && indice <= 0.6) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades!");
            } else if (indice >= 0.7 && indice <= 0.8) {
                System.out.println("Todos os grupos devem suspender suas atividades!");
            } else {
                System.out.println("Índice inválido!");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            encerrar = scanner.next().charAt(0);

        } while (encerrar != 'S' && encerrar != 's');

        scanner.close();
        System.out.println("Encerrando programa...");
    }
}