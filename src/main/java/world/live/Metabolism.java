package world.live;

import world.Energy;

public interface Metabolism<Feed extends Live> {

    void eat(Feed food);

    void drink(Feed fluid);
}