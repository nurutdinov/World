package world.live.animals;

import world.live.Live;

public abstract class Animal extends Live implements Motion, Brain {
    private Float speed;
    private Float acceleration;
    private Float azimuth;
    private Float verticalAngle;

    private Integer neuronCount;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }

    public Float getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Float azimuth) {
        this.azimuth = azimuth;
    }

    public Float getVerticalAngle() {
        return verticalAngle;
    }

    public void setVerticalAngle(Float verticalAngle) {
        this.verticalAngle = verticalAngle;
    }

    public Integer getNeuronCount() {
        return neuronCount;
    }

    public void setNeuronCount(Integer neuronCount) {
        this.neuronCount = neuronCount;
    }
}
