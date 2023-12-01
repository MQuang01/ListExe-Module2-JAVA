package DSA;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;


        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }


        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addToEnd(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            numNodes++;
        }

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeByIndex(int index) {
        if (index >= numNodes){
            throw new IndexOutOfBoundsException();
        }
        if (head == null) {
            throw new NullPointerException("Danh sách rỗng. Không thể xóa.");
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        int i = 0;
        while (temp != null && i < index - 1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

}
