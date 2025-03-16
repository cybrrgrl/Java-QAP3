package Ques1;


public class Student extends Person {
      //protected - sensitive info in a real situation
    protected String idNum;
    protected double gpa;
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }
    public String getIdNum() { return idNum; }
    public double getGPA() { return gpa; }
    public void setIdNum(String idNum) { this.idNum = idNum; }
    public void setGPA(double gpa) { this.gpa = gpa; }
}