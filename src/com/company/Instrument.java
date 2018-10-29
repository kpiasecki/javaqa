package com.company;

public class Instrument {

    private InstrumentColour colour;

    public Instrument() {

    }

    public Instrument(InstrumentColour colour) {
        this.colour = colour;
    }

    public InstrumentColour getColour(){
        return colour;
    }

    public String play() {
        return "dsffgfdsfsf";
    }
}
