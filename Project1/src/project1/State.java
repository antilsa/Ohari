package project1;

import java.util.Collection;
import java.util.LinkedList;

class State {

    private Display display;
    private Map map;
    private Player player;
    private Collection<Entity> entities;
    private Mob mob;

    public State() {
    }

    public void gameStart() {
        map = new Map("level_1");
        display = new Display();
        entities = new LinkedList<Entity>();
        player = new Player(2, 2, '@');
        mob = new Mob(3, 4, 'R');
        entities.add(mob);
        mob = new Mob(6, 2, 'K');
        entities.add(player);
        entities.add(mob);
        
    }

    public void gameContinue() {
    }

    public void update() {
        display.draw(map.getX(), map.getY(), entities);
    }

    public void playerMove(String command) {
        char direction = command.charAt(0);
        player.move(direction);
    }
}
