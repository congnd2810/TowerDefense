package ObjectsGame;

import java.awt.*;

public abstract class Tower extends GameEntity {

    protected double dame;
    protected double gunspeed;
    protected double shootRange;
    public static double radian = 0;

    public double getDame() {
        return dame;
    }

    public double getGunspeed() {
        return  gunspeed;
    }

    public double getShootRange() {
        return shootRange;
    }

    public double getRadian(Enemy e) {
        Point a = new Point((int) e.x - (int) this.x, (int) e.y -(int) this.y);
        Point b = new Point(0, 1);
        radian = Math.acos((a.x*b.x + a.y*b.y)/(Math.sqrt(a.x*a.x + a.y*a.y) + Math.sqrt(b.x*b.x + b.y*b.y)));
        return radian;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics2D g2d) {

    }
}
