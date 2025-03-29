package org.automation.homework.homework1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
//        Bài 4. Viết chương trình cho phép người dùng
//        nhập vào thông tin Họ và tên, Ngày tháng năm sinh, sau đó in ra màn hình

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NAME and Birthday: ");
        String name = sc.nextLine(),  birthday = sc.nextLine();
        System.out.println("name: " + name + "; birthday: " + birthday);
    }
}
