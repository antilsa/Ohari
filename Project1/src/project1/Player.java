package project1;

class Player implements Entity {

    private int x;
    private int y;
    private char icon;

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
            if (direction == 'w') {
                this.y--;
            } else if (direction == 's') {
                this.y++;
            } else if (direction == 'a') {
                this.x--;
            } else if (direction == 'd') {
                this.x++;
            }
    }
}
