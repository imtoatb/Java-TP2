public class Queue {
    private int[] elements;
    private int count;
    private static int instanceCount = 0;

    public Queue(int capacity) {
        elements = new int[capacity];
        count = 0;
        instanceCount++;
    }

    public void add(int element) {
        if (count == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[count] = element;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int removedElement = elements[0];
        for (int i = 0; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
        return removedElement;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == elements.length;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(elements[i]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Queue)) return false;
        Queue other = (Queue) o;
        if (this.count != other.count) return false;
        for (int i = 0; i < count; i++) {
            if (this.elements[i] != other.elements[i]) {
                return false;
            }
        }
        return true;
    }
}