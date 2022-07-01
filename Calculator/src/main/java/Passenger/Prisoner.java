package Passenger;

public class Prisoner extends Passenger{
    private Passenger inmate;
    private int sentence;
    private int timeDone;

    private boolean isFree;

    public Passenger getInmate() {
        return inmate;
    }

    public int getSentence() {
        return sentence;
    }

    public int getTimeDone() {
        return timeDone;
    }

    public boolean getFree() {
        return isFree;
    }

}
