package Seats;

public class MartianSeats extends Seats{

    public MartianSeats(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void getMeal(){
        System.out.println("Seat number " + this.getID() + " would receive Rock Crunchies!");
    }
}
