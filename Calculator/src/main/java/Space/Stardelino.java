package Space;

import Passenger.Human;
import Passenger.Martian;
import Seats.HumanSeats;
import Seats.MartianSeats;

public class Stardelino extends Spaceship{
    private int capacity;
    private int speed;
    private int rating;

    public Stardelino() {
        this.capacity = 80;
        this.speed = 900;
        this.rating = 8;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getSafetyRating() {
        return rating;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setSpeed(int speed){
        if (speed > 900) {
            System.out.println("Speed specification is in violation of intergalactic travel code.");
        }
        else {
            this.speed = speed;
        }
    }

    @Override
    public void setSafetyRating(int safety){
        this.rating = safety;
    }

    public boolean bookSeat(Human ex){
        if ( this.seats.size() < this.getCapacity() ) {
            int ID = this.getCapacity() + 1;
            String name = ex.getName();
            HumanSeats newSeat = new HumanSeats(ID, name);
            this.seats.add(newSeat);
            newSeat.getMeal();
            return true;
        } else {
            System.out.println("Ship Full!!");
            return false;
        }
    }

    public boolean bookSeat(Martian ex){
        if (this.seats.size() < this.getCapacity()) {
            int ID = this.getCapacity() + 1;
            String name = ex.getName();
            MartianSeats newSeat = new MartianSeats(ID, name);
            this.seats.add(newSeat);
            newSeat.getMeal();
            return true;
        } else {
            System.out.println("Ship Full!!");
            return false;
        }
    }

}