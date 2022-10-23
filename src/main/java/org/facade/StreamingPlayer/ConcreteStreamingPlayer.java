package org.facade.StreamingPlayer;

public class ConcreteStreamingPlayer implements StreamingPlayer
{
    @Override
    public void on()
    {
        System.out.println("Streaming player on");
    }

    @Override
    public void off()
    {
        System.out.println("Streaming player off");
    }

    @Override
    public void pause()
    {
        System.out.println("Streaming player pause");
    }

    @Override
    public void play(String movie)
    {
        System.out.println("Streaming player play '" + movie + "'");
    }

    @Override
    public void setSurroundAudio()
    {
        System.out.println("Streaming player surround audio");
    }

    @Override
    public void setTwoChannelAudio()
    {
        System.out.println("Streaming player two channel audio");
    }

    @Override
    public void stop()
    {
        System.out.println("Streaming player stop");
    }
}
