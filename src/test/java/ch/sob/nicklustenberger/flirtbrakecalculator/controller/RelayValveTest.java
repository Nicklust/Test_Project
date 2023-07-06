package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayValveTest {

    //Test für E 53.013.4 Serie 109 (Für Flirt 1. Serie)
    @Test
    void getBrakeCylinder() {
        RelayValve relayValve = new RelayValve();
        assertEquals(0, relayValve.getBrakeCylinder(0, 0,0), 0.001);
        assertEquals(1.45f, relayValve.getBrakeCylinder(1.9f, 0,0), 0.001);
        assertEquals(2.9f, relayValve.getBrakeCylinder(3.8f, 0,0), 0.001);
        assertEquals(0, relayValve.getBrakeCylinder(0, 0,0), 0.001);
    }
}