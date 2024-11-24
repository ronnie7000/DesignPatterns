package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Student s1 = Student.builder()
        .Id(1)
        .Age(25)
        .Name("Akansh")
        .BatchName("B1")
        .GradYear(2021)
        .PhoneNumber("123")
        .build();

        System.out.println(s1.getName());
    }
}