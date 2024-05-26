import java.util.Scanner;

public class FundamentosJava {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Variável inteira
        System.out.print("Digite a sua idade: ");
        int age = input.nextInt();
        input.nextLine(); // Consome a quebra de linha

        // Variável de ponto flutuante
        float pi = 3.1415f;
        System.out.println("O valor de pi é: " + pi);

        // Variável booleana
        System.out.print("Você está matriculado em um curso de programação (true/false)? ");
        boolean isEnrolled = input.nextBoolean();
        input.nextLine(); // Consome a quebra de linha

        // Variável String
        System.out.print("Digite o seu nome: ");
        String name = input.nextLine();

        // Variável de array
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "º número: ");
            numbers[i] = input.nextInt();
        }

        // Fechar o Scanner
        input.close();

        // Imprimindo os valores
        System.out.println("\n--- Resumo das entradas ---");
        System.out.println("Idade: " + age);
        System.out.println("Nome: " + name);
        System.out.println("Matriculado: " + isEnrolled);
        System.out.print("Números: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Operações básicas
        System.out.println("\n--- Operações Básicas ---");
        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));

        // Estruturas de controle
        System.out.println("\n--- Estruturas de Controle ---");

        // Condicional if-else
        if (age >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Loop for
        System.out.print("Contagem de 1 a 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Loop while
        System.out.print("Contagem regressiva de 5 a 1: ");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // Função simples
        System.out.println("\n--- Função Simples ---");
        int num1 = 5, num2 = 7;
        int result = sum(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + result);
    }

    // Função para somar dois números
    public static int sum(int a, int b) {
        return a + b;
    }
}
