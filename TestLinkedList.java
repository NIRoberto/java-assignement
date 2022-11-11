

public class TestLinkedList {
    public static void main(String[] args) {
        var li  =  new MyLinkedList();
        var l2  =  new MyLinkedList();
        var l3  =  new MyLinkedList();
        var l4  =  new MyLinkedList();


        li.insertAtFront(12);
        li.insertAtBack(23);
        li.insertAtFront(98);

        l2.insertAtFront(1);
        l2.insertAtBack(2);
        l2.insertAtBack(9);
        
        System.out.println(l2.toString());
        System.out.println(li.isSorted(l2));
        l2.insertAtFront(8);
        System.out.println(li.isSorted(l2));

        l3.insertAtBack(0);
        l3.insertAtBack(1);
        l3.insertAtBack(3);
        l4.insertAtBack(2);
        l4.insertAtBack(6);
        l4.insertAtBack(7);

        System.out.println(l2.toString());
        System.out.println("final"+li.concantenate(l2).toString());
        System.out.println(l3.merge(l4));      
    }
}
