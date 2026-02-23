public class Print1ToN {
    static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
        //if the print(n-1); is printed below S O print then the output is 5 4 3 2 1
    }
    public static void main(String[] args){
        print(5);
    }
}
