package world;

import world.live.animals.invertebrates.protozoa.tubulinida.amoebidae.amoeba.Amoeba;
import world.util.Times;

public class World {
    public static void main(String[] args) {

        Amoeba amoeba = new Amoeba();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(amoeba.ageIs(amoeba.getBirthDate(), amoeba.getMaxAge()).getTime() / Times.getSecond());
    }
}
