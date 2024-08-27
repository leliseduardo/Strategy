package org.example.strategy;

public class KelvinToCelsiusConversion implements Conversion {

    @Override
    public float convert(float measurement) {
        return measurement - 273;
    }
}