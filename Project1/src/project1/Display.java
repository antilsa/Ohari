package project1;

import java.util.Collection;

class Display {

    public Display() {
    }

    public void draw(int width, int height, Collection<Entity> entities) {
        int x;
        int y = 0;
        while (y < height) {
            x = 0;
            char icon;
            while (x < width) {
                icon = '.';
                for (Entity entity : entities) {
                    if (entity.getX() == x && entity.getY() == y) {
                        icon = entity.getIcon();
                    }
                }
                System.out.print(icon);
                x++;
            }
            System.out.println("");
            y++;
        }
    }
}
