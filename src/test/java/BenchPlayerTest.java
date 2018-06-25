import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BenchPlayerTest {

    BenchPlayer benchPlayer;

    @Before
    public void setUp(){
      benchPlayer = new BenchPlayer("Jose Manuel", "Reina", 35, 4,  "Goal Keeper", 23);
    }

    @Test
    public void playerHasName() {
        assertEquals("Jose Manuel Reina", benchPlayer.niceName());
    }

    @Test
    public void playerHasAge(){
        assertEquals(35, benchPlayer.getAge());
    }

    @Test
    public void playerHasId(){
        assertEquals(4, benchPlayer.getId());
    }

    @Test
    public void playerHasASquadNumber(){
        assertEquals(23, benchPlayer.getSquadNumber());
    }

    @Test
    public void playerHasAPlayingPosition(){
        assertEquals("Goal Keeper", benchPlayer.getPlayingPosition());
    }

    @Test
    public void playerCanTrain(){
        assertEquals("Training", benchPlayer.train());
    }

    @Test
    public void playerCanToTravel(){
        assertEquals("Traveling to Rusia", benchPlayer.travel());
    }

    @Test
    public void playerCanConcenrait(){
        assertEquals("Concentration: Ohhhhmmmm", benchPlayer.concentration());
    }

    @Test
    public void playerHasActionInGame(){
        assertEquals( "Sit in bench", benchPlayer.actionInField());
    }

    @Test
    public void playerCanWarmUp(){
        assertEquals("Warming up", benchPlayer.warmUp());
    }

}