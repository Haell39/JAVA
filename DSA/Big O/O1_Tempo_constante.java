//* Este método imprime o primeiro item em um array:

public class O1_Tempo_constante {

    public static void printFirstItem(int[] array) {
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printFirstItem(numbers);  // Output: 10
    }
}
