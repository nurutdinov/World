package world.live.animals;

import world.live.Live;

public abstract class Moving extends Live implements Motion {
    private Float speed;
    private Float acceleration;
    private Float azimuth;
    private Float verticaAngle;

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

    public Float getVerticaAngle() {
        return verticaAngle;
    }

    public void setVerticaAngle(Float verticaAngle) {
        this.verticaAngle = verticaAngle;
    }
}
