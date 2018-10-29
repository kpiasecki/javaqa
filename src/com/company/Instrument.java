package com.company;

public abstract class Instrument {

    private InstrumentColour colour;

    public String getKind(){
        return "Instrument";
    }

    public InstrumentColour getColour(){
        return colour;
    }

    public void setColour(InstrumentColour colour){
        this.colour = colour;
    }

    public abstract String play();
}
