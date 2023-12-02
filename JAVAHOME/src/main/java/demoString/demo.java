package demoString;

import java.util.Arrays;

public class demo {
    public static void main(String args[]) {
        String s = "Sachin"; //Tạo chuỗi bằng litteral
        s.concat(" Tendulkar");//Nối Tendulkar vào sau Sachin
        // s = s.concat(" Tendulkar");
        System.out.println(s);//Chỉ in ra Sachin bởi vì string là immutable object

        String s1 = new String(" Hello world \n"); // Tạo chuỗi bằng new String

//        System.out.println(s1.length());
//        System.out.println(s1 + 1);
//        System.out.println(s1.trim() + 1);

//        String [] a = s.split("");
//        System.out.println(Arrays.toString(a));
    }
}
