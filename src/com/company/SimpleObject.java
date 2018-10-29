package com.company;

public class SimpleObject {

    String s = "Hello" + " " + "world" + "!";
    Integer i = 5;

    public void setNewValues(SimpleObject obj) {
        obj.s = "Hello!";
        obj.i *= 2;
    }

    public void setNewValues(String s, Integer i) {
        s = "Hello!";
        i *= 2;
    }
}
