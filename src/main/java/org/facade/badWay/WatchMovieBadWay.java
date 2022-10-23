package org.facade.badWay;

import org.facade.Amplifier.Amplifier;
import org.facade.Amplifier.ConcreteAmplifier;
import org.facade.PopcornPopper.ConcretePopcornPopper;
import org.facade.PopcornPopper.PopcornPopper;
import org.facade.Projector.ConcreteProjector;
import org.facade.Projector.Projector;
import org.facade.Screen.ConcreteScreen;
import org.facade.Screen.Screen;
import org.facade.StreamingPlayer.ConcreteStreamingPlayer;
import org.facade.StreamingPlayer.StreamingPlayer;
import org.facade.TheaterLights.ConcreteTheaterLights;
import org.facade.TheaterLights.TheaterLights;

public class WatchMovieBadWay
{
    public static void main(String[] args)
    {
        PopcornPopper popper = new ConcretePopcornPopper();
        TheaterLights lights = new ConcreteTheaterLights();
        Screen screen = new ConcreteScreen();
        Projector projector = new ConcreteProjector();
        Amplifier amp = new ConcreteAmplifier();
        StreamingPlayer player = new ConcreteStreamingPlayer();

        popper.on();
        popper.pop();

        lights.dim();

        screen.down();

        projector.on();
        projector.setInput(player);
        projector.wideScreenMode();

        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);

        player.on();
        player.play("Movie");
    }
}
