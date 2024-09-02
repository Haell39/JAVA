import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
