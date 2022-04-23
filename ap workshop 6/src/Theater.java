import java.util.ArrayList;
import java.util.Date;

public class Theater {
    //seats of the theater
    private ArrayList<Seat> seats;
    //show of the specified theater
    private Show show;

    /**
     * constructor for Theater
     * @param show
     */
    public Theater(Show show) {
        seats=new ArrayList<>();
        this.show=show;
    }

    /**
     * reserves a seat in a theter with known show and date and time
     * @param seat
     * @param date
     */
    public void reserveSeat(Seat seat, Date date){}

    /**
     * searches for free seats of size,size in a row
     * @param size
     */
    public void findRowSeats(int size){}

    /**
     * prints the details of a theater and its shows and seats situation
     */
    public void printDetails(){}

}
