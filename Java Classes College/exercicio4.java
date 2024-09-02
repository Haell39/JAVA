import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Atenção: Essa é outra forma de fazer o exercicio 04:
/*
 Fiz primeiro esse exercicio em python com umas 5 linhas, mas não tinha ferramentas suficiente para fazer um codigo tão otimizado no java
 Então o Exercicio_04 foi feito de maneira bruta da forma que eu consegui fazer, e esse aqui (Exercicio04_02), Fiz com auxilio de IA até consegui otimizar o codigo ao máximo.
*/

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sums = new ArrayList<>();
        List<Integer> mults = new ArrayList<>();
        
        System.out.println("Digite 4 valores numéricos:");
        int[] values = new int[4];
        
        for (int i = 0; i < 4; i++) {
            values[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                sums.add(values[i] + values[j]);
                mults.add(values[i] * values[j]);
            }
        }

        System.out.println("Adições: " + sums);
        System.out.println("Multiplicações: " + mults);
        
        scanner.close();
    }
}
