package designPatterns.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String universityName;
    private int gradYear;
    private double psp;
    private String batchName;


    private Student(int id, String name, int age, String email, String phoneNumber,
                   String universityName, int gradYear, double psp, String batchName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.psp = psp;
        this.batchName = batchName;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String email;
        private String phoneNumber;
        private String universityName;
        private int gradYear;
        private double psp;
        private String batchName;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder batchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        private void validate(){
            if(gradYear >= 2023)
                throw new InvalidGradYearException();
            if(age < 18)
                throw new InvalidAgeException();
            if(phoneNumber == null)
                throw new InvalidPhoneNumberException();
        }

        public Student build(){
            validate();
            return new Student(this.id, this.name, this.age, this.email, this.phoneNumber, this.universityName, this.gradYear, this.psp, this.batchName);
        }
    }
}
