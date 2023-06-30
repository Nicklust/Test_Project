package ch.sob.nicklustenberger.flirtbreakecalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String mainPressureText;
    private List<IStringListener> mainPressureTextListeners = new ArrayList<>();

    public void setMainPressureText(String mainPressureText){
        this.mainPressureText = mainPressureText;

        for (IStringListener stringListener: mainPressureTextListeners){
            stringListener.onChanged(mainPressureText);
        }
    }

    public void addMainPressureTextListener (IStringListener listener){
        mainPressureTextListeners.add(listener);
    }
}
