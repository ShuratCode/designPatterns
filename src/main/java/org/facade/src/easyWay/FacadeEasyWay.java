package org.facade.src.easyWay;

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
import org.facade.src.Tuner.ConcreteTuner;
import org.facade.src.Tuner.Tuner;

public class FacadeEasyWay {
    public static void main(String[] args) {
        PopcornPopper popper = new ConcretePopcornPopper();
        TheaterLights lights = new ConcreteTheaterLights();
        Screen screen = new ConcreteScreen();
        Projector projector = new ConcreteProjector();
        Amplifier amp = new ConcreteAmplifier();
        StreamingPlayer player = new ConcreteStreamingPlayer();
        Tuner tuner = new ConcreteTuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacadeImpl(amp, tuner, player, projector, lights, screen,
                                                                  popper);
        homeTheater.watchMovie("Pirates of the Caribbean");
        homeTheater.endMovie();
    }
}
