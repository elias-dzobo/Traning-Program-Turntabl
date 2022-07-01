package Seats;

public abstract class Seats {
    private int ID;
    private String name;

    public Seats(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID(){
        return this.ID;
    }

    public void getMeal(){
        System.out.println("Seat number " + this.getID() + " would receive a meal!");
    }
}

