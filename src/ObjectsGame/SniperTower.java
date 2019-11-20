package ObjectsGame;

import javax.swing.*;
import java.awt.*;

public class SniperTower extends Tower {
    Image base = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "181" + ".png")).getImage();

    public SniperTower(int x, int y) {
        this.x = x;
        this.y = y;
        this.img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "250" + ".png")).getImage();
        this.dame = 20;
        this.gunspeed = 5;
        this.shootRange = 128;
    }

    @Override
    public void render(Graphics2D graphics2D) {
        super.render(graphics2D);
        int i = (int) x;
        int j = (int) y;

        int shot = (int) shootRange + 42;

        setBounds(i+32-shot, j+32-shot, shot*2, shot*2);

        graphics2D.drawImage(base, i , j, null);
        graphics2D.drawImage(img, i, j, null);
    }
}
