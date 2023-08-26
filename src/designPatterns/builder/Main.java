package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
         Student student = Student.builder()
                 .id(10)
                 .name("Kiran")
                 .age(20)
                 .email("kiran@tesla.com")
                 .batchName("LLD")
                 .psp(100)
                 .gradYear(2017)
                 .phoneNumber("1234567890")
                 .universityName("BOSTON")
                 .build();

        System.out.println(student.toString());

        Student student2 = Student.builder()
                .age(20)
                .gradYear(2017)
                .phoneNumber("1234567890")
                .universityName("BOSTON")
                .build();
    }
}
