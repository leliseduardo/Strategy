package org.example.strategy;

public class MetersToKilometersConversion implements Conversion {

    @Override
    public float convert(float measurement) {
        return measurement / 1000.0f;
    }
}