package ch.sob.nicklustenberger.flirtbreakecalculator.controller;

public class ControlValve {

    private float brakePipe = 0;
    private float controlPressure = 0;
    public void update() {
        float middleValue = (float) ((3.8 / 2.2) * brakePipe);
        controlPressure = (float) (3.8 - ((middleValue) - 4.5));

        if (controlPressure <= 0) {
            controlPressure = 0;
        }
        if (controlPressure >= 3.8) {
            controlPressure = 3.8F;
        }
    }

    public void setBrakePipe (float brakePipe){
        this.brakePipe = brakePipe;
    }

    public float getControlPressure(){
        return controlPressure;
    }
}
