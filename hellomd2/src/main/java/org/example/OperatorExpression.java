package org.example;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float witdh;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai bao doi tuong scner

        System.out.println("Enter width: ");
        witdh = scanner.nextFloat(); // Nhap width

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        scanner.close();

        float area = witdh * height;
        System.out.println("Area is : " + area);

    }
}
