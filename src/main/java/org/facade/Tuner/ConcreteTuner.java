package org.facade.Tuner;

public class ConcreteTuner implements Tuner
{
    @Override
    public void on()
    {
        System.out.println("Tuner on");
    }

    @Override
    public void off()
    {
        System.out.println("Tuner off");
    }

    @Override
    public void setAm()
    {
        System.out.println("Tuner setting AM");
    }

    @Override
    public void setFm()
    {
        System.out.println("Tuner set FM");
    }

    @Override
    public void setFrequency()
    {
        System.out.println("Tuner set frequency");
    }
}
