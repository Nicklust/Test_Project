package ch.sob.nicklustenberger.array;

import ch.sob.nicklustenberger.main.Castle;

public class Main {
    public static void main(String[] args) {

        int castleAmount = 10;
        Castle[] castles = new Castle[castleAmount];

        for (int i = 0; i < castleAmount; i++) {
            castles[i] = new Castle("Castle " + (i + 1));
        }
        for (Castle castle: castles) {
           // castle.printTreasure();
        }

        Castle[][] fortresses = new Castle[4][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                fortresses[j][i] = new Castle("Castle " + (j * 3 + i + 1));
            }
        }

        for (Castle[] fortresse: fortresses) {
            for (Castle fortress: fortresse) {
                fortress.printTreasure();
            }
        }
    }
}
