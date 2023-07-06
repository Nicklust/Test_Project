package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlValveTest {

    @Test
    void getControlPressure() {
        ControlValve controlValve = new ControlValve();
        assertEquals(0, controlValve.getControlPressure(5.0f), 0);
        assertEquals(0, controlValve.getControlPressure(4.9f), 0);
        assertEquals(0, controlValve.getControlPressure(4.8f), 0);
        assertEquals(0, controlValve.getControlPressure(4.75f), 0);
        assertEquals(0.0878f, controlValve.getControlPressure(4.7f) , 0.001);
        assertEquals(0.433f, controlValve.getControlPressure(4.5f) , 0.001);
        assertEquals(1.0f, controlValve.getControlPressure(4.1688f) , 0.001);
        assertEquals(1.296f, controlValve.getControlPressure(4.0f) , 0.001);
        assertEquals(3.022f, controlValve.getControlPressure(3.0f) , 0.001);
        assertEquals(3.7987f, controlValve.getControlPressure(2.55f), 0.001);
        assertEquals(3.8f, controlValve.getControlPressure(2.0f), 0);
        assertEquals(3.8f, controlValve.getControlPressure(1.0f), 0);
        assertEquals(3.8f, controlValve.getControlPressure(0.0f), 0);
    }
}