package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleObject obj = new SimpleObject();
        System.out.println("s = " + obj.s + " " + ", i = " + obj.i);
        obj.setNewValues(obj.s, obj.i);
        System.out.println("s = " + obj.s + " " + ", i = " + obj.i);
        obj.setNewValues(obj);
        System.out.println("s = " + obj.s + " " + ", i = " + obj.i);
        System.out.println();

        System.out.println("Apple".contains("a"));
        System.out.println("Orange.length() = " + "Orange".length());
        System.out.println("Raspberry".replace("R", "r").replace("b", "B"));
        System.out.println("Apple Orange Raspberry".replaceFirst("\\w+", "Tomato"));
        System.out.println("Apple Orange Raspberry".replaceAll("\\w+", "Tomato"));

    }
}

