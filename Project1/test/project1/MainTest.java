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
    
    @Before
    public void setUp() {
        player = new Player(2, 3, '@');
        state = new State();
    }
    
    @Test
    public void moving() {
        player.move('a');
        player.move('a');
        assertEquals(0, player.getX());
    }
    
    @Test
    public void movingInput() {
    }
    
    @After
    public void tearDown() {
    }
    
}
