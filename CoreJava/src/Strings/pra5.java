package Strings;

public class pra5 {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
