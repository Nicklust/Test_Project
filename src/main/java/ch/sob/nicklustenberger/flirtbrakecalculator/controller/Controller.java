package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.ISliderListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.View;

public class Controller implements ISliderListener {

    private Model model;
    private View view;
    private float brakepipe;
    private ControlValve controlValve = new ControlValve();
    public Controller (Model model, View view){
        this.model =model;
        this.view = view;
        view.sevenStep.addListener(this);
    }
    @Override
    public void onChanged(int value) {
        brakepipe = (-(2.0f / 7.0f) * value)+5;

        if (value == 8){
            brakepipe = 0.0f;
        }
        String pressureInString = ""+brakepipe;

        int length = 4;
        if (pressureInString.length() < 4){
            length = pressureInString.length();
        }
        pressureInString = ""+pressureInString.subSequence(0, length);
        model.setMainPressureText(pressureInString + " Bar");

        String controlValveInString = "" + controlValve.getControlPressure(brakepipe);
        int lengthControlValve = 4;
        if (controlValveInString.length() < 4){
            lengthControlValve = controlValveInString.length();
        }

        controlValveInString = ""+controlValveInString.subSequence(0, lengthControlValve);
        model.setControlValvePressure(controlValveInString + " Bar");
    }
}
