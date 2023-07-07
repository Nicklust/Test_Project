package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.IFloatListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;

public class TrailerBrakeValve {

    public TrailerBrakeValve (Pressure input, Pressure output){
        input.addPressureListener(value -> output.setPressure(getBrakePipe(value)));
    }

    public TrailerBrakeValve(){

    }

    public float getBrakePipe (float controlPressure){
        return (float) (5 -(( 1.8 / 3.5 ) * controlPressure));
    }
}
