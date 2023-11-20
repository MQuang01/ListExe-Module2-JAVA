package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


public class Demo {
    public static void main(String[] args) {
        // Tạo một đối tượng ArrayList để lưu trữ các chuỗi
        List<String> arrayList = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Hiển thị các phần tử trong ArrayList bằng vòng lặp for-each
        System.out.println("Các phần tử trong ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Tạo một đối tượng HashMap để lưu trữ key-value
        Map<Integer, String> hashMap = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");
        hashMap.put(3, "Bob");

        // Lấy giá trị dựa trên key
        System.out.println("Giá trị với key 2: " + hashMap.get(2));

        // Duyệt qua tất cả các cặp key-value trong HashMap
        System.out.println("Tất cả các cặp key-value trong HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Tạo một đối tượng HashSet để lưu trữ các số nguyên
        Set<Integer> hashSet = new HashSet<>();

        // Thêm các phần tử vào HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // Phần tử trùng lặp, sẽ bị loại bỏ

        // Hiển thị các phần tử trong HashSet
        System.out.println("Các phần tử trong HashSet:");
        for (int number : hashSet) {
            System.out.println(number);
        }
    }
}
