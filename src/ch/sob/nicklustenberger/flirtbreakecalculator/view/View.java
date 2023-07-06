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
    private JSlider sevenStep;
    private List<ISliderListener> sevenStepListeners = new ArrayList<>();
    public View (Model model){
        super ("Flirt break calculator");
        this.model = model;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2));
        JLabel sevenStepLabel = new JLabel("Siebenstufen Ventil");
        sevenStep = new JSlider(SwingConstants.HORIZONTAL, 0, 8, 0);
        sevenStep.setMajorTickSpacing(1);
        sevenStep.setPaintTicks(true);
        sevenStep.setPaintLabels(true);
        panel.add(sevenStep);
        sevenStep.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                for (ISliderListener listener: sevenStepListeners) {
                    listener.onChanged(sevenStep.getValue());
                }
            }
        });
        JTextField mainPressure = new JTextField("5.000 Bar");
        model.addMainPressureTextListener(new IStringListener() {
            @Override
            public void onChanged(String value) {
                mainPressure.setText(value);
            }
        });
        mainPressure.setEditable(false);
        panel.add(mainPressure);
        add(panel);
        JTextField controlValve = new JTextField("0.000 Bar");
        model.addControlValvePressureListener(new IStringListener() {
            @Override
            public void onChanged(String value) { controlValve.setText(value);}
        });
        controlValve.setEditable(false);
        panel.add(controlValve);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void addSevenStepListener (ISliderListener listener){
        sevenStepListeners.add(listener);
    }

}
