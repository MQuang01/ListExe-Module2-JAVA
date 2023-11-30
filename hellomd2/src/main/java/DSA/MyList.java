package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size;
    private final static int DEFAULT_CAPACITY = 10;
    private Object elements [];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void addMyList(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    E getMyList(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("index:" + index + " size:" + size);
        }

        for(int i = 0; i < elements.length; i++){
            if(i == index){
                return (E) ("element is: " + elements[i]);
            }
        }
        return null;
    }

    E removeMyList(int index){
        if (index < 0 || index >= size) {
            throw new RuntimeException("Vị trí xóa không hợp lệ");
        }

        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        elements[size] = 0;
        return e;
    }

    public void displayMyList() {
        if (elements == null){
            throw new RuntimeException("List null element");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int sizeMyList(){
        return size;
    }

    public MyList<E> cloneMyList(){
        MyList<E> newList = new MyList<>();
        for (int i = 0; i < size; i++) {
            newList.addMyList((E) (elements[i] + "hihi"));
        }

        return newList;
    }

    public boolean containsMyList(E o){
        for (Object element : elements){
            if(element == o){
                return true;
            }
        }
        return false;
    }

    public int indexOfMyList(E o){
        int index = 0;
        while(index < size){
            if(elements[index].equals(o))
                return index;
            else
                index++;
        }
        return -1;
    }

    public boolean addMyList(E e, int index){
        if(size == elements.length){
            ensureCapa();
        }

        if(size < index){
            elements[size] = e;
            size++;
            return true;
        }
        for(int i = size; i > index ; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
        return true;
    }
    public void clearMyList(){
        elements = null;
        System.out.println("Successed clear!");
    }
}
