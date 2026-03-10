package Assignment2;

class Student {
    int roll;
    String name;
    static String college = "ABC College";

    static void changeCollege() {
        college = "XYZ College";
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Priya");

        s1.display();
        s2.display();
    }
}
