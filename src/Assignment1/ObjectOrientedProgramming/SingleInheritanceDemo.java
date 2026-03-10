package ObjectOrientedProgramming;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SingleInheritanceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // own method
    }
}
