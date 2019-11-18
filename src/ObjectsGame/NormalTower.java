package ObjectsGame;

import javax.swing.*;
import java.awt.*;

public class NormalTower extends Tower {

    Image base = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "180" + ".png")).getImage();

    public NormalTower(int x, int y) {
        this.x = x;
        this.y = y;
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "249" + ".png")).getImage();
        this.dame = 10;
        this.gunspeed = 10;
        this.shootRange = 128;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        super.render(graphics2D);
        int i = (int) x;
        int j = (int) y;
        graphics2D.drawImage(base, i , j, null);
        graphics2D.drawImage(img, i, j, null);
    }
}
