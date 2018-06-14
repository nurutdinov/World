package world.live;

public interface Reproduction<F, M> {

    F reproductionF(F mother, M father);

    M reproductionM(F mother, M father);

    F reproductionF(F mother);

    M reproductionM(F mother);
}
