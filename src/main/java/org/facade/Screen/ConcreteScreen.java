package org.facade.Screen;

public class ConcreteScreen implements Screen
{
    @Override
    public void up()
    {
        System.out.println("Screen up");
    }

    @Override
    public void down()
    {
        System.out.println("Screen down");
    }
}
