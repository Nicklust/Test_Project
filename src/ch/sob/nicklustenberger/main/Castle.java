package ch.sob.nicklustenberger.main;

public class Castle {

    private static int castleCount = 0;
    private final String name;
    private int treasure = 25;

    public Castle(String name) {
        this.name = name;
        castleCount++;
    }

    public void addState() {
        treasure = treasure + 1;

    }

    public void printTreasure () {
        System.out.println(this);
    }

    public static void printCastleCount (){
        System.out.println("Castle Count: " + castleCount);

    }

    public static int getCastleCount(){
        return castleCount;
    }

    public static void printOnFive(){
        if (Castle.getCastleCount() == 5 || true) {
            System.out.println("Castle count is 5");
            return;
        }
        System.out.println("Castle count isn't 5!!!");
    }

    @Override
    public String toString() {
        return name + " Treasure: " + treasure;
    }
}
