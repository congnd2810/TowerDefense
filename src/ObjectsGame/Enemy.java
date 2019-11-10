package ObjectsGame;

public abstract class Enemy extends GameEntity {

    protected double health;
    protected double speed;
    protected double armor;
    protected int reward;
    protected Direction direction;

    public void updateDirection() {

        if (x == 32 && y > 288) {
            direction = Direction.UP;
        }
        else if (y == 288 && x < 160) {
            direction = Direction.RiGHT;
        }
        else if (x == 160 && y > 96) {
            direction = Direction.UP;
        }
        else if (y == 96 && x < 320 ) {
            direction = Direction.RiGHT;
        }
        else if (x == 352 && y < 352 ) {
            direction = Direction.DOWN;
        }
        else if (y == 352 && x <= 580 ) {
            direction = Direction.RiGHT;
        }
        else if (x > 580) direction = Direction.LEFT;
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
                x -= speed;
                break;
            case RiGHT:
                x += speed;
                break;
        }
    }
}
