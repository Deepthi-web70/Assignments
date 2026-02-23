package multiInheritance;

public class SimpleCalculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalc extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class SuperAdvancedCalc extends AdvancedCalc{
    void square(int x){
        System.out.println(x * x);
    }
}
class MultiLevelDemo {
    public static void main(String[] args) {
        System.out.println("===================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1, 2);

        System.out.println("===================================");
        AdvancedCalc c2 = new AdvancedCalc();
        c2.subtract(7, 3);
        c2.add(3, 6);

        System.out.println("===================================");
        SuperAdvancedCalc c3 = new SuperAdvancedCalc();
        c3.add(2, 8);
        c3.square(2);
        c3.subtract(54, 23);
    }
}