public class MMUST {
    
    private Node head;
    private int size;
    

    private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    

    public void remove(int value) {
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }
    
    
    public int size() {
        return size;
    }
    

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
