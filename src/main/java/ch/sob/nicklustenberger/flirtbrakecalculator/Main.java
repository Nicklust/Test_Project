package ch.sob.nicklustenberger.flirtbrakecalculator;

import ch.sob.nicklustenberger.flirtbrakecalculator.controller.Controller;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbrakecalculator.view.View;

public class Main {

    private static Controller controller;
    private static Model model;
    private static View view;

    public static void main(String s[]) {
        model = new Model();
        view = new View(model);
        controller = new Controller(model, view);
    }
}