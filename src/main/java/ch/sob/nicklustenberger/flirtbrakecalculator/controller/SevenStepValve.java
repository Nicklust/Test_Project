package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.DigitalValue;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;

public class SevenStepValve {


    public SevenStepValve (DigitalValue input, Pressure output){
        input.addDigitalValueListener(new IIntListener() {
            @Override
            public void onChanged(int value) {
                output.setPressure (getControlPressure(value));
            }
        });
    }

    public SevenStepValve(){

    }

    public float getControlPressure (int step){
        //if (step == 8){
        //    return 0;
        //}
//
        //return (3.5f / 7.0f) * step;

        return step == 8 ? 9.722f : (3.5f / 7.0f) * step;
    }
}
