public class StackLinkedList {
    
    private Node top;
    private int size;
    
    
    private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }
    

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }
    
    
    public int size() {
        return size;
    }
    

    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
