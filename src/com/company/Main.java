package com.company;

public class Main {

    public static void main(String[] args) {

        Instrument instrument = new Instrument(InstrumentColour.RED);
        System.out.println(instrument.getColour());
        System.out.println(instrument.play());
        System.out.println();

        Piano piano = new Piano(InstrumentColour.WHITE);
        System.out.println(piano);
        System.out.println(piano.getColour());
        System.out.println(piano.play());
        System.out.println();

        Guitar guitar = new Guitar(InstrumentColour.BLUE);
        System.out.println(guitar);
        System.out.println(guitar.getColour());
        System.out.println(guitar.play());
        System.out.println();

    }
}

