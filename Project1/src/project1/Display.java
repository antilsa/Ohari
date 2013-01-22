
package project1;

import java.util.Collection;


class Display {

    public Display() {
    }

    public void draw(int width, int height, Collection<Entity> entities) {
        int x = 0;
        int y = 0;
        while (y < height) {
            x = 0;
            while (x < width) {
                for (Entity entity : entities) {
                    if (entity.getX() == x && entity.getY() == y) {
                        System.out.print(entity.getIcon());
                    } else {
                        System.out.print(".");
                    }
                }
                x++;
            }
            System.out.println("");
            y++;
        }
    }

}
