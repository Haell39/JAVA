import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        float a = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float b = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float c = scanner.nextFloat();
        System.out.print("Digite a quarta nota: ");
        float d = scanner.nextFloat();

        // Chamando a função para calcular a média
        float media = calcularMedia(a, b, c, d);

        // Verificando a aprovação
        media = verificarAprovacao(media, scanner);

        // Exibindo o resultado
        System.out.printf("Média final = %.2f%n", media);
    }

    public static float calcularMedia(float a, float b, float c, float d) {
        // Calcula a média das notas
        return (a + b + c + d) / 4;
    }

    public static float verificarAprovacao(float media, Scanner scanner) {
        // Verifica se o aluno foi aprovado ou precisa de recuperação
        if (media >= 7) 
        {
            System.out.println("Aprovado!");
        } else 
        {
            System.out.print("Qual sua nota de recuperação? ");
            float notaRecuperacao = scanner.nextFloat();
            media = (media + notaRecuperacao) / 2;
            if (media >= 7) 
            {
                System.out.println("Aprovado na recuperação!");
            } else {
                System.out.println("Reprovado.");
            }
        }
        return media;
    }
}
