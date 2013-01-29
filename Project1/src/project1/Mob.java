package project1;

public class Mob implements Entity {

    private int x;
    private int y;
    private char icon;

    public Mob(int x, int y, char icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
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
}