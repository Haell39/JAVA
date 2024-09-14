package College.Exercixes_list;

import java.util.Scanner;

public class Q36 {
    //Programa que lê 10 valores inteiros e positivos e encontra o maior, o menor valor e a média

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Digite o "+(i+1)+"º número(positivo): ");
            numbers[i] = scanner.nextInt();

            while (numbers[i] <= 0){
                System.out.print("Valor Invalido! Digite um valor inteiro e positivo: ");
                numbers[i] = scanner.nextInt();
            }

            if (numbers[i] > maior){
                maior = numbers[i];
            }

            if (numbers[i] < menor){
                menor = numbers[i];
            }

            soma += numbers[i];
        }

        double media = soma / 10.0;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Media: " + media);

        scanner.close();

    }

}

