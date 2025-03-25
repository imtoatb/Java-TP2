public class Stack {
    private int[] elements;
    private int count;
    private static int instanceCount = 0;

    public Stack(int capacity) {
        elements = new int[capacity];
        count = 0;
        instanceCount++;
    }

    public void push(int element) {
        if (count == elements.length) {
            System.out.println("Stack overflow");
        }
        elements[count] = element;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        count--;
        return elements[count];
    }

    public boolean isEmpty() {
        return count == 0;
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
        if (!(o instanceof Stack)) return false;
        Stack other = (Stack) o;
        if (count != other.count) return false;
        for (int i = 0; i < count; i++) {
            if (elements[i] != other.elements[i]) {
                return false;
            }
        }
        return true;
    }
}