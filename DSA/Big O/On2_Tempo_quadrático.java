//* Este método imprime todos os pares de itens em um array:

public class On2_Tempo_quadrático {

    public static void printAllPairs(int[] array) {
        for (int i : array) {
            for (int j : array) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        printAllPairs(numbers);
    }
}


