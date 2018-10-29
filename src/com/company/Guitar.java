package com.company;

public class Guitar extends Instrument {

    Guitar(InstrumentColour colour) {
        super.setColour(colour);
    }

    @Override
    public String play() {
        return "play : guitar";
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}