public class Pyramid {
    public static void main(String[] args){
        int mid = 9/2+1;
        for(int r = 1; r <= 5; r++){
            for(int c = 1; c <= 9; c++){
                if(c >= mid-r + 1 && c <= mid + r-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

