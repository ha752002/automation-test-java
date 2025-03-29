package org.automation.homework.homework1;

public class ex2 {
//    Bài 2. Viết chương trình khai báo 2 số nguyên a và b,
//    sau đó tính tổng, hiệu, tích, thương và chia lấy phần dư

    public static void main(String[] args) {
        int a = 2, b = 10;

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        float division = (float) a / b;
        int mod = a % b;

        System.out.printf("sum = %d \n, subtraction = %d\n, multiplication = %d\n, division = %f\n, mod = %d",
                sum, subtraction, multiplication, division, mod);
    }
}
