package College.Exercixes_list;
import java.util.Scanner;

public class Q41 {

    //Programa que classifica nadadores em categorias

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("juvenil B");
        } else if (idade >= 18) {
            System.out.println("adulto");
        } else {
            System.out.println("idade inválida");
        }
        scanner.close();
    }
}
