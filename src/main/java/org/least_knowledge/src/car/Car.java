package org.least_knowledge.src.car;

public class Car {

    Engine engine;
    // other instance variables

    public Car() {
        engine = new Engine();
    }

    public void start (Key key) {
        Doors doors = new Doors();
        boolean authrorized = key.turns();
        if (authrorized) {
            engine.start();
            updateDashboardDisplay();
            doors.lock();
        }
    }

    private void updateDashboardDisplay() {
    }
}



