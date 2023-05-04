package br.com.fiap.pacman;

public class Ghost extends GameObject{

    private int direction;

    public Ghost() {

    }

    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public void move() {
        setAngle();
        if (direction == 90) setX(getX() + 10);
        if (direction == 270) setX(getX() - 10);
        if (direction == 0) setY(getY() - 10);
        if (direction == 180) setY(getY() + 10);
    }

    private void setAngle() {
        int randomize = (int) (Math.random()*4);
        setDirection(randomize*90);
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction == 0 || direction == 180 || direction == 270 || direction == 90) {
            this.direction = direction;
        }
    }
}
