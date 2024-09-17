import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero entre 0 e 10(Ou seja de 1 a 9): ");
        int num = scanner.nextInt();

        if (num <= 0 || num >= 10){
            System.out.println("Por favor, digite um número valido(1,2,3,4,5,6,7,8,9)");
        }
            return;
    }

    int sum = 0;
    int count = 0;
    int valorAtual = num;

    while (count < 20) {
        if (valorAtual % 2 != 0) {
            sum += valorAtual * valorAtual;
            count ++;
        }
        valorAtual++;
    }

    System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + num + " é: " + sum);

    scanner.close();
    }
}