package org.automation.homework.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex11 {
    //    Bài 11. Viết chương trình nhập vào 1 mảng số nguyên,
//    sau dó tìm phần tử lớn nhất trong mảng đó.
    public static void main(String[] args) {
        List<Integer> list = inputArray();

        System.out.println("List phan tu gom: " +list);
        int result = findMaxNumber(list);
        System.out.println("Phần tử lớn nhất là: " + result);
    }

    static List<Integer> inputArray() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Nhập vao số lượng phần tử trong mảng");
        int quantity = inputNumber();
        System.out.printf("Số lượng phần tử trong mảng là: %d \n", quantity);


        for (int i = 0; i < quantity; i++) {
            System.out.printf("Nhập phần tử thứ: %d \n", i + 1);
            list.add(inputNumber());
        }

        return list;
    }

    static int findMaxNumber(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    static int inputNumber() {
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


}
