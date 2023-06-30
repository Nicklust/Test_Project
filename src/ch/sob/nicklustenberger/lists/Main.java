package ch.sob.nicklustenberger.lists;

import ch.sob.nicklustenberger.main.Castle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int castleAmount = 10;
        List<Castle> castles = new ArrayList<>();

        for (int i = 0; i < castleAmount; i++) {
            castles.add(new Castle("Castle " + (i + 1)));
        }
        castles.add(new Castle("Hogwarts"));
        for (Castle castle: castles) {
            castle.printTreasure();
        }
    }
}
