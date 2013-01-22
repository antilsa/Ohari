package project1;

import java.util.Collection;
import java.util.LinkedList;

class State {

    private Display display;
    private Map map;
    private Player player;
    private Collection<Entity> entities;

    public State() {
    }

    public void gameStart() {
        map = new Map("level_1");
        display = new Display();
        player = new Player(2, 3, '@');
        entities = new LinkedList<Entity>();
        entities.add(player);
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
