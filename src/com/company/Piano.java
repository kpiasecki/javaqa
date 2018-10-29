package com.company;

public class Piano extends Instrument implements Music{

    Piano(InstrumentColour colour) {
        super.setColour(colour);
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
