package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.IStringListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class OutputView extends JPanel {

    private JLabel label;
    private JTextField textField;

    public OutputView(String name, String start, Pressure pressure){
        setLayout(new GridLayout(0, 2));
        label = new JLabel(name);
        textField = new JTextField(start);
        textField.setEditable(false);
        add(label);
        add(textField);
        setBorder(new LineBorder(Color.BLACK));
        pressure.addPressureTextListeners(new IStringListener() {
            @Override
            public void onChanged(String value) {
                textField.setText(value);
            }
        });
    }

}
