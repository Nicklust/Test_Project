package ch.sob.nicklustenberger.flirtbreakecalculator.controller;

import ch.sob.nicklustenberger.flirtbreakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbreakecalculator.view.ISliderListener;
import ch.sob.nicklustenberger.flirtbreakecalculator.view.View;

public class Controller implements ISliderListener {

    private Model model;
    private View view;
    private float brakepipe;
    private ControlValve controValve = new ControlValve();
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

        controValve.setBrakePipe(brakepipe);
        controValve.update();
        String controlValveInString = "" + controValve.getControlPressure();
        int lengthControlValve = 4;
        if (controlValveInString.length() < 4){
            lengthControlValve = controlValveInString.length();
        }

        controlValveInString = ""+controlValveInString.subSequence(0, lengthControlValve);
        model.setControlValvePressure(controlValveInString + " Bar");
    }
}
