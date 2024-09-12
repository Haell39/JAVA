package College.Exercixes_list;
import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numInicial = scanner.nextInt();

        int soma = 0;
        int count = 0;
        int numAtual = numInicial;

        if (numAtual % 2 == 0) {
            numAtual++;
        }
        while (count < 20){
            soma += numAtual * numAtual;

            numAtual += 2;
            count++;
        }
        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + numInicial + " é: " + soma);

        scanner.close();
        }
}

