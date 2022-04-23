public class Seat {
    // row of a seat
    private int row;
    // col of a seat
    private int col;
    //num of a seat
    private int number;
    // determines wether a seat is reserved or not
    private boolean isrserved;

    /**
     * constructor for Seat
     * @param row
     * @param col
     * @param number
     */
    public Seat(int row, int col,int number) {
        this.row = row;
        this.col = col;
        this.number=number;
        isrserved=false;
    }

    /**
     * marks a seat as reserved
     */
    public void resevrveSeat(){}

    /**
     * getter for row
     * @return
     */
    public int getRow() {
        return row;
    }

    /**
     * setter for row
     * @param row
     */
    public void setRow(int row) {
        this.row = row;
    }
    /**
     * getter for col
     * @return
     */
    public int getCol() {
        return col;
    }
    /**
     * setter for col
     * @param col
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * returns true if a seat is reserved
     * @return
     */
    public boolean isIsrserved() {
        return isrserved;
    }

    /**
     * changes the state of being reserved of a seat
     * @param isrserved
     */
    public void setIsrserved(boolean isrserved) {
        this.isrserved = isrserved;
    }
}
