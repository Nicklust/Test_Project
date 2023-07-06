package ch.sob.nicklustenberger.flirtbrakecalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public DigitalValue sevenStepSignal = new DigitalValue();

    public Pressure sevenStepControl = new Pressure();
    public Pressure main = new Pressure();
    public Pressure controlValve = new Pressure();
    public Pressure epControl = new Pressure();
    public Pressure brakeControl = new Pressure();
    public Pressure load1 = new Pressure();
    public Pressure load2 = new Pressure();
    public Pressure brake = new Pressure();

}