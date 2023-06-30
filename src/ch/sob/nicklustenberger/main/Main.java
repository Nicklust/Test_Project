package ch.sob.nicklustenberger.main;

public class Main {
    private static int state = 0;
    public static void main(String[] args) {


        Castle.printCastleCount();
        Castle hogwarts = new Castle("Hogwarts");
        Castle.printCastleCount();
        Castle durmstrang = new Castle("Durmstrang");
        Castle.printCastleCount();
        Castle.printOnFive();
        hogwarts.printTreasure();
        hogwarts.addState();
        hogwarts.printTreasure();
        durmstrang.printTreasure();
        int count = 5;
        char letter = '¬';
        int addition = 2;

        System.out.println("count: " + count + letter);
        double result = Math.pow(count, addition);
        System.out.println(result);
    }



}