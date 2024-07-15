public class LinkedList {
    private Node head;
    private Node tail;

    // Define a classe Node
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Adiciona um novo nó ao final da lista
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove o primeiro nó da lista
    public void removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    // Verifica se a lista contém um determinado valor
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    // Imprime todos os nós da lista
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.print();

        list.removeFirst();
        list.print();

        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Contains 10: " + list.contains(10));
    }
}
