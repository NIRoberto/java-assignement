

public class TestLinkedList {
    public static void main(String[] args) {
        var li  =  new MyLinkedList();
        li.insertAtFront(12);
        li.insertAtBack(23);
        li.insertAtFront(98);
        System.out.println("List is :"+ li.toString());

    }
}
