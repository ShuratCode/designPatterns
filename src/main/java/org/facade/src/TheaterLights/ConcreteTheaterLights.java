package org.facade.src.TheaterLights;

public class ConcreteTheaterLights implements TheaterLights
{

    @Override
    public void on()
    {
        System.out.println("Theater lights on");
    }

    @Override
    public void off()
    {
        System.out.println("Theater lights off");
    }

    @Override
    public void dim()
    {
        System.out.println("Theater lights dim");
    }
}
