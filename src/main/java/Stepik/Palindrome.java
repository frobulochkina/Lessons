package Stepik;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        if (text.length() == 0) {
            return true;
        } else {
            String text1 = text.replaceAll("[^a-zA-Z0-9]+", "");
            String text2 = new StringBuilder(text1).reverse().toString();
            boolean rsl = text1.equalsIgnoreCase(text2);
            return rsl;
        }
    }

    public static void main(String[] args) {
        boolean rsl = Palindrome.isPalindrome("An5na");
        System.out.println(rsl);
    }
}
