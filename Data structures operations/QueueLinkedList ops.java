public class QueueLinkedList {
    
    private Node front;
    private Node rear;
    private int size;
    
    
    private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }
    
    
    public int size() {
        return size;
    }
    

    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void front(){
        if(isEmpty()){
            throw RuntimeException("queue ie empty");
        return value;
        }
    }
}
