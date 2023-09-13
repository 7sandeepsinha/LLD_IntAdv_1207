package designPatternsImplementations.builderPattern;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Gurgaon");
        address.setCountry("India");

        Student student = Student.builder()
                .age(18)
                .batchName("Scaler 2023")
                .email("abc@123.com")
                .gradYear(2010)
                .id(1234)
                .name("Dipanshu Munjal")
                .phoneNo("1234567890")
                .psp(35.23)
                .universityName("VIT Chennai")
                .address(address)
                .build();

        address = student.getAddress();
        address.setCity("Panipat");

        System.out.println(student.toString());
    }
}


// Steps to achieve Builder Pattern

/*
* create a Builder class inside Student class - because Builder class is only for student - make it static and public
* create a builder() in Student class which returns a new builder object - this object will be used to call the setters of Builder class
* builder() will be static because we'll call it by giving Student class reference - Eg : Student.builder()
* create setters in Builder class. Note - these setters should return Builder object. This will be helpful for chaining
* create a void method called validate() which will have all the validations and throw exceptions when needed
* create a method called build() which will first call validate and then return a new Student object using its constructor
* YOUR BUILDER PATTERN is ready and now, you can create a Student object from client class
* Eg : Student.builder().setName().......setId().build();
*
*
*
* NOTE - for mutable objects inside Student class, you should always return a deep copy in its getter to maintain immutability
*
* NOTE - for builder setters - we don't put set, coz it doesn't have any getters. Enhances readability
* */