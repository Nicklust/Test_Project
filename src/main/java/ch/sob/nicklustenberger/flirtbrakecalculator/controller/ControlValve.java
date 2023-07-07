package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.IFloatListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;

public class ControlValve {


    public ControlValve(Pressure mainPressure, Pressure brakeCylinderPressure){
        mainPressure.addPressureListener(new IFloatListener() {
            @Override
            public void onChanged(float value) {
                brakeCylinderPressure.setPressure(getControlPressure(value));
            }
        });

    }

    public ControlValve(){

    }

    public float getControlPressure(float mainPressure){
        float result = mainPressure >= 4.75 ? 0 : (float) (8.2-((8.2/4.75) * mainPressure));
        return result >= 4.0 ? 4.0f : result;

    }
}
