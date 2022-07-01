package Space;

import java.util.List;
import java.util.*;

public class Company {
    private String companyName;
    private ArrayList<Spaceship> fleet = new ArrayList<Spaceship>();

    private HashMap<String, Integer> stats;

    private double wealth = 10000000;

    public Company(String companyName) {
        this.companyName = companyName;
        this.stats = new HashMap<String, Integer>();
        this.stats.put("Persona.Spacer", 0);
        this.stats.put("Persona.Stardelino", 0);
        this.stats.put("Persona.Bulletship", 0);
        this.stats.put("Warpship", 0);
    }

    public String getCompanyName(){
        return companyName;
    }

    public ArrayList<Spaceship> getFleet(){
        return fleet;
    }

    public void upgradeShipSpeed(Spaceship ship, int newSpeed) {
        if (!fleet.contains(ship)) {
            System.out.println("You do not own this ship");
        } else if (newSpeed > 900 && !(ship instanceof Bulletship)) {
            System.out.println("New Speed is in violation of intergalactic travel code!! You would be fined!");
            this.wealth = this.wealth-10000;
        } else {
            ship.setSpeed(newSpeed);
        }
    }

    public void createNewSpacer(){
        Spacer ship = new Spacer();
        fleet.add(ship);
        int count = stats.get("Persona.Spacer");
        stats.put("Persona.Spacer", count+1);
        System.out.println("New Persona.Spacer Created");
    }
    public void createNewStardelino(){
        Stardelino ship = new Stardelino();
        fleet.add(ship);
        int count = stats.get("Persona.Stardelino");
        stats.put("Persona.Stardelino", count+1);
        System.out.println("New Persona.Stardelino Created");
    }
    public void createNewBulletship(){
        Bulletship ship = new Bulletship();
        fleet.add(ship);
        int count = stats.get("Persona.Bulletship");
        stats.put("Persona.Bulletship", count+1);
        System.out.println("New Persona.Bulletship Created");
    }
    public void createNewWarpship(int c, int s, int r){
        Warpship ship = new Warpship(c, s, r);
        fleet.add(ship);
        int count = stats.get("Warpship");
        stats.put("Warpship", count+1);
        System.out.println("New Warpship Created");
    }

    public void getStats() {
        for(String i: stats.keySet()) {
            System.out.println("The company has " + i + " : " + stats.get(i));
        }
    }

    public double getWealth(){
        return this.wealth;
    }

    public Spaceship getShip(Spaceship ship) {
        return ship;
    }

}




