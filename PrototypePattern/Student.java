package PrototypePattern;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private double psp;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getPsp() {
        return this.psp;
    }

    @Override
    public String toString() {
        return("Id : " + this.id + " Name : " + this.name + " Psp : " + this.psp); 
    }

    @Override
    public Student clone() {
        Student copy = new Student();
        copy.id = this.id;
        copy.name = this.name;
        copy.psp = this.psp;
        
        return copy;
    }
}
