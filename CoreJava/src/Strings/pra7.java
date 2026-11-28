package Strings;

public class pra7 {
    public static void main(String[] args) {
        String s = "i not a corder";
        String[] words = s.split(" "); 
        String result = "";

      
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

           
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }

           
            result = result + reversedWord + " ";
        }

       
        System.out.println(result.trim());
    }
}
