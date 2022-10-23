package org.facade.StreamingPlayer;

public interface StreamingPlayer
{
    public void on();
    public void off();
    public void pause();
    public void play(String movie);
    public void setSurroundAudio();
    public void setTwoChannelAudio();
    public void stop();
    public String toString();
}
