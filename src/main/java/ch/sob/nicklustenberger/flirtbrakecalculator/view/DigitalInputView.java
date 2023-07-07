package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.DigitalValue;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class DigitalInputView extends JPanel {


    public DigitalInputView(String name, int sliderMin, int sliderMax, int sliderStart, DigitalValue output){
        setLayout(new GridLayout(0, 2));
        JLabel label = new JLabel(name);
        JSlider slider = new JSlider(SwingConstants.HORIZONTAL, sliderMin, sliderMax, sliderStart);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(label);
        add(slider);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                output.setDigitalValue(slider.getValue());
            }
        });


        setBorder(new LineBorder(Color.BLACK));
    }
}
