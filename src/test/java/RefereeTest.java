import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RefereeTest {

    Referee referee;
    Player player;
    Coach coach;

    @Before
    public void setUp(){
        referee = new Referee("Juan", "Sanchez", 33, 5);
        player = new Player("Andres", "Iniesta", 34, 1, "Midfield", 6) ;
        coach = new Coach("Reinaldo", "Rueda", 61, 2, 34);
    }

    @Test
    public void refereeHasName(){
        assertEquals("Juan Sanchez", referee.niceName());
    }

    @Test
    public void refereeHasAge(){
        assertEquals(33, referee.getAge());
    }

    @Test
    public void refereeHasId(){
        assertEquals(5, referee.getId());
    }

    @Test
    public void refereeCanToTravel(){
        assertEquals("Traveling to Rusia", referee.travel());
    }

    @Test
    public void refereeCanConcentrait(){
        assertEquals("Concentration: Ohhhhmmmm", referee.concentration());
    }

    @Test
    public void refereeHasActionInGame(){
        assertEquals( "Apply rules in game", referee.actionInField());
    }

    @Test
    public void refereeCanPenalizeACoach() {
        assertEquals("Oh no! I will have to see the game from very far away.", referee.penalize(coach));
    }

}
