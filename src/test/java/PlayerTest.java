import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
       player = new Player("Andres", "Iniesta", 34, 1, "Midfield", 6) ;
    }

    @Test
    public void playerHasName(){
        assertEquals("Andres Iniesta", player.niceName());
    }

    @Test
    public void playerHasAge(){
        assertEquals(34, player.getAge());
    }

    @Test
    public void playerHasId(){
        assertEquals(1, player.getId());
    }

    @Test
    public void playerHasASquadNumber(){
        assertEquals(6, player.getSquadNumber() );
    }

    @Test
    public void playerHasAPlayingPosition(){
        assertEquals("Midfield", player.getPlayingPosition());
    }

    @Test
    public void playerCanTrain(){
        assertEquals("Training", player.train());
    }

    @Test
    public void playerCanBeInterviewed(){
      assertEquals("Give an Interview", player.Interview());
    }

    @Test
    public void playerCanToTravel(){
        assertEquals("Traveling to Rusia", player.travel());
    }

    @Test
    public void playerCanConcentrait(){
        assertEquals("Concentration: Ohhhhmmmm", player.concentration());
    }

    @Test
    public void playerHasActionInGame(){
        assertEquals( "Play Soccer", player.actionInField());
    }

    @Test
    public void playerCanGetPenalize() {
     assertEquals("Oh no! I am not going to play the next game.", player.getPenalize());
    }

}
