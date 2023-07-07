package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.View;

public class Controller {



    public Controller (Model model, View view){
        SevenStepValve sevenStepValve = new SevenStepValve(model.sevenStepSignal, model.sevenStepControl);
        TrailerBrakeValve trailerBrakeValve = new TrailerBrakeValve(model.sevenStepControl, model.main);
        ControlValve controlValve = new ControlValve(model.main, model.controlValve);

    }
}
