package com.company;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Assignment Operator");

        int a;
        a = 6;
        int b = 5;

        int c = 4, d = 0, e = 44;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println();

        System.out.println("Arithmetic Operators");

        a = 5 % 3;
        System.out.println("a = " + a);

        a *= 5;
        System.out.println("a * 5 = " + a);

        a++;
        System.out.println("a++ -> " + a);

        a--;
        System.out.println("a-- -> " + a);

        System.out.println();

        System.out.println("String Concatenation Operator");

        String s = "Hello" + " " + "World" + "!";
        System.out.println(s);

        System.out.println();


        System.out.println("Relational Operators");

        boolean f = 10 < 45;

        System.out.println(5 == 1);
        System.out.println(1 != 2);
        System.out.println(4 > 1);
        System.out.println(4 >= 1);
        System.out.println(5 < 1);
        System.out.println(2 >= 1);

        System.out.println();

        System.out.println("Boolean Logical Operators");

        System.out.println(!true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true & false);
        System.out.println(true & false);

        System.out.println();

        System.out.println("Ternary Operators");

        System.out.println(1 < 2 ? true : false);
        System.out.println(1 > 2 ? true : false);
        System.out.println(1 < 2 ? "Hello" : "World");

        System.out.println();

        System.out.println("Bitwise Operators");

        System.out.println(2 & 1);
        System.out.println(2 | 1);
        System.out.println(1 << 1);

        System.out.println();
    }
}
