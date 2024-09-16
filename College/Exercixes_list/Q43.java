package College.Exercixes_list;
import java.math.BigInteger; // Import BigInteger class

// Programa que calcula o número de grãos de trigo em um tabuleiro de xadrez

public class Q43 {
    public static void main(String[] args) {
        BigInteger graos = BigInteger.ONE;  // Começa com 1 grão no primeiro quadro
        BigInteger totalGraos = BigInteger.ZERO;  // Total de grãos

        for (int i = 1; i <= 64; i++) {
            totalGraos = totalGraos.add(graos);  // Acumula o total de grãos
            graos = graos.multiply(BigInteger.TWO);  // Dobra a quantidade de grãos a cada quadro
        }

        System.out.println("Total de grãos de trigo a serem recebidos: " + totalGraos);
    }
}

