package Space;

import Passenger.Human;
import Passenger.Martian;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class SpaceshipTest {

    @Test
    public void checkCapacity() {
        Spacer ship = new Spacer();
        boolean f = false;
        while (!f) {
            f = !ship.bookSeat(new Human("Test Human"));
        }
        Assert.assertFalse(ship.bookSeat(new Human("New Human")));
    }


    @Test
    public void checkMockito() {
        Spaceship deathstar = Mockito.mock(Spaceship.class);

        Mockito.when(deathstar.getSpeed()).thenReturn(100);

        Company geo = new Company("cannibals");


        Assert.assertEquals(100, geo.getShip(deathstar).getSpeed());
    }

}