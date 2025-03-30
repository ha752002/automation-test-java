package org.automation.homework.homework1;

import java.util.Scanner;

public class ex8 {
    //    Bài 8. Viết chương trình yêu cầu người
//    dùng nhập vào 1 số N, sau đó tính tổng các số từ 1 đến N
    public static void main(String[] args) {
        int number = input();
        int result = sum(number);
        System.out.println("Tổng từ 1 đến " + number + " = " + result);
    }

    static int input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập vào số nguyên: ");
            try {
                return sc.nextInt();
            } catch (Exception error) {
                System.out.println("Vui lòng nhập lại, giá trị pha là số ");
                sc.nextLine();
            }
        }
    }

    static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
