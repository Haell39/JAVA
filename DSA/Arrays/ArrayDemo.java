package DSA.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = new int[3];  // Declaração e inicialização com 3 zeros
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
