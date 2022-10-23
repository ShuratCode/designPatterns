package org.facade.Amplifier;

import org.facade.StreamingPlayer.StreamingPlayer;
import org.facade.Tuner.Tuner;

public interface Amplifier
{
    public void on();
    public void off();
    public void setStreamingPlayer(StreamingPlayer player);
    public void setStereoSound();
    public void setSurroundSound();
    public void setTuner(Tuner tuner);
    public void setVolume(int volume);
    public String toString();
}
