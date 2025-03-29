package org.automation.homework.homework1;

import java.util.Scanner;

public class ex7 {
//    Bài 7. Viết chương trình yêu cầu người
//    dùng nhập một số nguyên, sau đó kiểm tra xem số đã nhập là số chẵn hay số lẻ

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = inputInt(sc);
        checkEvenOdd(number);
    }

    static int inputInt(Scanner sc) {
        while (true) {
            System.out.println(" Nhập số nguyên: ");
            try {
                return sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Vui lòng nhập đúng định dạng int");
            }
        }
    }


    static  void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.printf("Số %d là số chẵn", number);
        } else {
            System.out.printf("Số %d là số lẻ", number);
        }
    }
}
