public class LinkedList {
    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int element) {
        if (head == null) return;

        if (head.value == element) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value != element) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" --> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}