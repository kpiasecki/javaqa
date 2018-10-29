package com.company;

public enum InstrumentColour {
    YELLOW("Żółty"),
    WHITE("Biały"),
    BLUE("Niebieski"),
    RED("Czerwony");

    InstrumentColour(String s) {
        this.s = s;
    }

    String s;

    @Override
    public String toString() {
        return s;
    }
}
