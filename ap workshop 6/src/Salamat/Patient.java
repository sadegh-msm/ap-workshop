package Salamat;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{
    //birthdate
    Date birthdate;
    //gender
    String gender;
    //basicInsurance
    String baseInsuranceType;
    //additional Insurance
    String additionalInsuranceType;
    //educational Degree
    String educationalDegree;
    //Job
    String Job;
    //Location
    String location;
    //medical history
    MedicalHistory medicHistory;
    // a list of reliable medics
    ArrayList<Medic> reliableMedics;

    /**
     * cunstructor for Patient
     * @param name
     * @param birthdate
     * @param gender
     * @param baseInsuranceType
     * @param additionalInsuranceType
     * @param educationalDegree
     * @param job
     * @param location
     * @param medicHistory
     */
    public Patient(String name, Date birthdate, String gender, String baseInsuranceType, String additionalInsuranceType, String educationalDegree, String job, String location, MedicalHistory medicHistory) {
        super(name);
        this.birthdate = birthdate;
        this.gender = gender;
        this.baseInsuranceType = baseInsuranceType;
        this.additionalInsuranceType = additionalInsuranceType;
        this.educationalDegree = educationalDegree;
        Job = job;
        this.location = location;
        this.medicHistory = medicHistory;
        reliableMedics=new ArrayList<>();
    }

    /**
     * add a medic to reliable medics
     * @param medic
     */
    public void addmedics(Medic medic){}

    /**
     * getter for medical history
     * @return
     */
    public MedicalHistory getMedicHistory() {
        return medicHistory;
    }

    /**
     * setter for medical history
     * @param medicHistory
     */
    public void setMedicHistory(MedicalHistory medicHistory) {
        this.medicHistory = medicHistory;
    }
}

