import java.util.Scanner;


public class Condicionais1 {

    public static void main(String[] args){
        System.out.println("Conditionals: ");
        System.out.println("Sistema de notas: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double n2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media>=7) {
            System.out.printf("Voce passou, sua média é %.2f%n", media);
        }
            else if (media>=6) {
                System.out.printf("Voce vai pra final, sua média é %.2f%n", media);

            }
            else {
                System.out.printf("Reprovou, sua média é %.2f%n", media);

            }

    }
}
