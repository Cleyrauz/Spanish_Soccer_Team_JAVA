import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MassageTherapistTest {

    MassageTherapist massageTherapist;

    @Before
    public void setUp(){
        massageTherapist = new MassageTherapist("Raul", "Cespedes", 54, 3, "Professional Massage Therapist", 20);
    }

    @Test
    public void massageTherapistHasName(){
        assertEquals("Raul Cespedes", massageTherapist.niceName());
    }

    @Test
    public void massageTherapistHasAge(){
        assertEquals(54, massageTherapist.getAge());
    }

    @Test
    public void massageTherapistHasId(){
        assertEquals(3, massageTherapist.getId());
    }


    @Test
    public void massageTherapistHasActionInGame(){
        assertEquals("Give massage", massageTherapist.actionInField());
    }

    @Test
    public void massageTherapistCanConcentrate(){
        assertEquals("Concentration: Ohhhhmmmm", massageTherapist.concentration());
    }

    @Test
    public void massageTherapistCanToTravel(){
        assertEquals("Traveling to Rusia", massageTherapist.travel());
    }

    @Test
    public void massageTherapistHasACertificate(){
        assertEquals("Professional Massage Therapist", massageTherapist.getCertification());
    }

    @Test
    public void massageTherapistHasYearsOfExperience(){
        assertEquals(20, massageTherapist.getYearsOfExperience());
    }

}
