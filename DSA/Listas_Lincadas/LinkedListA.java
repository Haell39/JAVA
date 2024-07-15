package DSA.Listas_Lincadas;

public class LinkedListA{
    private Node head; // Ponteiro para o primeiro nó da lista
    private Node tail; // Ponteiro para o último nó da lista

    // Classe interna Node que representa cada nó na lista
    private class Node {
        int value; // Valor armazenado no nó
        Node next; // Referência para o próximo nó na lista

        // Construtor da classe Node
        Node(int value) {
            this.value = value;
        }
    }

    // Método para adicionar um valor no final da lista
    public void addLast(int value) {
        Node newNode = new Node(value); // Cria um novo nó com o valor fornecido
        if (head == null) { // Se a lista estiver vazia
            head = newNode; // Define o novo nó como o primeiro nó
            tail = newNode; // Define o novo nó como o último nó
        } else {
            tail.next = newNode; // Define o próximo nó do nó atual como o novo nó
            tail = newNode; // Atualiza o último nó para o novo nó
        }
    }

    // Método para remover o primeiro nó da lista
    public void removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty"); // Lança uma exceção se a lista estiver vazia
        if (head == tail) { // Se a lista tiver apenas um nó
            head = null; // Define o primeiro nó como null
            tail = null; // Define o último nó como null
        } else {
            head = head.next; // Atualiza o primeiro nó para ser o próximo nó na lista
        }
    }

    // Método para verificar se a lista contém um valor específico
    public boolean contains(int value) {
        Node current = head; // Inicia a busca a partir do primeiro nó
        while (current != null) { // Percorre a lista até o final
            if (current.value == value) return true; // Retorna true se o valor for encontrado
            current = current.next; // Move para o próximo nó
        }
        return false; // Retorna false se o valor não for encontrado
    }

    // Método para imprimir todos os valores na lista
    public void print() {
        Node current = head; // Inicia a impressão a partir do primeiro nó
        while (current != null) { // Percorre a lista até o final
            System.out.println(current.value); // Imprime o valor do nó atual
            current = current.next; // Move para o próximo nó
        }
    }

    // Método principal para testar a lista ligada
    public static void main(String[] args) {
        LinkedListA list = new LinkedListA(); // Cria uma nova lista ligada
        list.addLast(10); // Adiciona 10 ao final da lista
        list.addLast(20); // Adiciona 20 ao final da lista
        list.addLast(30); // Adiciona 30 ao final da lista

        list.print(); // Imprime a lista: 10 20 30

        list.removeFirst(); // Remove o primeiro nó da lista
        list.print(); // Imprime a lista: 20 30

        System.out.println("Contains 20: " + list.contains(20)); // Verifica se a lista contém 20: true
        System.out.println("Contains 10: " + list.contains(10)); // Verifica se a lista contém 10: false
    }
}
