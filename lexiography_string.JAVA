import java.util.*;

public class Main {

    static String getPalindromicString(String s) {

        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        StringBuilder front = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1)
                odd.append((char) (i + 'a'));

            for (int j = 0; j < freq[i] / 2; j++)
                front.append((char) (i + 'a')); 
        }

        if (odd.length() > 1)
            return "No such Palindromic String exists";

        StringBuilder rear = new StringBuilder(front).reverse();
        return front.toString() + odd + rear.toString();
    }

    public static void main(String[] args) {
        String str = "mississippi";
        System.out.println("The lexicographic first palindromic string is: " + getPalindromicString(str));
    }
}
