package MethodsandRuntimeConcepts;

public class MethodOverloading {
    void add(int a) {
        System.out.println("One parameter: " + a);
    }

        void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

        void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.add(10);
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
