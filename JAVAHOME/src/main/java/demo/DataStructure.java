package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một mảng các số nguyên
        int[] numbers = {1, 2, 3, 4, 5};

        // Truy cập phần tử của mảng
        System.out.println("Phần tử thứ hai: " + numbers[1]);

        // Duyệt qua các phần tử của mảng bằng vòng lặp for
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Khởi tạo danh sách liên kết để lưu trữ chuỗi
        LinkedList<String> linkedList = new LinkedList<>();

        // Thêm phần tử vào danh sách liên kết
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Hiển thị các phần tử trong danh sách liên kết
        System.out.println("Các phần tử trong danh sách liên kết:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Khởi tạo một ngăn xếp để lưu trữ các số nguyên
        Stack<Integer> stack = new Stack<>();

        // Đẩy các phần tử vào ngăn xếp
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Lấy và loại bỏ phần tử trên cùng của ngăn xếp
        int topElement = stack.pop();
        System.out.println("Phần tử trên cùng của ngăn xếp: " + topElement);

        // Khởi tạo một hàng đợi để lưu trữ chuỗi
        Queue<String> queue = new LinkedList<>();

        // Thêm các phần tử vào hàng đợi
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Lấy và loại bỏ phần tử đầu tiên khỏi hàng đợi
        String firstElement = queue.poll();
        System.out.println("Phần tử đầu tiên của hàng đợi: " + firstElement);
    }
}
