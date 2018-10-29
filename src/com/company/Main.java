package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Piano(InstrumentColour.BLUE));
        instruments.add(new Guitar(InstrumentColour.BLUE));
        instruments.add(new Guitar(InstrumentColour.WHITE));
        instruments.add(new Piano(InstrumentColour.YELLOW));
        System.out.println(instruments.get(10));
        */


        try {
            List<Instrument> instruments = new ArrayList<>();
            instruments.add(new Piano(InstrumentColour.BLUE));
            instruments.add(new Guitar(InstrumentColour.BLUE));
            instruments.add(new Guitar(InstrumentColour.WHITE));
            instruments.add(new Piano(InstrumentColour.YELLOW));

            System.out.println(instruments.get(10));

        } /*catch (Exception e) {
            e.getMessage();
        }*/catch (IndexOutOfBoundsException e){
            System.out.println("List has four elements!");
        } finally {
            System.out.println("finally");
        }

        System.out.println("end");
    }
}

