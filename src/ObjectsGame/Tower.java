package ObjectsGame;

import java.awt.*;
import java.awt.geom.AffineTransform;

public abstract class Tower extends GameEntity {

    protected double dame;
    protected double gunspeed;
    protected double shootRange;
    protected Image base;
    public double radian = 0;

    public double getDame() {
        return dame;
    }

    public double getGunspeed() {
        return  gunspeed;
    }

    public double getShootRange() {
        return shootRange;
    }

    public double getRadian() {return  (radian/Math.PI) * 180;}

    public void setRadian(Enemy e) {
        Point a = new Point((int) e.x + 32 - (int) (this.x + 32), (int) e.y + 32 - (int) (this.y + 32));
        Point b = new Point(0, -1);
        if (a.x < 0) {
            radian = -Math.acos((a.x*b.x + a.y*b.y)/(Math.sqrt(a.x*a.x + a.y*a.y) + Math.sqrt(b.x*b.x + b.y*b.y)));
        }
        else {
            radian = Math.acos((a.x*b.x + a.y*b.y)/(Math.sqrt(a.x*a.x + a.y*a.y) + Math.sqrt(b.x*b.x + b.y*b.y)));
        }
    }

    public  abstract  void shoot(Enemy e);

    public void setRadian(double R) {
        radian = R;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        int i =(int) x;
        int j = (int) y;
        int shot = (int) shootRange + 42;

        setBounds(i+32-shot, j+32-shot, shot*2, shot*2);

        graphics2D.drawImage(base, i, j, null);

        AffineTransform backup = graphics2D.getTransform();
        AffineTransform a = AffineTransform.getRotateInstance(radian , i+32, j+32);
        graphics2D.setTransform(a);

        graphics2D.drawImage(img, i, j, null);

        graphics2D.setTransform(backup);
    }
}
