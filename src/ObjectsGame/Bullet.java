package ObjectsGame;

import javax.swing.*;
import java.awt.*;

public class Bullet extends GameEntity {
    boolean Invisible = true;

    Point A;
    Point B;
    public Bullet(int x, int y,Point A){
        this.x = x ;
        this.y = y ;
        this.img =  new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "272" + ".png")).getImage();
        this.A = A;
        this.B = new Point(x,y);
    }
    @Override
    public void update() {
        if(A.x > 0) {
            x = x +4;
        }else {
            x = x - 4;
        }
        y =B.y-(((x-B.x)*A.y)/A.x);
    }

    @Override
    public void render(Graphics2D g2d) {
        update();
        int  i =(int) (x);
        int  j =(int) (y);
        setBounds(i,j,10,10);
        g2d.drawImage(img,i,j,null);
    }
}