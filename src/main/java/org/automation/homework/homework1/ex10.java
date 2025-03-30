package org.automation.homework.homework1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        double hour = input("số giờ làm");
        double salary = input("luơng mỗi giờ");
       double result = calculateSalary(hour, salary);
        System.out.printf("tổng lương = %.2f $", result);
    }

    static double input(String text) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Nhập vào %s: ", text);
            try {
                return sc.nextDouble();
            } catch (Exception error) {
                System.out.println("Vui lòng nhập lại, giá trị pha là số ");
                sc.nextLine();
            }
        }
    }

    static double calculateSalary(double hour, double salary) {
        if (hour < 40) {
            return 0;
        }
        return salary * (hour * 1.5 - 20);
    }
}