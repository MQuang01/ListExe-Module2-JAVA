package demoSearch;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 22, 30, 34, 49};
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số cần tìm: ");
        int n = scan.nextInt();

//        System.out.println(binarySearch(arr,n));
        System.out.println(linearSearch(arr,n));

    }

    public static int binarySearch(int[] arr, int number)
    {
        /*---Binary Search---*/
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == number)
                return mid;

            if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int number){
        /*---Linear Search---*/
        int index = 0;
        for (int num : arr){
            if (num == number){
                return index;
            }
            index++;
        }
        return -1;
    }
}
