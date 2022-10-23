package org.facade.Amplifier;

import org.facade.StreamingPlayer.StreamingPlayer;
import org.facade.Tuner.Tuner;

public class ConcreteAmplifier implements Amplifier
{
    private Tuner tuner;
    private StreamingPlayer player;

    @Override
    public void on()
    {
        System.out.println("Amplifier on");
    }

    @Override
    public void off()
    {
        System.out.println("Amplifier off");
    }

    @Override
    public void setStreamingPlayer(StreamingPlayer player)
    {
        System.out.println("Amplifier setting Streaming player to: '" + player.toString() + "'");
    }

    @Override
    public void setStereoSound()
    {
        System.out.println("Amplifier stereo sound (2 speakers)");
    }

    @Override
    public void setSurroundSound()
    {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer");
    }

    @Override
    public void setTuner(Tuner tuner)
    {
        System.out.println("Amplifier setting tuner: '" + tuner.toString() + "'");
    }

    @Override
    public void setVolume(int volume)
    {
        System.out.println("Amplifier setting volume '" + volume + "'");
    }
}
