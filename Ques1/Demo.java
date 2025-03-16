package Ques1;

public class Demo {
    public static void main(String[] args) {
        Person bob = new Teacher("Coach Bob", 27, "M", "PE", 50000);
        System.out.println(bob);
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}