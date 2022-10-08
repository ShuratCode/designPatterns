package org.facade.src.Projector;

import org.facade.src.StreamingPlayer.StreamingPlayer;

public class ConcreteProjector implements Projector
{
    @Override
    public void on()
    {
        System.out.println("Projector on");
    }

    @Override
    public void off()
    {
        System.out.println("Projector off");
    }

    @Override
    public void tvMode()
    {
        System.out.println("Projector set tvMode");
    }

    @Override
    public void wideScreenMode()
    {
        System.out.println("Projector set wide screen mode");
    }

    @Override
    public void setInput(StreamingPlayer player)
    {
        System.out.println("Projector setting player: '" + player + "'");
    }
}
