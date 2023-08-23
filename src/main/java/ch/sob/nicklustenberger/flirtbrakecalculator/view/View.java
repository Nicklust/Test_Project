package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class View extends JFrame {
    private Model model;


    public View (Model model) {
        super ("Flirt brake calculator");
        this.model = model;

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        add(panel);


        try {
            ImageIcon flirtImage = new ImageIcon(new URL((View.class.getClassLoader().getResource("") +"resources/images/Flirt1-2.jpg")));
            flirtImage = new ImageIcon(flirtImage.getImage().getScaledInstance(2000,175, java.awt.Image.SCALE_SMOOTH));
            panel.add(new JLabel(flirtImage));
        } catch (Exception e) {
          e.printStackTrace();
        }


        panel.add(new DigitalInputView("Siebenstufen Hebel", 0, 8, 0, model.sevenStepSignal));
        panel.add(new PressureInputView("Luftfederung 1", 3, 6.3f, 5, 100, model.load1));
        panel.add(new PressureInputView("Luftfederung 2", 0, 6.3f, 0, 100, model.load2));
       // panel.add(new PressureInputView("Luftfederung 4", 0, 6.3f, 0, 100, model.load4));
       // panel.add(new PressureInputView("Luftfederung 3", 0, 6.3f, 0, 100, model.load3));
       // panel.add(new PressureInputView("Luftfederung 5", 0, 6.3f, 0, 100, model.load5));
        panel.add(new OutputView("Steuerdruck Siebenstufen Ventil", 0.000 + " Bar", model.sevenStepControl));
        panel.add(new OutputView("Hauptleitungsdruck", 5.000 + " Bar", model.main));
        panel.add(new OutputView("Steuerventil", 0.000 + " Bar", model.controlValve));
        setSize(2000, 1180);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
