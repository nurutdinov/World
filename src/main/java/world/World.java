package world;

import world.live.animals.invertebrates.protozoa.tubulinida.amoebidae.amoeba.Amoeba;

public class World {
    public static void main(String[] args) {

        Time time = new Time(0);

        Energy amoebaEnergy = new Energy(20, 0.4);
        Amoeba amoeba = new Amoeba(time, 86400, amoebaEnergy, 1.2);
    }
}