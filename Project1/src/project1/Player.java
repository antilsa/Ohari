package project1;

class Player implements Entity {

    private int x;
    private int y;
    private char icon;
    public static final char UP = 'w';
    public static final char LEFT = 'a';
    public static final char DOWN = 's';
    public static final char RIGHT = 'd';

    public Player(int x, int y, char icon) {
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
    
    public void move(char direction) {
            if (direction == UP) {
                this.y--;
            } else if (direction == DOWN) {
                this.y++;
            } else if (direction == LEFT) {
                this.x--;
            } else if (direction == RIGHT) {
                this.x++;
            }
    }
}
