package ObjectsGame;

import java.awt.*;

public abstract class Tower extends GameEntity {

    protected double dame;
    protected double gunspeed;
    protected double shootRange;

    public double getDame() {
        return dame;
    }

    public double getGunspeed() {
        return  gunspeed;
    }

    public double getShootRange() {
        return shootRange;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics2D g2d) {

    }
}
