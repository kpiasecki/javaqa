package com.company;

public class Piano extends Instrument {

    Piano(InstrumentColour colour) {
        super(colour);
    }

    @Override
    public String play() {
        return "play : piano";
    }

    @Override
    public String toString() {
        return "Piano";
    }
}
