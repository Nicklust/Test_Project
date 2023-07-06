package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlValveTest {

    @Test
    void getControlPressure() {
        ControlValve controlValve = new ControlValve();
        assertEquals(0, controlValve.getControlPressure(5));
    }
}