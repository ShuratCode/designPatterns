package org.least_knowledge.first_example;

public class FirstExample {

    private Station station;

    public FirstExample(Station station) {this.station = station;}

    public float getTemp() {
        return station.getThermometer().getTemperature();
    }

    public float getTempWithPrinciple() {
        return station.getTemperature();
    }
}
