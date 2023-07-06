package ch.sob.nicklustenberger.erben;

public class DoubleCheckValve extends AValve{
    protected DoubleCheckValve() {
        super("Doppelrückschlag Ventil", "E 55.019.4", "710056");
    }

    @Override
    public float function(float inputA, float inputB) {
        if (inputA > inputB){
            return inputA;
        }
        return inputB;
    }
}
