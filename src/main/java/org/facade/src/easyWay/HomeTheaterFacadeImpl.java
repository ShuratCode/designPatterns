package org.facade.src.easyWay;

import org.facade.src.Amplifier.Amplifier;
import org.facade.src.PopcornPopper.PopcornPopper;
import org.facade.src.Projector.Projector;
import org.facade.src.Screen.Screen;
import org.facade.src.StreamingPlayer.StreamingPlayer;
import org.facade.src.TheaterLights.TheaterLights;
import org.facade.src.Tuner.Tuner;

public class HomeTheaterFacadeImpl implements HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacadeImpl(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector,
                                 TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();

        lights.dim();

        screen.down();
        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);

        player.on();
        player.play(movie);
    }

    @Override
    public void endMovie() {
        System.out.println("Movie is ended");
    }

    @Override
    public void listenToRadio() {
        System.out.println("Get ready to listen to radio");
    }

    @Override
    public void endRadio() {
        System.out.println("Ended listen to radio");
    }
}
