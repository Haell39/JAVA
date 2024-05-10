
/*
* Olá, este é um exemplo de um programa em Java básico.
* Ele mostra como usar os principais elementos da linguagem de programação Java para iniciantes.
*
* O programa pergunta o nome do usuário, o dia e o mês de seu aniversário
* e imprime uma mensagem de boas vindas personalizada.
*
*/

// Importa a classe Scanner, que é usada para ler a entrada do usuário
import java.util.Scanner;

// Cria uma classe chamada HelloWorld
public class HelloWorld {

  // Cria um método principal chamado main, que é chamado quando o programa é executado
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

/*
* A classe HelloWorld tem um método principal chamado main, que é chamado quando o programa é executado.
* O método main é o ponto de entrada do programa.
*
* O método main cria um objeto Scanner para ler a entrada do usuário.
* Ele usa o método nextLine para ler uma linha de texto do usuário e armazena-la na variável nome.
*
* O método main usa o método nextInt para ler um número inteiro do usuário
* e armazena-o nas variáveis day e month.
*
* A variável message é usada para armazenar a mensagem de boas vindas.
* A mensagem é criada usando a concatenação de strings usando o operador +.
*
* Por fim, o método main imprime a mensagem de boas vindas usando o método System.out.println.
*
*/
