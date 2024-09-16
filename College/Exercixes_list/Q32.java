package College.Exercixes_list;
import java.math.BigInteger;
import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        BigInteger numInicial = scanner.nextBigInteger();

        BigInteger soma = BigInteger.ZERO;
        int count = 0;
        BigInteger numAtual = numInicial;

        if (numAtual.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            numAtual = numAtual.add(BigInteger.ONE);
        }
        while (count < 20){
            soma = soma.add(numAtual.multiply(numAtual));

            numAtual = numAtual.add(BigInteger.valueOf(2));
            count++;
        }
        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + numInicial + " é: " + soma);

        scanner.close();
        }
}

