package second;

import first.Student;

public class second {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Student std1 = new Student("Mohamad sadegh", "Mohamadi", "9931051");
        std1.setGrade(15);
        Student std2 = new Student("alireza", "sabz", "9931027");
        std2.setGrade(18);
        Student std3 = new Student("amir", "hoseini", "9931054");
        std3.setGrade(15);
        Student std4 = new Student("abbas", "hamidi", "9931085");
        std3.setGrade(10);

        Student[] studentsLab  = new Student[]{ std1, std2, std3 };

        lab Lab = new lab(3, "1400-7-20");
        Lab.setStudents(studentsLab);
        Lab.calculateAvg();
        Lab.enrollStudent(std4);
        Lab.setDay("1400-7-19");
        Lab.setCapacity(4);
        System.out.println("class average is " + Lab.getAvg());
        System.out.println("class date is " + Lab.getDay());
        System.out.println("class capacity is " + Lab.getCapacity());
    }
}
