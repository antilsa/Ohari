package project1;

public class Mob implements Entity {

    private int x;
    private int y;
    private char icon;
    private int hp;

    public Mob(int x, int y, char icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
        this.hp = 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getIcon() {
        return icon;
    }

    @Override
    public int dealDamage() {
        return 1;
    }

    @Override
    public void receiveDamage(int damage) {
        this.hp -= damage;
    }
}