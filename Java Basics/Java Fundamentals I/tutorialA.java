import java.util.Scanner;

public class tutorialA {

  public static void main(String[] args) {

    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner input = new Scanner(System.in);

    // Solicita o nome do usuário
    System.out.print("Qual é o seu nome? ");
    String name = input.nextLine();

    // Solicita o dia e o mês do aniversário
    System.out.print("Em que dia e mês você nasceu? ");
    int day = input.nextInt();
    int month = input.nextInt();

    // Cria uma variável para armazenar a mensagem de boas vindas
    String message = "Olá, " + name + "! Seu aniversário é no dia " + day + " de " + month + ".";

    // Imprime a mensagem de boas vindas
    System.out.println(message);

  }
    
}

