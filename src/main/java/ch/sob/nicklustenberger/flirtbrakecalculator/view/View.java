package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;
    public InputView sevenStep;
    public OutputView sevenStepControlPressure;

    public View (Model model){
        super ("Flirt brake calculator");
        this.model = model;
        sevenStep = new InputView("Siebenstufen Hebel", 0, 8, 0, model.sevenStepSignal);
        sevenStepControlPressure = new OutputView("Steuerdruck Siebenstufen Ventil", 0.00 + " Bar", model.sevenStepControl);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        add(panel);
        panel.add(sevenStep);
        panel.add(sevenStepControlPressure);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
