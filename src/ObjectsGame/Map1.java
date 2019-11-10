package ObjectsGame;

import javax.swing.*;
import java.awt.*;

public class Map1 extends GameEntity {

    public Map1(){}

    public String[][] MAP_SPRITES = new String[][] {
            { "024", "024", "003", "047", "047", "047", "004", "024", "024", "024" },
            { "024", "024", "025", "299", "001", "002", "023", "024", "024", "024" },
            { "024", "024", "025", "023", "024", "025", "023", "024", "024", "024" },
            { "003", "047", "048", "023", "024", "025", "023", "024", "024", "024" },
            { "025", "299", "001", "027", "024", "025", "046", "047", "047", "047" },
            { "025", "023", "024", "024", "024", "026", "001", "001", "001", "001" },
            { "025", "023", "024", "024", "024", "024", "024", "024", "024", "024" },
    };

    @Override
    public void update(){}

    @Override
    public void render(Graphics2D g2d) {
        for (int i = 0; i < MAP_SPRITES.length; i++) {
            for (int j = 0; j < MAP_SPRITES[i].length; j++) {
                Image img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + MAP_SPRITES[i][j] + ".png")).getImage();
                g2d.drawImage(img, j * 64, i * 64, null);
            }
        }

        Image img7 = new ImageIcon(getClass().getResource("/Defaultsize/bkg" + ".png")).getImage();
        Image img = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "130" + ".png")).getImage();
        Image img1 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "132" + ".png")).getImage();
        Image img2 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "020" + ".png")).getImage();
        Image img3 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "131" + ".png")).getImage();
        Image img4 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "020" + ".png")).getImage();
        Image img5 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "136" + ".png")).getImage();
        Image img6 = new ImageIcon(getClass().getResource("/Defaultsize/towerDefense_tile" + "132" + ".png")).getImage();

        g2d.drawImage(img7, 640,0, null );
        g2d.drawImage(img, 0 , 0, null);
        g2d.drawImage(img1, 194 , 360, null);
        g2d.drawImage(img2, 0 , 0, null);
        g2d.drawImage(img3, 466 , 370, null);
        g2d.drawImage(img4, 466 , 370, null);
        g2d.drawImage(img5, 512 , 64, null);
        g2d.drawImage(img6, 520 , 45, null);
    }
}
