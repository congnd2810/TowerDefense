package ObjectsGame;

import java.awt.*;

public abstract class Enemy extends GameEntity {

    protected double health;
    protected double speed;
    protected double armor;
    protected int reward;
    protected Direction direction;

    public void updateDirection() {

        if (x == 32 && y > 160) {
            direction = Direction.UP;
        }
        else if (y == 160 && x < 352) {
            direction = Direction.RiGHT;
        }
        else if (x == 352 && y < 480) {
            direction = Direction.DOWN;
        }
        else if (x < 672 && y == 480) {
            direction = Direction.RiGHT;
        }
        else if (x == 672 && y > 224) {
            direction = Direction.UP;
        }
        else if (y == 224 && x <= 960) {
            direction = Direction.RiGHT;
        }
        else if (x > 960) direction = Direction.LEFT;
    }

    @Override
    public void update() {

        switch (direction) {
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
            case LEFT:
                break;
            case RiGHT:
                x += speed;
                break;
        }
    }

    @Override
    public void render(Graphics2D g2d) {

    }
}
