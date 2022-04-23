import java.util.ArrayList;


public class Customer {
    // name field
    private String name;
    //the seat(s) a customer reserved
    private ArrayList<Integer> seats;
    /**
     * cunstructor for Customer
     */
    public Customer(String name)
    {
        this.name=name;
        seats=new ArrayList<>();
    }

    /**
     * adds new seat reseved by customer to the arraylist of seats
     */
    public void addReservations(){}

    /**
     * prints the name of customer and the seats reseved by him/her
     */
    public void printCustomerInfo(){}

}