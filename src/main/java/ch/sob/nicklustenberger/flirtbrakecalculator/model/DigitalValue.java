package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import ch.sob.nicklustenberger.flirtbrakecalculator.view.IIntListener;

import java.util.ArrayList;
import java.util.List;

public class DigitalValue {
    private int digitalValue;


    private List<IIntListener> listeners = new ArrayList<>();


    public void setDigitalValue(int digitalValue) {
        this.digitalValue = digitalValue;

        for (IIntListener intListener : listeners) {
            intListener.onChanged(digitalValue);
        }
    }


    public void addDigitalValueListeners(IIntListener listener) {
        listeners.add(listener);
    }

}
