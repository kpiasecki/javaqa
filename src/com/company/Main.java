package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Piano(InstrumentColour.BLUE));
        instruments.add(new Guitar(InstrumentColour.BLUE));
        instruments.add(new Guitar(InstrumentColour.WHITE));
        instruments.add(new Piano(InstrumentColour.YELLOW));

        for(Instrument instrument : instruments) {
            System.out.println(instrument);
            System.out.println(instrument.getKind());
            System.out.println(instrument.getColour());
            System.out.println(instrument.play());
            System.out.println();
        }

        Music m = new Piano(InstrumentColour.BLUE);
        System.out.println(m);

    }
}

