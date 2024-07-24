import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(currentChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        String s1 = "abcdeabaa";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        
        System.out.println("Length of longest substring without repeating characters in \"" + s1 + "\": " + lengthOfLongestSubstring(s1));
        System.out.println("Length of longest substring without repeating characters in \"" + s2 + "\": " + lengthOfLongestSubstring(s2));
        System.out.println("Length of longest substring without repeating characters in \"" + s3 + "\": " + lengthOfLongestSubstring(s3));
    }
}
