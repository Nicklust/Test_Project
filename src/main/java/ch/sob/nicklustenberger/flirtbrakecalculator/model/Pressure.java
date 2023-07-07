package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Pressure {
    private float pressure;

    private String pressureText;

    private List<IFloatListener> pressureListeners = new ArrayList<>();

    private List<IStringListener> pressureTextListeners = new ArrayList<>();

    public void setPressure(float pressure) {

        if (pressure == this.pressure){
            return;
        }

        this.pressure = pressure;

        DecimalFormat df = new DecimalFormat("0.000");

        pressureText = df.format(pressure) + " Bar";

        for (IFloatListener floatListener : pressureListeners) {
            floatListener.onChanged(pressure);
        }
        for (IStringListener stringListener : pressureTextListeners) {
            stringListener.onChanged(pressureText);
        }
    }


    public void addPressureListener(IFloatListener listener) {
        pressureListeners.add(listener);
    }

    public void addPressureTextListener(IStringListener listener) {
        pressureTextListeners.add(listener);
    }
}
