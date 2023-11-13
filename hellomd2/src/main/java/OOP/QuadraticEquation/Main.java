package OOP.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        getSolution(quadratic);

        System.out.println("Nhập a1: ");
        double a1 = scanner.nextDouble();
        System.out.println("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.println("Nhập c1: ");
        double c1 = scanner.nextDouble();
        QuadraticEquation quadratic1 = new QuadraticEquation(a1, b1, c1);
//        getSolution(quadratic1);
        quadratic1.getSolution();
         */
       QuadraticEquation q =  inputQuad();
       q.getSolution();
        System.out.println("Nhap phuong trinh thu 2: ");
       QuadraticEquation q2 = inputQuad();
       q2.getSolution();


    }

    public static QuadraticEquation inputQuad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        return q;
    }


    public static void getSolution(QuadraticEquation q){
        double delta1 = q.getDiscriminant();
        System.out.println("Delta = " + delta1);
        if(delta1 > 0){
            System.out.println("r1 = " + q.getRoot1());
            System.out.println("r2 = " + q.getRoot2());
        }else if(delta1 == 0){
            System.out.println("Quadratic 1 root is : " + (-q.getB() / (2 * q.getA())));
        }else {
            System.out.println("No solution");
        }
    }
}
