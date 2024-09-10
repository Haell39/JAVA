import java.util.Scanner;

public class Booleans {

    public static void main(String[] args) {
        //* Usando true e false padrão
        boolean isJavaFun = true;
        boolean isFishFun = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Fish fun? " + isFishFun);

        //* Usando true e false para pedir ao usuário
        Scanner input = new Scanner(System.in);
        System.out.print("Is Java fun? (true/false): ");
        isJavaFun = input.nextBoolean();
        System.out.print("Is Fish fun? (true/false): ");
        isFishFun = input.nextBoolean();

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Fish fun? " + isFishFun);

        //* Usando true e false e mudando para sim e não:
        System.out.print("Is Java fun? (y/n): ");
        isJavaFun = input.next().equals("y");
        System.out.print("Is Fish fun? (y/n): ");
        isFishFun = input.next().equals("y");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Fish fun? " + isFishFun);

        //* Fechar o Scanner
        input.close();
    }
}
