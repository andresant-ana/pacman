package br.com.fiap.pacman;

public class Player extends GameObject {

    private int direction;
    private int life = 1;
    private boolean invincible;

    public Player() {

    }

    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public void move() {
        if (this.direction == 90) setX(getX() + 10);
        if (this.direction == 270) setX(getX() - 10);
        if (this.direction == 0) setY(getY() - 10);
        if (this.direction == 180) setY(getY() + 10);
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction == 0 || direction == 180 || direction == 270 || direction == 90) {
            this.direction = direction;
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    public void loseLife() {
        if (!isInvincible()) life--;
    }

    public boolean isColiding(GameObject object) {
        return getX() == object.getX() && getY() == object.getY();
    }

}
