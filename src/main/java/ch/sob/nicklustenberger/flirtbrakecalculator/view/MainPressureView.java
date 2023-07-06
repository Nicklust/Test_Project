package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.IStringListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MainPressureView extends JPanel {
    public MainPressureView(Model model){
        setLayout(new GridLayout(0,2));
        JLabel mainPressureLabel = new JLabel("Hauptleitung");
        add(mainPressureLabel);
        JTextField mainPressure = new JTextField("5.000 Bar");
        model.addMainPressureTextListener(new IStringListener() {
            @Override
            public void onChanged(String value) {
                mainPressure.setText(value);
            }
        });
        mainPressure.setEditable(false);
        add(mainPressure);
        setBorder(new LineBorder(Color.BLACK));
    }
}
