import java.util.ArrayList;

public class Reservation {
    // an array list of seats which are being reserved
    ArrayList<Seat> seats;
    //a theater which has some seats reserved
    Theater theater;

    /**
     * a constructor for Reservation class
     */
    public Reservation() {
        seats=new ArrayList<>();
    }

    /**
     * getter for arraylist of seats
     * @return
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    /**
     * setter for arraylist of seats
     * @param seats
     */
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    /**
     * getter for theather
     * @return
     */
    public Theater getTheater() {
        return theater;
    }

    /**
     * setter for theater
     * @param theater
     */
    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
