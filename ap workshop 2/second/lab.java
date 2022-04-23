package second;

import first.Student;

/**
 * The type Lab.
 */
public class lab {
    // array of students
    private Student[] students;
    // average of students grade
    private int avg;
    // date of class
    private String day;
    // capacity of class
    private int capacity;
    // current size of class
    private int currentSize;

    /**
     * Instantiates a new Lab.
     *
     * @param cap the cap
     * @param d   the d
     */
    public lab(int cap, String d) {
        capacity = cap;
        day = d;
        this.students = new Student[capacity];
    }

    /**
     * Enroll student.
     *
     * @param std the std
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * Prints the students info.
     */
    public void print() {
        for (int i=0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }

    /**
     * Get students student.
     *
     * @return the student
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(Student[] students) {
        for (int i=0; i < students.length; i++) {
            this.students[i] = students[i];
        }
    }

    /**
     * Gets avg.
     *
     * @return the avg
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Calculate avg.
     */
    public void calculateAvg() {
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].grade;
            flag++;
        }
        avg = sum / flag;
    }

    /**
     * Gets day.
     *
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets day.
     *
     * @param day the day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
