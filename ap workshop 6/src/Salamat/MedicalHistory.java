package Salamat;

import java.util.ArrayList;
import java.util.Date;

public class MedicalHistory {
    //determines the illness type using the enum defined before
    private Illnesstype illnesstype;
    //a statement about patirnts situation
    private String illnessSituation;
    //the result of diagnose of medic about a patient
    private String medicDetection;
    //the drugs tat are prescripted by the medic to cure the patient
    private ArrayList<String> prescriptedDrugs;
    //determines the ilnnes security level using the Enum type defined before
    private ilnessSecurityLevel ilnessSecurityLevel;
    Date date;

    /**
     * constructor for MedicalHistory
     * @param illnesstype
     * @param illnessSituation
     * @param medicDetection
     * @param prescriptedDrugs
     * @param ilnessSecurityLevel
     */
    public MedicalHistory(Illnesstype illnesstype, String illnessSituation, String medicDetection, ArrayList<String> prescriptedDrugs, ilnessSecurityLevel ilnessSecurityLevel) {
        this.illnesstype = illnesstype;
        this.illnessSituation = illnessSituation;
        this.medicDetection = medicDetection;
        this.prescriptedDrugs = prescriptedDrugs;
        this.ilnessSecurityLevel = ilnessSecurityLevel;
    }
}

