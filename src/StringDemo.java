public class StringDemo {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);

        // StringBuilder (Mutable, Not Thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (Mutable, Thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}
