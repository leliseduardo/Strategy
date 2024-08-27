package org.example.strategy;

public class Measurement {

    private float measurement;

    public float getMeasurement() {
        return this.measurement;
    }

    public void metersToKilometers(float measurement) {
        Converter converter = new Converter(measurement);
        this.measurement = converter.convert(new MetersToKilometersConversion());
    }

    public void kilometersToMeters(float measurement) {
        Converter converter = new Converter(measurement);
        this.measurement = converter.convert(new KilometersToMetersConversion());
    }

    public void kelvinToCelsius(float measurement) {
        Converter converter = new Converter(measurement);
        this.measurement = converter.convert(new KelvinToCelsiusConversion());
    }
}
