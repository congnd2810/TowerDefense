package ObjectsGame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class TankerEnemy extends Enemy {
    private Image imgTank = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile291.png")).getImage();

    public TankerEnemy (double x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 1;
        this.health = 10;
        this.armor = 1;
        this.reward = 50;
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile268.png")).getImage();
        this.direction = Direction.UP;
    }

    @Override
    public void render(Graphics2D g2d){
        int i =(int) x;
        int j = (int) y;

        setBounds(i, j, 64, 64);

        updateDirection();

        AffineTransform backup = g2d.getTransform();

        if (direction == Direction.UP) {
            update();
            AffineTransform a = AffineTransform.getRotateInstance(-Math.PI / 2, i + 32, j + 32);
            g2d.setTransform(a);
            g2d.drawImage(img, i, j, null);
            g2d.drawImage(imgTank, i, j, null);
        }
        else if (direction == Direction.RiGHT) {
            update();
            AffineTransform a = AffineTransform.getRotateInstance(0 , i + 32, j + 32);
            g2d.setTransform(a);
            g2d.drawImage(img, i, j , null);
            g2d.drawImage(imgTank, i, j, null);
        }
        else if (direction == Direction.DOWN) {
            update();
            AffineTransform a = AffineTransform.getRotateInstance( Math.PI/2, i + 32, j + 32);
            g2d.setTransform(a);
            g2d.drawImage(img, i, j, null);
            g2d.drawImage(imgTank, i , j , null);
        }
        g2d.setTransform(backup);
    }

}

