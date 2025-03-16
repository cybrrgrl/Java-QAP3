package Ques1;

public abstract class Person {
    //protected - sensitive info in a real situation
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    @Override
    public String toString() { return name + ", age: " + age + ", gender: " + gender; }
}
