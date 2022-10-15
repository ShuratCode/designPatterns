package org.least_knowledge.src.first_example;

public class StationImpl implements Station {

    Thermometer thermometer;

    public StationImpl(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    @Override
    public Thermometer getThermometer() {
        return thermometer;
    }

    @Override
    public float getTemperature() {
        return thermometer.getTemperature();
    }
}
