package ObjectsGame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class NormalTower extends Tower {
    ArrayList<Bullet>bullets = new ArrayList<>();
    long start=System.currentTimeMillis();
    public NormalTower(int x, int y) {
        this.x = x;
        this.y = y;
        this.base = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "180" + ".png")).getImage();
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "249" + ".png")).getImage();
        this.dame = 10;
        this.gunspeed = 10;
        this.shootRange = 128;
    }

    @Override
    public void update() {

    }

    @Override
    public void shoot(Enemy e) {
        long end = System.currentTimeMillis();
        if((end-start)/300 > 1){
            start = System.currentTimeMillis();
            Point a = new Point((int) e.x + 32 - (int) (this.x + 32), -((int) e.y + 32 - (int) (this.y + 32)));
            bullets.add(new Bullet((int)x,(int)y,a));
        }
        for(Bullet bullet : bullets){
            if(e.intersects(bullet)){
                bullet.Invisible = false;
            }
        }

    }
    @Override
    public void render(Graphics2D graphics2D){
        super.render(graphics2D);
        for(int a = 0 ; a < bullets.size() ; a++){
            if(bullets.get(a).Invisible){
                if(Math.abs(bullets.get(a).x - this.x) > shootRange )
                    bullets.get(a).Invisible = false;
                bullets.get(a).render(graphics2D);
            }else{
                bullets.remove(a);
            }
        }
    }
}
