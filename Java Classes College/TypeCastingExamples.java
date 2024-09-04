import java.util.Scanner;

public class TypeCastingExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de conversão implícita (automática)
        int inteiro = 100;
        double conversaoImplicita = inteiro; // int para double automaticamente
        System.out.println("Conversão implícita de int para double: " + conversaoImplicita);

        // Exemplo de conversão explícita (cast manual)
        double decimal = 9.78;
        int conversaoExplicita = (int) decimal; // double para int manualmente
        System.out.println("Conversão explícita de double para int: " + conversaoExplicita);

        // Conversão de tipos primitivos para wrappers (Boxing) e vice-versa (Unboxing)
        Integer numeroWrapper = inteiro; // Autoboxing: conversão de int para Integer
        int numeroPrimitivo = numeroWrapper; // Unboxing: conversão de Integer para int
        System.out.println("Conversão de tipos primitivos para wrappers e vice-versa: " + numeroPrimitivo);

        // Conversão de String para tipos numéricos
        System.out.print("Digite um número inteiro (String para int): ");
        String numeroComoTexto = scanner.nextLine();
        try {
            int numeroConvertido = Integer.parseInt(numeroComoTexto); // String para int
            System.out.println("Número convertido de String para int: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Não foi possível converter a String para int.");
        }

        // Conversão de tipos numéricos para String
        int numero = 123;
        String numeroParaTexto = Integer.toString(numero); // int para String
        System.out.println("Conversão de int para String: " + numeroParaTexto);

        // Conversão de String para double
        System.out.print("Digite um número decimal (String para double): ");
        String decimalComoTexto = scanner.nextLine();
        try {
            double decimalConvertido = Double.parseDouble(decimalComoTexto); // String para double
            System.out.println("Número convertido de String para double: " + decimalConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Não foi possível converter a String para double.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
