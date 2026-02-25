package MethodsandRuntimeConcepts;

public class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
        System.out.println("Default Constructor Called");
    }

    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(101, "Deepthi");
        s2.display();
    }
}
