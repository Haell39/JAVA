package DSA.Listas_Lincadas;

public class LinkedListB {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;
    
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    

    // Adiciona um novo nó ao final da lista
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Adiciona um novo nó ao início da lista
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Remove o primeiro nó da lista
    public void removeFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node second = head.next;
            head.next = null;
            head = second;
        }
    }

    // Remove o último nó da lista
    public void removeLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }
    }

    // Verifica se a lista contém um determinado valor
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // Retorna o índice de um valor na lista
    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // Verifica se a lista está vazia
    private boolean isEmpty() {
        return head == null;
    }

    // Retorna o nó anterior ao fornecido
    private Node getPrevious(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    // Imprime todos os nós da lista
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListB list = new LinkedListB();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.print();  // Output: 10 -> 20 -> 30 -> null

        list.removeFirst();
        list.print();  // Output: 20 -> 30 -> null

        list.removeLast();
        list.print();  // Output: 20 -> null

        System.out.println("Contains 20: " + list.contains(20));  // Output: true
        System.out.println("Contains 10: " + list.contains(10));  // Output: false
    }
}
