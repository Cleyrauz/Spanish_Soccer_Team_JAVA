import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CoachTest {

    Coach coach;

    @Before
    public void setUp() {
        coach = new Coach("Reinaldo", "Rueda", 61, 2, 34);
    }

    @Test
    public void coachHasName(){
        assertEquals("Reinaldo Rueda", coach.niceName());
    }

    @Test
    public void coachHasAge(){
        assertEquals(61, coach.getAge());
    }

    @Test
    public void coachHasId(){
        assertEquals(2, coach.getId());
    }

    @Test
    public void coachHasAnIdFederation(){
        assertEquals(34, coach.getIdFederation());
    }


    @Test
    public void coachCanToPlanAStrategy(){
        assertEquals("Planning a strategy to win the World Cup", coach.planStrategy());
    }

    @Test
    public void coachCanAttendToGame(){
        assertEquals("Lead a game", coach.actionInField());
    }

    @Test
    public void coachCanConcentrate(){
        assertEquals("Concentration: Ohhhhmmmm", coach.concentration());
    }

    @Test
    public void coachCanToTravel(){
        assertEquals("Traveling to Rusia", coach.travel());
    }

    @Test
    public void coachCanGetPenalize(){
        assertEquals("Oh no! I will have to see the game from very far away.", coach.getPenalize());
    }
}
