package ch.sob.nicklustenberger.flirtbreakecalculator.view;

import ch.sob.nicklustenberger.flirtbreakecalculator.model.IStringListener;
import ch.sob.nicklustenberger.flirtbreakecalculator.model.Model;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ControlValveView extends JPanel {
    public ControlValveView (Model model){
        setLayout(new GridLayout(0,2));
        JLabel controlValveLabel = new JLabel("Steuerventil Druck");
        add(controlValveLabel);
        JTextField controlValve = new JTextField("0.000 Bar");
        model.addControlValvePressureListener(new IStringListener() {
            @Override
            public void onChanged(String value) { controlValve.setText(value);}
        });
        controlValve.setEditable(false);
        add(controlValve);
        setBorder(new LineBorder(Color.BLACK));
    }
}
