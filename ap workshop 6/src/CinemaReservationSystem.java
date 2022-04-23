import java.util.ArrayList;
import java.util.HashMap;

public class CinemaReservationSystem {
    //maps a specific customer to a specific reservation
    private final HashMap<Customer, Reservation> reserveList;

    /**
     * cunstructor for class
     */
    public CinemaReservationSystem() {
        reserveList = new HashMap<>();
    }

    /**
     * adds a new pair to the hashmap
     *
     * @param customer
     * @param reservation
     */
    public void addResevation(Customer customer, Reservation reservation) {
    }

    /**
     * adds a new pair of customer,and arraylist of reservations to the hashmap
     *
     * @param customer
     * @param reservations
     */
    public void addMultiResevation(Customer customer, ArrayList<Reservation> reservations) {
    }

    /**
     * prints the Info of a reservation
     * name of customer and resrvation date,show title,etc
     */
    public void printReservationInfo() {
    }

    /**
     * removes a pair from the hashmap using the key
     *
     * @param customer
     */
    public void removeReservation(Customer customer) {
    }
}
