package ObjectsGame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class NormalEnemy extends Enemy {
    public NormalEnemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 1;
        this.health = 10;
        this.armor = 1;
        this.reward = 50;
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile246.png")).getImage();
        this.direction = Direction.UP;
    }

    @Override
    public void render(Graphics2D g2d) {
        int i =(int) x;
        int j = (int) y;

        updateDirection();

        if (direction == Direction.UP) {
            update();
            AffineTransform backup = g2d.getTransform();
            AffineTransform a = AffineTransform.getRotateInstance(-Math.PI / 2, i, j);
            g2d.setTransform(a);
            g2d.drawImage(img, i, j, null);
        }
        else if (direction == Direction.RiGHT) {
            update();
            AffineTransform backup = g2d.getTransform();
            AffineTransform a = AffineTransform.getRotateInstance(0 , i, j);
            g2d.setTransform(a);
            g2d.drawImage(img, i, j - 64, null);
        }
        else if (direction == Direction.DOWN) {
            update();
            AffineTransform backup = g2d.getTransform();
            AffineTransform a = AffineTransform.getRotateInstance( Math.PI/2, i, j);
            g2d.setTransform(a);
            g2d.drawImage(img, i - 64, j - 64 , null);
        }
    }
}
