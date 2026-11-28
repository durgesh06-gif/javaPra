package Strings;

public class pra6 {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = true;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
          
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break; 
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
        
        String reversed = "";
        for (int k = s.length() - 1; k >= 0; k--) {
            reversed = reversed + s.charAt(k);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
