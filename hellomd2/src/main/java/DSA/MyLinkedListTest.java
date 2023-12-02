package DSA;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,9);

        ll.printList();

        Object o = "";

        System.out.println(ll.add(o));
//        MyLinkedList nl = new MyLinkedList(1);
//        nl.addFirst(23);
//        nl.addFirst(15);
//        nl.addFirst(3);
//        nl.printList();
//        System.out.println(nl.containsMyList(10));
//        System.out.println("Vị trí cần tìm là: " + ll.indexOf(11));
//        System.out.println(nl.removeByObj(23));
//        nl.printList();
//        System.out.println(nl.cloneMyList(ll));;
//        System.out.println("----------");
//        nl.printList();
//        System.out.println("---------");
//        nl.removeByIndex(0);
//        nl.printList();
//        nl.removeByIndex(1);
    }
}
