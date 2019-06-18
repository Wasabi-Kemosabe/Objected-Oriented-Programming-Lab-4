import java.util.Scanner;
public class Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // scanner object

        String n;
        int a;
        String g;

        n = sc.nextLine();
        g = sc.nextLine();
        a = sc.nextInt();

        // System.out.println("Name: " + n);
        // System.out.println("Age: " + a);

        Student random1 = new Student(n, a, g);
        random1.printing();

        // Person student1 = new Person();
        // student1.setAge(30);
        // student1.setName("Samantha");
        // System.out.println("Student Name: " + student1.getName() + "       Age: " + student1.getAge());

        // Person student2 = new Person();
        // student2.setAge(34);
        // student2.setName("Angelo");
        // System.out.println("Student Name: " + student2.getName() + "       Age: " + student2.getAge());

        // Person student3 = new Person("Kleibert", 25);
        // System.out.println("Student Name: " + student3.getName() + "       Age: " + student3.getAge());

        // Student student4 = new Student("John", 18, "A");
        // System.out.println("Student Name: " + student4.getName() + "       Age: " + student4.getAge() + "       Grade: " + student4.getGrade());
        // student4.printing();

        // Student student6 = new Student("Adam", 27, "A");
        // student6.printing();

        // Animal animal1 = new Animal("Panther");
        // animal1.attack(student4.getName());
    }
}