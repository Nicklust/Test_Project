package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.DigitalValue;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;

public class SevenStepValve {

    private float sevenStepControlPressure;

    public SevenStepValve (DigitalValue input, Pressure output){
        input.addDigitalValueListeners(new IIntListener() {
            @Override
            public void onChanged(int value) {
                output.setPressure (getControlPressure(value));
            }
        });
    }

    public SevenStepValve(){

    }

    public float getControlPressure (int step){
        sevenStepControlPressure = (3.5f / 7.0f) * step;

        if (step == 8){
            sevenStepControlPressure = 0;
        }

        return sevenStepControlPressure;
    }
}
