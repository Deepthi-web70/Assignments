final class FinalClass {
    final int x = 10;  // final variable

    final void display() {  // final method
        System.out.println("Final Method");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Value: " + obj.x);
        obj.display();
    }
}
