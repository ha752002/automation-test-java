package org.example;

public class Section1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        System.out.println("================EX 1================");
        int a = 1;
        char b = 'b';
        String c = "string c";
        boolean d = true;

        System.out.printf("Integer: %d\n", a);
        System.out.printf("Character: %c\n", b);
        System.out.printf("String: %s\n", c);
        System.out.printf("Boolean: %b\n", d);
    }

    public static void ex2() {
        System.out.println("================EX 2================");
        int a = 4;
        int b = 9;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %f\n", a, b, (double) a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
    }
    public static void ex3() {
        System.out.println("================EX 3================");
        double a = 4.5;
        int b = (int) a;
        System.out.printf("Casted value: %d\n", b);
    }
}
