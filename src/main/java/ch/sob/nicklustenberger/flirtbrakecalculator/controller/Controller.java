package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.View;

public class Controller {

    private Model model;
    private View view;
    private SevenStepValve sevenStepValve;
    public Controller (Model model, View view){
        this.model =model;
        this.view = view;
        sevenStepValve = new SevenStepValve(model.sevenStepSignal, model.sevenStepControl);
    }
}
