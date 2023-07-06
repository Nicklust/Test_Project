package ch.sob.nicklustenberger.flirtbrakecalculator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCheckValveTest {

    @Test
    void getBrakeControlPressure() {
        DoubleCheckValve doubleCheckValve = new DoubleCheckValve();
        assertEquals(0, doubleCheckValve.getBrakeControlPressure(0,0),0.001);
        assertEquals(1, doubleCheckValve.getBrakeControlPressure(1,0),0.001);
        assertEquals(1, doubleCheckValve.getBrakeControlPressure(0,1),0.001);
        assertEquals(1, doubleCheckValve.getBrakeControlPressure(1,1),0.001);
        assertEquals(2, doubleCheckValve.getBrakeControlPressure(1,2),0.001);
        assertEquals(3, doubleCheckValve.getBrakeControlPressure(3,2),0.001);
        assertEquals(5, doubleCheckValve.getBrakeControlPressure(5,0),0.001);
        assertEquals(5, doubleCheckValve.getBrakeControlPressure(0,5),0.001);
        assertEquals(5, doubleCheckValve.getBrakeControlPressure(5,5),0.001);
    }
}