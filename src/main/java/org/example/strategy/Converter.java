package org.example.strategy;

public class Converter {

    public float measurement;

    public Converter(float measurement) {
        this.measurement = measurement;
    }

    public float convert(Conversion conversion) {
        return conversion.convert(measurement);
    }
}

