package DSA.Alg;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0;                  // Índice inicial do intervalo de busca (começa no início do array)
        int right = array.length - 1;   // Índice final do intervalo de busca (começa no fim do array)

        // Continua a busca enquanto o intervalo de busca tiver pelo menos um elemento
        while (left <= right) {  
            int mid = (left + right) / 2; // Calcula o índice do meio do intervalo de busca

            if (array[mid] == target) {
                return mid;               // Encontrou o elemento no meio do intervalo: retorna o índice
            }

            // Se o elemento do meio for menor que o alvo, busca na metade direita
            if (array[mid] < target) {    
                left = mid + 1;           // O novo intervalo de busca começa logo após o meio
            } else {
                // Se o elemento do meio for maior que o alvo, busca na metade esquerda
                right = mid - 1;          // O novo intervalo de busca termina logo antes do meio
            }
        }

        return -1; // Elemento não encontrado no array
    }

    public static void main(String[] args) {



        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};  // Array ordenado
        int target = 70;                                       // Valor a ser buscado

        int index = binarySearch(numbers, target);  // Realiza a busca binária
        System.out.println("Index of " + target + ": " + index); // Imprime o resultado
    }
}


