package com.company;

public enum InstrumentColour2 {
    YELLOW("Żółty"),
    WHITE("Biały"),
    BLUE("Niebieski"),
    RED("Czerwony");

    InstrumentColour2(String s) {
        this.s = s;
    }

    String s;

    @Override
    public String toString() {
        return s;
    }
}
