package Seats;

public class HumanSeats extends Seats{

    public HumanSeats(int ID, String name){
        super(ID, name);
    }

    @Override
    public void getMeal(){
        System.out.println("Seat number " + this.getID() + " would receive Pizza!");
    }
}
