package world;

/**
 * @author Rustam Nurutdinov
 * @version dated 14.06.2018
 */

public class Time {
    private double speed;
    private long time;

    public Time(long startTime) {
        this.speed = 1.0;
        this.time = startTime;

        Thread timeThread = new Thread(new Runnable() {
            public void run() {
                tic();
            }
        });
        timeThread.start();
    }

    private void tic() {
        while (true) {
            try {
                Thread.sleep(1000);
                time += 1000 * speed;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public long getTime() {
        return time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}