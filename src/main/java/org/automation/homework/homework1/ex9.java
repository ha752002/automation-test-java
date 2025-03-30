package org.automation.homework.homework1;

public class ex9 {
//    Bài 9. Viết chương trình in ra bảng cửu chương từ 1 đến 10
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d,\t", i, j, i * j);
            }
            System.out.print("\n\n");
        }
    }
}
