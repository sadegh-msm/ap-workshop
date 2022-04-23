package first;

/**
 * The type First.
 */
public class first {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student std1 = new Student("Mohamad sadegh", "Mohamadi", "9931051");
        Student std2 = new Student("alireza", "sabz", "9931027");
        Student std3 = new Student("amir", "hoseini", "9931054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("abbas");
        std3.print();
    }
}