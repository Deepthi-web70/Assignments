public class SwapTwoNumbers {
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a=" + a + ",b=" +b);
    }
    public static void main(String[] args){
        int x=20;
        int y=30;
        System.out.println("Before: x=" + x + ",y=" +y);
        swap(x,y);
        System.out.println("After: x=" + x + ", y=" +y);
    }

}
