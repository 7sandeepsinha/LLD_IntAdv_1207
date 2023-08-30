package designPatterns.prototypeAndRegistry;

import java.util.Objects;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int psp;
    private String batchName;
    private String moduleName;
    private String track;
    private int joinYear;
    private String instructorName;
    private int completionYear;
    private String paymentPartner;
    private int batchPSP;

    public Student(int id, String name, int psp, String batchName, String moduleName, String track, int joinYear, String instructorName, int completionYear, String paymentPartner, int batchPSP) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.track = track;
        this.joinYear = joinYear;
        this.instructorName = instructorName;
        this.completionYear = completionYear;
        this.paymentPartner = paymentPartner;
        this.batchPSP = batchPSP;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(int completionYear) {
        this.completionYear = completionYear;
    }

    public int getBatchPSP() {
        return batchPSP;
    }

    public void setBatchPSP(int batchPSP) {
        this.batchPSP = batchPSP;
    }

    @Override
    public Student clone() {
        Student s = new Student();
        s.setId(this.id);
        s.setName(this.name);
        s.setPsp(this.psp);
        s.setBatchName(this.batchName);
        s.setModuleName(this.moduleName);
        s.setTrack(this.track);
        s.setJoinYear(this.joinYear);
        s.setInstructorName(this.instructorName);
        s.setCompletionYear(this.completionYear);
        s.paymentPartner = this.paymentPartner;
        s.setBatchPSP(this.batchPSP);
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", track='" + track + '\'' +
                ", joinYear=" + joinYear +
                ", instructorName='" + instructorName + '\'' +
                ", completionYear=" + completionYear +
                ", paymentPartner='" + paymentPartner + '\'' +
                ", batchPSP=" + batchPSP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && psp == student.psp && joinYear == student.joinYear && completionYear == student.completionYear && batchPSP == student.batchPSP && Objects.equals(name, student.name) && Objects.equals(batchName, student.batchName) && Objects.equals(moduleName, student.moduleName) && Objects.equals(track, student.track) && Objects.equals(instructorName, student.instructorName) && Objects.equals(paymentPartner, student.paymentPartner);
    }
}
