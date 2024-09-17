package College.Exercixes_list;
import java.math.BigInteger;
import java.util.Scanner;

public class Q27 {
    //Ler a quantidade de números, calcular e exibir o fatorial de cada um

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números serão lidos?");
        int qntd = scanner.nextInt();

        for (int i = 0; i < qntd; i++) {
            System.out.println("Qual o "+(i+1)+"º número?");
            int num = scanner.nextInt();

            BigInteger fatorial = BigInteger.ONE;

            for (int j = 1; j <= num; j++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(j));
            }

            System.out.println("Fatorial de " + num + " é: " + fatorial);
        }

        scanner.close();
    }
}