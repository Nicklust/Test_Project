package ch.sob.nicklustenberger.flirtbreakecalculator;

import ch.sob.nicklustenberger.flirtbreakecalculator.controller.Controller;
import ch.sob.nicklustenberger.flirtbreakecalculator.model.Model;
import ch.sob.nicklustenberger.flirtbreakecalculator.view.View;

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