package org.automation.homework.homework1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C:");
        double c = sc.nextDouble();

        System.out.println("Độ F= " + (c * (double) 9 / 5));
    }
}
