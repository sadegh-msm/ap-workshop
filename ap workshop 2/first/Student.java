package first;

/**
 * The type Student.
 */
public class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    /**
     * The Grade.
     */
//the grade
    public int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first.first name of student
     * @param lName last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lName, String sID){
          firstName = fName;
          lastName = lName;
          id = sID;
          grade = 0;
      }

    /**
     * get the first.first name of student
     *
     * @return firstName field
     */
    public String getFirstName() {
         return firstName;
     }

    /**
     * Sets first name.
     *
     * @param fName set first.first name of a student
     */
    public void setFirstName(String fName) {
         firstName = fName;
     }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
         System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
     }

    /**
     * set the grade of student
     *
     * @param grade field
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
