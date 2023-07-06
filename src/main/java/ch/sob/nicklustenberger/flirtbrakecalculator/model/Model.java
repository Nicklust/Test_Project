package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String mainPressureText;
    private List<IStringListener> mainPressureTextListeners = new ArrayList<>();
    private List<IStringListener> controllerValvePressureListeners = new ArrayList<>();
    private String controlValvePressureText;

    public void setMainPressureText(String mainPressureText){
        this.mainPressureText = mainPressureText;

        for (IStringListener stringListener: mainPressureTextListeners){
            stringListener.onChanged(mainPressureText);
        }
    }

    public void setControlValvePressure(String controlValvePressureText){
        this.controlValvePressureText = controlValvePressureText;

        for (IStringListener stringListener: controllerValvePressureListeners){
            stringListener.onChanged(controlValvePressureText);
        }
    }

    public void addMainPressureTextListener (IStringListener listener){
        mainPressureTextListeners.add(listener);
    }
    public  void addControlValvePressureListener (IStringListener listener) { controllerValvePressureListeners.add(listener); }
}
