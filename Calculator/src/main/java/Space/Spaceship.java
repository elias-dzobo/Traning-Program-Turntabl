package Space;

import Seats.Seats;

import java.util.ArrayList;

public abstract class Spaceship {

    public final ArrayList<Seats> seats = new ArrayList<Seats>();
    public abstract int getCapacity();

    public abstract int getSpeed();
    public abstract int getSafetyRating();
    public abstract void setCapacity(int capacity);
    public abstract void setSpeed(int speed);
    public abstract void setSafetyRating(int rating);

}
