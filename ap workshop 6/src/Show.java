import java.util.Date;

public class Show {
    //the name of show
    private String title;
    //the time show is being executed
    private Date date;

    /**
     * cunstructor for show
     * @param title
     * @param date
     */
    public Show(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    /**
     * getter for title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * getter for Date
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * setter for Date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}

