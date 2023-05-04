package br.com.fiap.pacman;

public class Booster extends Item{

    private int invincibleDuration;

    public Booster() {

    }

    public Booster(int x, int y, int invincibleDuration) {
        super(x, y);
        this.invincibleDuration = invincibleDuration;
    }

    public int getInvincibleDuration() {
        return invincibleDuration;
    }

    public void setInvincibleDuration(int invincibleDuration) {
        this.invincibleDuration = invincibleDuration;
    }
}
