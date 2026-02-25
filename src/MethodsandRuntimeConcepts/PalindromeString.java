package MethodsandRuntimeConcepts;

public class PalindromeString {
    static boolean isPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        String word = "sir";

        if (isPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is Not a Palindrome");
    }
}
