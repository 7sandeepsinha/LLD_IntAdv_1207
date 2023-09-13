package designPatternsImplementations.builderPattern;

import designPatterns.builder.*;


public class Student {

    private int id;
    private String name;
    private int age;
    private String email;
    private String phoneNo;
    private String universityName;
    private int gradYear;
    private double psp;
    private String batchName;
    private Address address;

    public Address getAddress() {

        return new Address(this.address.getCity(), this.address.getCountry());
    }

    public Student(int id, String name, int age, String email, String phoneNo, String universityName, int gradYear, double psp, String batchName, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNo = phoneNo;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.psp = psp;
        this.batchName = batchName;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", addressCity=" + address.getCity() +
                ", addressCountry=" + address.getCountry() +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String email;
        private String phoneNo;
        private String universityName;
        private int gradYear;
        private double psp;
        private String batchName;
        private Address address;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;

        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;

        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;

        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;

        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;

        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;

        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;

        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public void validate() {

            if (gradYear >= 2023) {
                throw new InvalidGradYearException();
            }
            if (age < 18) {
                throw new InvalidAgeException();
            }

            if (phoneNo == null) {
                throw new InvalidPhoneNumberException();
            }
        }

        public Student build() {
            validate();
            return new Student(this.id, this.name, this.age, this.email, this.phoneNo, this.universityName, this.gradYear, this.psp, this.batchName, this.address);
        }
    }

}


