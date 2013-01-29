package project1;


import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    Player player;
    State state;
    Mob mob;
    public static final char UP = 'w';
    public static final char LEFT = 'a';
    public static final char DOWN = 's';
    public static final char RIGHT = 'd';
    
    @Before
    public void setUp() {
        player = new Player(2, 3, '@');
        state = new State();
        mob = new Mob(4, 4, 'T');
    }
    
    @Test
    public void moving() {
        player.move(LEFT);
        player.move(LEFT);
        assertEquals(0, player.getX());
    }
    
//    @Test
//    public void collision() {
//        state.playerMove("d");
//        state.playerMove("d");
//        state.playerMove("s");
//        assertEquals(3, player.getY());
//    }
    
    @After
    public void tearDown() {
    }
    
}
