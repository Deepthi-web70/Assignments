public class StaticMethods {
    static int x = 200;
    static void display(){
        System.out.println("SNPSU_CS_IS");
    }
}
class StaticDemo{
    public static void main(String[] args){
        StaticMethods.display();
        System.out.println(StaticMethods.x);
    }
}
