package ObjectOrientedProgramming;

public class Demo {
    void show(int a) {
        System.out.println("Method with 1 param");
    }

    void show(int a, int b) {
        System.out.println("Method with 2 params");
    }
}

class Test extends Demo {

    void show(int a) {
        System.out.println("Overridden Method");
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.show(10);
        t.show(10,20);
    }
}
