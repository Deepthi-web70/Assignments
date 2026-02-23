public class Student {
    int USN;
    String name;
    int marks;
    Student(String name, int USN, int marks){
        this.name = name;
        this.USN = USN;
        this.marks = marks;
    }
    void evaluateMarks(){
        if(marks >= 40){
            System.out.println(name + " has PASSED");
        }else{
            System.out.println(name + " has FAILED");
        }
    }
    public static void main(String[] args){
        Student s1 = new Student("Deepthi",24,90);
        Student s2 = new Student("Diya",25,30);
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
