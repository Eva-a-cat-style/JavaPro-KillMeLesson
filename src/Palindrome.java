public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reverse = Reverse.stringReverse(str);
        return reverse.equals(str);
    }
}

