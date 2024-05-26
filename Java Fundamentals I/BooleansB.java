import java.util.Scanner;

public class BooleansB {

    public static void main(String[] args) {
        // Usando true e false padrão
        boolean isJavaFun = true;
        boolean isFishFun = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Fish fun? " + isFishFun);

        // Usando true e false para pedir ao usuário
        Scanner input = new Scanner(System.in);
        System.out.print("Is Java fun? (true/false): ");
        boolean userIsJavaFun = input.nextBoolean();
        System.out.print("Is Fish fun? (true/false): ");
        boolean userIsFishFun = input.nextBoolean();

        // Verificando se a resposta do usuário está correta
        if (userIsJavaFun == isJavaFun) {
            System.out.println("Correct! Java is fun.");
        } else {
            System.out.println("Incorrect. Java is fun.");
        }

        if (userIsFishFun == isFishFun) {
            System.out.println("Correct! Fish is not fun.");
        } else {
            System.out.println("Incorrect. Fish is not fun, is taste.");
        }

        // Fechar o Scanner
        input.close();
    }
}
