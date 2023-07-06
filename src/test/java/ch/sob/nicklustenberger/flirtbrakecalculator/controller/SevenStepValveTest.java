package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenStepValveTest {

    @Test
    void getControlPressure() {
        SevenStepValve sevenStepValve = new SevenStepValve();
        assertEquals(0f, sevenStepValve.getControlPressure(0), 0.001);
        assertEquals(0.5f, sevenStepValve.getControlPressure(1), 0.001);
        assertEquals(1f, sevenStepValve.getControlPressure(2), 0.001);
        assertEquals(1.5f, sevenStepValve.getControlPressure(3), 0.001);
        assertEquals(2f, sevenStepValve.getControlPressure(4), 0.001);
        assertEquals(2.5f, sevenStepValve.getControlPressure(5), 0.001);
        assertEquals(3f, sevenStepValve.getControlPressure(6), 0.001);
        assertEquals(3.5f, sevenStepValve.getControlPressure(7), 0.001);
    }
}