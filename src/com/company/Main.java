package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("If-else statement");

        boolean a = true;
        if (a) {
            System.out.println("It is true");
        } else {
            System.out.println("It is false");
        }

        System.out.println();


        System.out.println("switch statement");

        int n = 2;
        switch (n) {
            case 1:
                System.out.println("It is one");
                break;
            case 2:
                System.out.println("It is two");
                break;
            default:
                System.out.println("Unknown number");
        }

        System.out.println();


        System.out.println("for statement");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0, j = 0; i <= 10 && j <= 20; i++, j = i * 2) {
            System.out.println("i = " + i + ", j = " + j);
        }

        System.out.println();

        System.out.println("for-each statement");

        int[] numArray = {0, 1, 2, 3};
        for (int i : numArray) {
            System.out.println(i);
        }

        System.out.println();

        for (char c : "Java".toCharArray()) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("while statement");

        int i = 5;
        while (i-- > 0) {
            System.out.println(i);
        }
        System.out.println();


        System.out.println("do-while statement");


        int j = 5;
        do {
            System.out.println(j);
        } while (j-- > 0);

        System.out.println();


        System.out.println("break statement");

        int k = 5;
        while (k-- > 0) {
            System.out.println(k);
            if (k == 3) {
                break;
            }
        }

        System.out.println();


        System.out.println("continue statement");

        int q = 5;
        while (q-- > 0) {
            if (q == 3) {
                continue;
            }
            System.out.println(q);
        }

    }
}
