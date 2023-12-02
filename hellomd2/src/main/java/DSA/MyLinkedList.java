package DSA;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    private static final int DEFAULT_CAPACITY = 10;

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
        if (index >= numNodes) {
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
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean removeByObj(Object data) {
        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    public int sizeMyList(){
        return numNodes;
    }

    public Object cloneMyList(MyLinkedList myLinkedList){
        Node temp = myLinkedList.head;
        Node myNode = head;
        while (myNode.next != null){
            myNode = myNode.next;
        }
        myNode.next = temp;
        numNodes = numNodes + myLinkedList.numNodes;
        return "Data vừa được thêm vào tại " + temp.data;
    }

    public boolean containsMyList(Object data){
        Node temp = head;

        while (temp.next != null){
            if(temp.next.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while (index < numNodes){
            if (temp.next != null){
                if(temp.next.data == data){
                    return index + 1;
                }else {
                    temp = temp.next;
                }
            }
            index++;
        }
        return -1;
    }

    public boolean add(Object data){
        if (data != null && data != ""){
            addToEnd(data);
            return true;
        }
        return false;
    }


}
