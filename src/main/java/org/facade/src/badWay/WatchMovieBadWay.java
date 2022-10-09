package org.facade.src.badWay;

import org.facade.src.Amplifier.Amplifier;
import org.facade.src.Amplifier.ConcreteAmplifier;
import org.facade.src.PopcornPopper.ConcretePopcornPopper;
import org.facade.src.PopcornPopper.PopcornPopper;
import org.facade.src.Projector.ConcreteProjector;
import org.facade.src.Projector.Projector;
import org.facade.src.Screen.ConcreteScreen;
import org.facade.src.Screen.Screen;
import org.facade.src.StreamingPlayer.ConcreteStreamingPlayer;
import org.facade.src.StreamingPlayer.StreamingPlayer;
import org.facade.src.TheaterLights.ConcreteTheaterLights;
import org.facade.src.TheaterLights.TheaterLights;

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
