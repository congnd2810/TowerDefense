package ObjectsGame;

import javax.swing.*;
import java.awt.*;

public class SniperTower extends Tower {

    public SniperTower(int x, int y) {
        this.x = x;
        this.y = y;
        this.base = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "181" + ".png")).getImage();;
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "250" + ".png")).getImage();
        this.dame = 20;
        this.gunspeed = 5;
        this.shootRange = 128;
    }

    @Override
    public void update() {

    }

    @Override
    public void shoot(Enemy e) {

    }
}
