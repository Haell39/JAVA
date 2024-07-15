package DSA.Space_Complexity;

//* Complexidade de Espaço

public class SpaceComplexityON {

    public static void createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        createArray(5);  // Creates an array of size 5
    }
}

/*
 * Exemplo de Complexidade de Espaço O(n):
    Um método que utiliza um espaço que cresce proporcionalmente ao tamanho da entrada:
*/

