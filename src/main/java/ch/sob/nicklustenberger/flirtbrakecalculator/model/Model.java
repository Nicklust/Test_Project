package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private String sevenStepControlPressureText;
    private float sevenStepControlPressure;
    private List<IStringListener> sevenStepControlPressureTextListeners = new ArrayList<>();
    private List<IFloatListener> sevenStepControlPressureListeners = new ArrayList<>();

    private String mainPressureText;
    private float mainPressure;
    private List<IStringListener> mainPressureTextListeners = new ArrayList<>();
    private List<IFloatListener> mainPressureListeners = new ArrayList<>();

    private String controlValvePressureText;
    private float controlValvePressure;
    private List<IStringListener> controllerValvePressureTextListeners = new ArrayList<>();
    private List<IFloatListener> controlValvePressureListeners = new ArrayList<>();

    private String epControlPressureText;
    private float epControlPressure;
    private List<IStringListener> epControlPressureTextListeners = new ArrayList<>();
    private List<IFloatListener> epControlPressureListeners = new ArrayList<>();

    private String brakeControlPressureText;
    private float brakeControlPressure;
    private List<IStringListener> brakeControlPressureTextListeners = new ArrayList<>();
    private List<IFloatListener> brakeControlPressureListeners = new ArrayList<>();

    private float loadPressure1;
    private List<IFloatListener> getLoadPressure1Listeners = new ArrayList<>();

    private float loadPressure2;
    private List<IFloatListener> loadPressure2Listeners = new ArrayList<>();

    private String brakePressureText;
    private List<IStringListener> brakePressureTextListeners = new ArrayList<>();




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
