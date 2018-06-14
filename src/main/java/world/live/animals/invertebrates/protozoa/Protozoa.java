package world.live.animals.invertebrates.protozoa;

import world.Energy;
import world.Time;
import world.live.animals.invertebrates.Invertebrate;

public abstract class Protozoa extends Invertebrate {

    public Protozoa(Time time, long maxAge, Energy energy, double energyPerSecond) {
        super(time, maxAge, energy, energyPerSecond);
    }
}
