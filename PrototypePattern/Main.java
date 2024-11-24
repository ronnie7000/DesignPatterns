package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Student originalStudent1 = getStudent(1);
        Student originalStudent2 = getStudent(2);

        Student copy1 = originalStudent1.clone();
        Student copy2 = originalStudent2.clone();

        System.out.println(copy1.toString());
        System.out.println(copy2.toString());
    }


    public static Student getStudent(int val) {
        if(val % 2 == 1) {
            GeniusStudent student = new GeniusStudent();
            student.setId(1);
            student.setName("Akansh");
            student.setPsp(100.00);
            student.setIq(150);

            return student;
        } else {
            Student student = new Student();
            student.setId(2);
            student.setName("Nonu");
            student.setPsp(99.00);

            return student;
        }
    }
}