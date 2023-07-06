package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SevenStepView extends JPanel {
    private JLabel sevenStepLabel = new JLabel("Siebenstufen Ventil");
    private JSlider sevenStep;
    private List<ISliderListener> sevenStepListeners = new ArrayList<>();
    public SevenStepView(){
        setLayout(new GridLayout(0,2));
        JLabel sevenStepLabel = new JLabel("Siebenstufen Ventil");
        add(sevenStepLabel);
        sevenStep = new JSlider(SwingConstants.HORIZONTAL, 0, 8, 0);
        sevenStep.setMajorTickSpacing(1);
        sevenStep.setPaintTicks(true);
        sevenStep.setPaintLabels(true);
        add(sevenStep);
        sevenStep.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                for (ISliderListener listener: sevenStepListeners) {
                    listener.onChanged(sevenStep.getValue());
                }
            }
        });
        setBorder(new LineBorder(Color.BLACK));
    }
    public void addListener (ISliderListener listener){
        sevenStepListeners.add(listener);
    }
}
