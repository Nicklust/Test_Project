package ch.sob.nicklustenberger.flirtbrakecalculator.view;

import ch.sob.nicklustenberger.flirtbrakecalculator.model.Model;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class View extends JFrame {
    private Model model;


    public View (Model model) {
        super ("Flirt brake calculator");
        this.model = model;

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        JTextField sliderValue = new JTextField();
        sliderValue.setEditable(false);
        sliderValue.setFont(new Font(Font.MONOSPACED, Font.PLAIN,  20));



        try

        {
            ImageIcon flirtImage = new ImageIcon(new URL((View.class.getClassLoader().getResource("") + "resources/images/flirt1-2.jpg")));
            flirtImage = new ImageIcon(flirtImage.getImage().getScaledInstance(3250, 300, Image.SCALE_SMOOTH));
            JPanel flirtImageLabel = new JPanel();
            flirtImageLabel.add(new JLabel(flirtImage));


            JScrollPane scrollPane = new JScrollPane(flirtImageLabel);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setBounds(0, 0, 2000, 300);
            add(scrollPane);


        } catch(
                Exception e)

        {
            e.printStackTrace();
        }



        JPanel controllerPanel = new JPanel();
        controllerPanel.setLayout(new GridLayout(0, 2));
        controllerPanel.setBackground(Color.DARK_GRAY);
        controllerPanel.setBounds(0, 300, 1800, 500);

        controllerPanel.add(new OutputView("Steuerventil", 0.000 + " Bar", model.controlValve));
        controllerPanel.add(new DigitalInputView(" Siebenstufen Hebel", 0, 8, 0, model.sevenStepSignal));
        controllerPanel.add(new PressureInputView("Luftfederung 1", 3, 6.3f, 5, 100, model.load1));
        controllerPanel.add(new PressureInputView("Luftfederung 2", 0, 6.3f, 0, 100, model.load2));
        controllerPanel.add(new PressureInputView("Luftfederung 3", 0, 6.3f, 0, 100, model.load3));
        controllerPanel.add(new PressureInputView("Luftfederung 4", 0, 6.3f, 0, 100, model.load4));
        controllerPanel.add(new PressureInputView("Luftfederung 5", 0, 6.3f, 0, 100, model.load5));


        controllerPanel.add(new OutputView("Steuerdruck Siebenstufen Ventil", 0.000 + " Bar", model.sevenStepControl));
        controllerPanel.add(new OutputView("Hauptleitungsdruck", 5.000 + " Bar", model.main));



        add(controllerPanel);
        add(panel);


        setExtendedState(MAXIMIZED_BOTH);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



}
