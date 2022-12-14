package org.facade.Projector;

import org.facade.StreamingPlayer.StreamingPlayer;

public interface Projector
{
    public void on();
    public void off();
    public void tvMode();
    public void wideScreenMode();
    public void setInput(StreamingPlayer player);
    public String toString();
}
