package org.example.strategy;

public class KilometersToMetersConversion implements Conversion {

    @Override
    public float convert(float measurement) {
        return measurement * 1000.0f;
    }
}
