package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;


    public View (Model model){
        super ("Flirt brake calculator");
        this.model = model;

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        add(panel);
        panel.add(new DigitalInputView("Siebenstufen Hebel", 0, 8, 0, model.sevenStepSignal));
        panel.add(new PressureInputView("Luftfederung 1", 3, 10, 5, 100, model.load1));
        panel.add(new PressureInputView("Luftfederung 2", 0, 6.3f, 0, 100, model.load2));
        panel.add(new OutputView("Steuerdruck Siebenstufen Ventil", 0.000 + " Bar", model.sevenStepControl));
        panel.add(new OutputView("Hauptleitungsdruck", 5.000 + " Bar", model.main));
        panel.add(new OutputView("Steuerventil", 0.000 + " Bar", model.controlValve));
        setSize(1000, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
