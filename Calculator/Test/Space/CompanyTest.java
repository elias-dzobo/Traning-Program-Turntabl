package Space;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CompanyTest {

    Company turntabl = new Company("turntabl");

    @Test
    public void getCompanyName() {

        String name = turntabl.getCompanyName();
        Assert.assertEquals("turntabl", name);
    }

    @Test
    public void testFleetExpansion() {
        turntabl.createNewSpacer();
        turntabl.createNewStardelino();
        turntabl.createNewBulletship();

        int size = turntabl.getFleet().size();

        Assert.assertEquals(3, size);
    }

    @Test
    public void testSpaceship() {
        ArrayList<Spaceship> fleet = turntabl.getFleet();
        Spaceship sample = fleet.get(0);

        //Assert.assertEquals(450, sample.getSpeed());

    }

    @Test
    public void testChangeSpeed() {
        Company terza = new Company("Terza");
        terza.createNewStardelino();
        Spaceship terzaShip = terza.getFleet().get(0);
        terza.upgradeShipSpeed(terzaShip, 350);

        Assert.assertEquals(350, terzaShip.getSpeed());
    }

    @Test
    public void testFines() {
        Company dino = new Company("Dino");
        dino.createNewSpacer();
        Spaceship dinoSpacer = dino.getFleet().get(0);
        dino.upgradeShipSpeed(dinoSpacer, 3000);

        Assert.assertNotEquals(1000000, dino.getWealth());
    }
}