package ch.sob.nicklustenberger.erben;

public abstract class AValve {

    private final String name;
    private final String itemNumber;
    private final String valveNumber;

    protected AValve(String name, String itemNumber, String valveNumber) {
        this.name = name;
        this.itemNumber = itemNumber;
        this.valveNumber = valveNumber;
    }

    public abstract float function(float inputA);

}
