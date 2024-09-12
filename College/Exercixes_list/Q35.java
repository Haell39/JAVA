package College.Exercixes_list;

public class Q35 {

    //Programa que conta de 1 até 100 e exibe uma mensagem para múltiplos de 10

    public static void main(String[] args) {

        System.out.println("Contagem de 1 a 100: ");
        System.out.println("---------------------"); 

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);

            if (i % 10 == 0) {
                System.out.println(" - É múltiplo de 10");
            } else {
                System.out.println();
            }


        }
        
        System.out.println("---------------------");
        System.out.println("Fim da contagem!");
    }

    
}
