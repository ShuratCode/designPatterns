package org.facade.easyWay;

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
import org.facade.Tuner.ConcreteTuner;
import org.facade.Tuner.Tuner;

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
