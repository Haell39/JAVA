package College.Exercixes_list;

import java.util.Scanner;

public class Q31 {
    //Programa que verifica se um número é par ou ímpar e exibe a soma total dos pares e ímpares

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números serão lidos? --> ");
        int qntd = scanner.nextInt();

        int par = 0;
        int impar = 0;
        for (int i = 0; i < qntd; i++) {
            //System.out.println("Qual o "+(i+1)+"º número?"); --> //* NO POR NO IDEA
            System.out.println("Qual o número agora? (Digite abaixo) ");
            int num = scanner.nextInt();    
            if (num % 2 == 0) {
                par += num;
            } else {
                impar += num;
            }
        }
        System.out.print(scanner.nextLine());
        System.out.println("Soma dos pares: " + par);
        System.out.println("Soma dos ímpares: " + impar);
        scanner.close();
    }

    
}
