//* Este método imprime todos os itens de um array:


public class On_Tempo_linear {

    public static void printAllItems(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printAllItems(numbers);
    }
}



