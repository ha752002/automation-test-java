package org.automation.learn.lession3;

public class Variable {
    static class Student {
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        // primitive variable
        int a = 1;
        char b = 'b';
        String c = "c";
        boolean d = true;
        float f = 1.1f;

        // instance variable
        String s = new String();
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        //
        Vietnamese Ha = new Vietnamese();
//        Ha.name;
    }
}
