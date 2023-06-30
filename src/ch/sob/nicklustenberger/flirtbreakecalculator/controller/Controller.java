package ch.sob.nicklustenberger.flirtbreakecalculator.controller;

import ch.sob.nicklustenberger.flirtbreakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbreakecalculator.view.ISliderListener;
import ch.sob.nicklustenberger.flirtbreakecalculator.view.View;

public class Controller implements ISliderListener {

    private Model model;
    private View view;
    public Controller (Model model, View view){
        this.model =model;
        this.view = view;
        view.addSevenStepListener(this);
    }
    @Override
    public void onChanged(int value) {
        float pressure = (-(2.0f / 7.0f) * value)+5;
        String pressureInString = ""+pressure;
        int length = 4;
        if (pressureInString.length() < 4){
            length = pressureInString.length();
        }
        pressureInString = ""+pressureInString.subSequence(0, length);
        model.setMainPressureText(pressureInString + " Bar");
    }
}
