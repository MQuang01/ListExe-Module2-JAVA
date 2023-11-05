package org.example;

import java.util.Scanner;

public class WorkFromHome {

    public WorkFromHome(){

    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        boolean flag = false;
        System.out.println("Menu:");
        System.out.println("1 : Bia");
        System.out.println("2 : Heo");
        System.out.println("3 : Bò");

        do {
            System.out.println("Mời nhập từ 1-3: ");
            number = scanner.nextInt();

            if (number >= 1 && number <= 3){
                flag = true;
            }else {
                System.out.println("Không hợp lệ");
            }
        }while (!flag);
        scanner.close();


        if(number == 1){
            System.out.println("Bạn đang chọn Bia");
        }
        if(number == 2){
            System.out.println("Bạn đang chọn Heo");
        }
        if(number == 3){
            System.out.println("Bạn đang chọn Bò");
        }




//        int number = 0;
//        do{
//            System.out.println("Mời nhập: ");
//            number = scanner.nextInt();
//
//        }while (number > 10);
//
//
//        System.out.println("KẾT THÚC CHƯƠNG TRÌNH");


    }
}
