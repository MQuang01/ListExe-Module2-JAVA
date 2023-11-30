package DSA;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.addMyList(5);
        myList.addMyList(6);
        myList.addMyList(1);
        myList.addMyList(7);
        myList.addMyList(2);
        System.out.println(myList.getMyList(3));
        myList.displayMyList();
        System.out.println(myList.removeMyList(2));
        myList.displayMyList();
        System.out.println(myList.sizeMyList());
        MyList<Integer> newList = myList.cloneMyList();
        newList.displayMyList();
        System.out.println(myList.containsMyList(1));
        System.out.println(myList.indexOfMyList(1));
        System.out.println(myList.addMyList(8, 2));
        System.out.println(myList.addMyList(8, 2));
        myList.displayMyList();
        System.out.println(myList.sizeMyList());
        myList.clearMyList();
        myList.displayMyList();
    }
}
