package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Pressure {
    private float pressure;

    private String pressureText;

    private List<IFloatListener> pressureListeners = new ArrayList<>();

    private List<IStringListener> pressureTextListeners = new ArrayList<>();

    public void setPressure(float pressure) {
        this.pressure = pressure;

        String pressureInString = "" + pressure;

        int commaIndex = pressureInString.indexOf(".");
        pressureText = pressureInString.subSequence(0, commaIndex + 2) + " Bar";

        for (IFloatListener floatListener : pressureListeners) {
            floatListener.onChanged(pressure);
        }
        for (IStringListener stringListener : pressureTextListeners) {
            stringListener.onChanged(pressureText);
        }
    }


    public void addPressureListeners(IFloatListener listener) {
        pressureListeners.add(listener);
    }

    public void addPressureTextListeners(IStringListener listener) {
        pressureTextListeners.add(listener);
    }
}
