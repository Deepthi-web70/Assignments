package Assignment2;

public class AgeCheck {
    static void AgeCheck(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        AgeCheck(16);
    }
}