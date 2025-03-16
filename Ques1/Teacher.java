package Ques1;


public class Teacher extends Person {
    // a teacher is a person in the database
    private String subject;
    private double salary;
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }
    public String getSubject() { return subject; }
    public double getSalary() { return salary; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setSalary(double salary) { this.salary = salary; }
}