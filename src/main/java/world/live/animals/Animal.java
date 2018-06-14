package world.live.animals;

import world.Energy;
import world.Time;
import world.live.Live;

public abstract class Animal extends Live {

    public Animal(Time time, long maxAge, Energy energy, double energyPerSecond) {
        super(time, maxAge, energy, energyPerSecond);
    }
}
