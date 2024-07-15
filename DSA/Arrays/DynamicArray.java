//* Implementação de um Array Dinâmico
package DSA.Arrays;

public class DynamicArray {
    private int[] items; // Armazenamento interno dos elementos (array)
    private int count;   // Número de elementos no array (tamanho lógico)

    public DynamicArray() {
        items = new int[2]; // Inicializa o array com capacidade 2
    }

    public void insert(int item) {
        if (count == items.length) {
            // Redimensiona o array se estiver cheio (dobra a capacidade)
            int[] newItems = new int[count * 2];  // Cria um novo array com o dobro do tamanho
            for (int i = 0; i < count; i++) {  
                newItems[i] = items[i];           // Copia os elementos para o novo array
            }
            items = newItems;                      // Faz o array antigo apontar para o novo
        }
        items[count++] = item;                    // Insere o item e incrementa o contador
    }

    public void removeAt(int index) {
        // Verifica se o índice é válido (dentro dos limites do array)
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index out of range");
        }
        
        // Desloca os elementos à direita do índice removido uma posição para a esquerda
        for (int i = index; i < count - 1; i++) { 
            items[i] = items[i + 1];               
        }
        count--;                                  // Decrementa o contador
    }

    public int indexOf(int item) {
        // Busca o item no array
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {             // Se encontrar, retorna o índice
                return i;
            }
        }
        return -1;                               // Retorna -1 se não encontrar
    }

    public void print() {
        // Imprime os elementos do array
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();  // Cria um DynamicArray

        // Insere elementos
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);

        dynamicArray.print();                 // Imprime o array

        dynamicArray.removeAt(1);             // Remove o elemento no índice 1 (valor 20)
        dynamicArray.print();                 // Imprime o array novamente

        System.out.println("Index of 30: " + dynamicArray.indexOf(30)); // Busca o índice do 30
    }
}
