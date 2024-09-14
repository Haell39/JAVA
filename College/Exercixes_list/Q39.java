package College.Exercixes_list;
import java.util.Scanner;

public class Q39 {
    //Programa que verifica se o número é par ou ímpar, positivo ou negativo

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char encerrar;

        do{
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }

            if (num > 0){
                System.out.println("Positivo");
            } else if (num < 0){
                System.out.println("Negativo");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            encerrar = scanner.next().charAt(0);

        } while (encerrar != 'S' && encerrar != 's');

        scanner.close();
        System.out.println("Encerrando programa...");
        }

    }





    

