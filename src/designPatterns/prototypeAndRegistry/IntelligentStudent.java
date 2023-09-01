package designPatterns.prototypeAndRegistry;

import java.util.Objects;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(int id, String name, int psp, String batchName, String moduleName, String track, int joinYear, String instructorName, int completionYear, String paymentPartner, int batchPSP, int iq) {
        super(id, name, psp, batchName, moduleName, track, joinYear, instructorName, completionYear, paymentPartner, batchPSP);
        this.iq = iq;
    }

    public IntelligentStudent clone(){
        //TODO : implement this
        return null;
    }

}
