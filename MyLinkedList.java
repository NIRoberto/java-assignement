

public class MyLinkedList {

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }

        public Node(int a) {
            data = a;
            next = null;
        }

    }
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    public MyLinkedList(int a) {
        Node newNode = new Node(a);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void insertAtFront(int a) {
        Node newNode = new Node(a);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public  void insertAtBack(int b){
        Node  newNode  =  new Node(b);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public   String toString(){
        String S =  new String("");
        if (!isEmpty()) {
            Node current = head;
            S += "[";
            while (current != null) {
                S += ","+current.data;
                current = current.next;
            }
            S += "]";
        }
        return  S;


    }

}
