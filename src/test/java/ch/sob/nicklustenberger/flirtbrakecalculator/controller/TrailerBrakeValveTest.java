package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailerBrakeValveTest {

    @Test
    void getBrakePipe() {
        TrailerBrakeValve trailerBrakeValve = new TrailerBrakeValve();
        assertEquals(5.0f, trailerBrakeValve.getBrakePipe(0.0f), 0.001);
        assertEquals(4.742f, trailerBrakeValve.getBrakePipe(0.5f), 0.001);
        assertEquals(4.485f, trailerBrakeValve.getBrakePipe(1.0f), 0.001);
        assertEquals(4.228f, trailerBrakeValve.getBrakePipe(1.5f), 0.001);
        assertEquals(3.971f, trailerBrakeValve.getBrakePipe(2.0f), 0.001);
        assertEquals(3.714f, trailerBrakeValve.getBrakePipe(2.5f), 0.001);
        assertEquals(3.457f, trailerBrakeValve.getBrakePipe(3.0f), 0.001);
        assertEquals(3.2f, trailerBrakeValve.getBrakePipe(3.5f), 0.001);
    }
}