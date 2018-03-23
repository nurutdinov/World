package world.live.animals.invertebrates.protozoa.tubulinida.amoebidae.amoeba;

import world.live.animals.invertebrates.protozoa.Protozoa;
import world.util.Times;

import java.util.Date;


public class Amoeba extends Protozoa {
    public Amoeba() {
        Date today = new Date();
        setBirthDate(today);
        setMaxAge(Times.getDAY());
    }
}
