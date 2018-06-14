package world.live.animals.invertebrates;

import world.Energy;
import world.Time;
import world.live.animals.Animal;

public abstract class Invertebrate extends Animal {

    public Invertebrate(Time time, long maxAge, Energy energy, double energyPerSecond) {
        super(time, maxAge, energy, energyPerSecond);
    }
}
