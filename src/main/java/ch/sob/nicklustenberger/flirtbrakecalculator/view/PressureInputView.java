package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.IStringListener;
import ch.sob.nicklustenberger.flirtbrakecalculator.model.Pressure;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Hashtable;

public class PressureInputView extends JPanel {

    public PressureInputView(String name, float minPressure, float maxPressure, float startPressure, int stepsPerBar, Pressure output) {

        setLayout(new GridLayout(0, 2));
        JPanel sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridLayout(2, 0));

        JTextField sliderValue = new JTextField();
        sliderValue.setEditable(false);
        sliderValue.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        output.addPressureTextListener(new IStringListener() {
            @Override
            public void onChanged(String value) {
                sliderValue.setText(value + "");
            }
        });

        JLabel title = new JLabel(name);
        int sliderMax = ((int) ((((double) maxPressure) - ((double) minPressure)) * ((double) stepsPerBar)));
        int sliderStart = (int) ((((double) startPressure) - ((double) minPressure)) * ((double) stepsPerBar));
        JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, sliderMax, sliderStart);
        Hashtable<Integer, JLabel> table = new Hashtable<>();
        DecimalFormat df = new DecimalFormat("0.0");
        for (int i = 0; i <= 10; i++) {
            double label = (((maxPressure - minPressure) / 10) * i) + minPressure;
            table.put(((sliderMax / 10) * i), new JLabel(df.format(label)));
        }
        slider.setLabelTable(table);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(false);
        slider.setPaintLabels(true);
        sliderPanel.add(sliderValue);
        sliderPanel.add(slider);
        add(title);
        add(sliderPanel);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                float value = (float) ((((double) slider.getValue()) / ((double) stepsPerBar)) + minPressure);
                output.setPressure(value);
            }
        });

        setBorder(new LineBorder(Color.BLACK));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pressure Input View");


        PressureInputView pressureInputView1 = new PressureInputView("Pressure 1", 0, 10, 5, 100, new Pressure());
        PressureInputView pressureInputView2 = new PressureInputView("Pressure 2", 0, 10, 2, 100, new Pressure());


        frame.setLayout(new GridLayout(2, 1));
        frame.add(pressureInputView1);
        frame.add(pressureInputView2);


        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
