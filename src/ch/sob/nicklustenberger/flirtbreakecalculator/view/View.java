package ch.sob.nicklustenberger.flirtbreakecalculator.view;

import ch.sob.nicklustenberger.flirtbreakecalculator.model.IStringListener;
import ch.sob.nicklustenberger.flirtbreakecalculator.model.Model;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class View extends JFrame {
    private Model model;
    public SevenStepView sevenStep;

    public View (Model model){
        super ("Flirt brake calculator");
        this.model = model;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        add(panel);
        sevenStep = new SevenStepView();
        panel.add(sevenStep);
        panel.add(new MainPressureView(model));
        panel.add(new ControlValveView(model));
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
