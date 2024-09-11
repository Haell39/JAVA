package College.Exercixes_list;
import java.util.Scanner;

public class Q30 {
    // Imprimir uma tabuada

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tabuada deseja?");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i) );
        }

        scanner.close();
    }


    
}
