package Persona;

import java.util.HashMap;

public class Company {
    String name;
    HashMap<Spaceship, Integer> fleet = new HashMap<Spaceship, Integer>();

    public static void main(String[] args) {
        Company spaceT = new Company();
        Company turntablGalatic = new Company();

        Spaceship spacer = new Spaceship();
        spacer.capacity = 20;
        spacer.speed = 450;
        spacer.safetyRating = 4;

        Spaceship stardelino = new Spaceship();
        stardelino.capacity = 80;
        stardelino.speed = 900;
        stardelino.safetyRating = 8;

        Spaceship bulletship = new Spaceship();
        bulletship.capacity = 100;
        bulletship.speed = 1800;
        bulletship.safetyRating = 2;

        spaceT.fleet.put(spacer, 1);
        spaceT.fleet.put(stardelino, 12);
        spaceT.fleet.put(bulletship, 7);

        turntablGalatic.fleet.put(spacer, 3);
        turntablGalatic.fleet.put(stardelino, 13);
        turntablGalatic.fleet.put(bulletship, 6);

        System.out.println(spaceT.getFleetSize());
        System.out.println(turntablGalatic.getFleetSize());

        System.out.println(spaceT.getTotalCapacity());
        System.out.println(turntablGalatic.getTotalCapacity());

        System.out.println(spaceT.capacitySafety());
        System.out.println(turntablGalatic.capacitySafety());


        //System.out.println(spaceT.getFastFleet());

        //spaceT.GreatestFastFleet(turntablGalatic);
        System.out.println("Before");
        System.out.println(spaceT.getFastFleet());
        System.out.println(turntablGalatic.getFastFleet());

        spacer.speed = 2000;
        System.out.println("After");
        System.out.println(spaceT.getFastFleet());
        System.out.println(turntablGalatic.getFastFleet());
        //spaceT.GreatestFastFleet(turntablGalatic);

    }

    public int getFleetSize(){
        int size = 0;
        for(Integer i: fleet.values()){
            size += i;
        }

        return size;
    }

    public int getTotalCapacity(){
        int totalCapacity = 0;
        for(Spaceship i: fleet.keySet()) {
            int noAvailable = fleet.get(i);
            int shipCapacity = i.capacity;
            totalCapacity += (noAvailable * shipCapacity);
        }
        return totalCapacity;
    }

    public int capacitySafety(){
        int safeCapacity = 0;
        for (Spaceship i: fleet.keySet()) {
            if (i.safetyRating > 4) {
                int num = fleet.get(i);
                int cap = i.capacity;
                safeCapacity += (cap * num);
            }
        }
        return safeCapacity;
    }

    public int getFastFleet(){
        int maxSpeed = 0;
        int cap = 0;
        for (Spaceship i: fleet.keySet()) {
            if (i.speed > maxSpeed) {
                maxSpeed = i.speed;
                cap = fleet.get(i);
            }
        }
        return cap;
    }

    public void GreatestFastFleet(Company b) {
        int a_size = this.getFastFleet();
        int b_size =- b.getFastFleet();
        System.out.println(a_size);
        System.out.println(b_size);
        if (a_size > b_size) {
            System.out.println("Persona.Company A's fleet has the greatest number of fastest ships");
        } else {
            System.out.println("Persona.Company B's fleet has the greatest number of fastest ships");
        }
    }

    //public void updateSpeed()


}
