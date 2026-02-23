package copyObjects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+ name);
    }

    static Employee copy(Employee e){
        return new Employee(e.id, e.name);

    }
    public static void main(String[] args){
        Employee e1 = new Employee(103,"Janani");
        Employee e2 = Employee.copy(e1);
        e2.display();


    }
}
