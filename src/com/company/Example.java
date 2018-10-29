package com.company;

public class Example {

    int i;
    double d;
    char c;
    boolean b;

    private int s;

    private final int K = 45875;

    public static int n = 0;

    public Example() {
        n++;
    }

    public Example(int s) {
        this();
        this.s = s;
    }

    public int getValue() {
        return i * K;
    }

    public int getValue(int w) {
        return getValue() * w;
    }

    public static String staticMethod() {
        return "static method";
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}