package org.automation.homework.homework1;

import java.util.Scanner;

public class ex5 {
//    Bài 5. Viết chương trình tính diện tích và chu vi hình chữ nhật.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X:");
        double x = sc.nextDouble();

        System.out.println("Enter Y:");
        double y = sc.nextDouble();

        System.out.println("Diện tích HCN: " + x * y);
        System.out.println("Chu vi HCN: " + (x+y)*2);
    }
}
