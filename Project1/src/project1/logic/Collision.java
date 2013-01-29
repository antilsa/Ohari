package project1.logic;

import java.util.Collection;
import project1.Entity;

public class Collision {

    public static final char UP = 'w';
    public static final char LEFT = 'a';
    public static final char DOWN = 's';
    public static final char RIGHT = 'd';

    public Collision() {
    }

    public Entity collisionCheck(int playerX, int playerY, char direction, Collection<Entity> entities) {
        if (direction == UP) {
            for (Entity entity : entities) {
                if (entity.getX() == playerX && entity.getY() == playerY--) {
                    return entity;
                }
            }
        }
        if (direction == LEFT) {
            for (Entity entity : entities) {
                if (entity.getX() == playerX-- && entity.getY() == playerY) {
                    return entity;
                }
            }
        }
        if (direction == DOWN) {
            for (Entity entity : entities) {
                if (entity.getX() == playerX && entity.getY() == playerY++) {
                    return entity;
                }
            }
        }
        if (direction == RIGHT) {
            for (Entity entity : entities) {
                if (entity.getX() == playerX++ && entity.getY() == playerY) {
                    return entity;
                }
            }
        }
        return null;
    }

    public void combat(Entity attacker, Entity defender) {
        defender.receiveDamage(attacker.dealDamage());
    }
}
