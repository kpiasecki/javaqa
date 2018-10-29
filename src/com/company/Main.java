package com.company;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;
import com.sun.org.apache.xpath.internal.operations.Bool;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Example e = new Example();

        System.out.println(e.i);
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.d);

        System.out.println();

        System.out.println(e.getValue());
        e.i = 45;
        System.out.println(e.getValue());

        System.out.println();

        out.println("out.println()");
        System.out.println();

        System.out.println(Example.n);
        Example e2 = new Example(24);
        System.out.println(Example.n);
        System.out.println();

        System.out.println(Example.staticMethod());
        System.out.println();


        System.out.println(e);
        System.out.println();

        System.out.println(e.getValue());
        System.out.println(e.getValue(5000));
        System.out.println();


        Integer a = 5;
        int b = 6;
        Integer d = 10;
        a = b;
        b = a;
        e = null;
        b = a;
        boolean c = a == b;
        c = a < d;

        System.out.println("a = " +  a);
        System.out.println("b = " +  b);
        System.out.println("c = " +  c);
        System.out.println("d = " +  d);
        System.out.println();
    }
}

