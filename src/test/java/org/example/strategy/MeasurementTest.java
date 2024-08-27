package org.example.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void shouldReturnKilometersFromMeters() {
        Measurement measurement = new Measurement();
        measurement.metersToKilometers(1000);
        assertEquals(1.0f, measurement.getMeasurement());
    }

    @Test
    void shouldReturnMetersFromKilometers() {
        Measurement measurement = new Measurement();
        measurement.kilometersToMeters(1);
        assertEquals(1000.0f, measurement.getMeasurement());
    }

    @Test
    void shouldReturnCelsiusFromKelvin() {
        Measurement measurement = new Measurement();
        measurement.kelvinToCelsius(250);
        assertEquals(-23.0f, measurement.getMeasurement());
    }
}