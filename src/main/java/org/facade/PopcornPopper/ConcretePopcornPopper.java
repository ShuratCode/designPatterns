package org.facade.PopcornPopper;

public class ConcretePopcornPopper implements PopcornPopper
{
    @Override
    public void on()
    {
        System.out.println("Popcorn Popper on");
    }

    @Override
    public void off()
    {
        System.out.println("Popcorn Popper off");
    }

    @Override
    public void pop()
    {
        System.out.println("Popcorn Popper popping popcorn");
    }
}
