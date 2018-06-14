package world.live;

import world.Energy;
import world.Time;

public abstract class Live implements Metabolism {

    private Time time;

    private long birthDate;

    private long age;

    private long maxAge;

    private Energy energy;

    public Live(Time time, long maxAge, Energy energy, final double energyPerSecond) {
        this.time = time;
        this.birthDate = time.getTime();
        this.age = 0;
        this.maxAge = maxAge;
        this.energy = energy;

        Thread liveThread = new Thread(new Runnable() {
            public void run() {
                live(energyPerSecond);
            }
        });
        liveThread.start();
    }

    public void live(double energyPerSecond) {
        while (age < maxAge && energy.getEnergy() > 0) {
            age--;
            energy.decreaseEnergy(energyPerSecond);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void eat(Live food) {
        energy.increaseEnergy(food.energy.getEnergy());
    }

    public void drink(Live fluid) {
        energy.increaseEnergy(fluid.energy.getEnergy());
    }

    public Energy getEnergy() {
        return energy;
    }

    public long getAge() {
        return time.getTime() - birthDate;
    }

    public long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(long maxAge) {
        this.maxAge = maxAge;
    }
}