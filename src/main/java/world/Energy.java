package world;

/**
 * @author Rustam Nurutdinov
 * @version dated 14.06.2018
 */

public class Energy {

    private double energy;

    private double usefulEnergy;

    public Energy(double startEnergy, double usefulEnergy) {
        this.usefulEnergy = usefulEnergy;
        this.energy = startEnergy * usefulEnergy;
    }

    public double getEnergy() {
        return energy;
    }

    public void decreaseEnergy(double energyPerSecond) {
        this.energy -= energyPerSecond;
    }

    public void increaseEnergy(double energy) {
        this.energy += energy * usefulEnergy;
    }
}
