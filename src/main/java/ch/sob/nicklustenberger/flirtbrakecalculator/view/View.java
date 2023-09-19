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
        panel.setBackground(Color.DARK_GRAY);

        try {
            ImageIcon flirtImage = new ImageIcon(new URL((View.class.getClassLoader().getResource("") +"resources/images/flirt1-2.jpg")));
            flirtImage = new ImageIcon(flirtImage.getImage().getScaledInstance(3000,250, Image.SCALE_SMOOTH));
            JPanel flirtImageLabel = new JPanel();
            flirtImageLabel.add(new JLabel(flirtImage));


            JScrollPane scrollPane = new JScrollPane(flirtImageLabel);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setBounds(0, 500 , 2000, 270);
            add(scrollPane);


        } catch (Exception e) {
            e.printStackTrace();
        }


        JPanel controlValve = new JPanel();
        controlValve.add(new OutputView("Steuerventil", 0.000 + " Bar", model.controlValve));
        controlValve.setBounds(100,150,500,100);


        panel.add(new DigitalInputView(" Siebenstufen Hebel", 0, 8, 0, model.sevenStepSignal));
        panel.add(new PressureInputView("Luftfederung 1", 3, 6.3f, 5, 100, model.load1));
        panel.add(new PressureInputView("Luftfederung 2", 0, 6.3f, 0, 100, model.load2));
        panel.add(new PressureInputView("Luftfederung 4", 0, 6.3f, 0, 100, model.load4));
        panel.add(new PressureInputView("Luftfederung 3", 0, 6.3f, 0, 100, model.load3));
        panel.add(new PressureInputView("Luftfederung 5", 0, 6.3f, 0, 100, model.load5));

        panel.add(new OutputView("Steuerdruck Siebenstufen Ventil", 0.000 + " Bar", model.sevenStepControl));
        panel.add(new OutputView("Hauptleitungsdruck", 5.000 + " Bar", model.main));




        add(controlValve);
        add(panel);


        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
