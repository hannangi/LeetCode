import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int longestSubStringMethod(String s){
      int left = 0;
      int right = 0;
      int maxLength = 0;
      HashSet<Character> set = new HashSet<>();
      while (right < s.length()){ 
        if (!set.contains(s.charAt(right))){
          set.add(s.charAt(right));
          right++;
          maxLength = Math.max(maxLength, set.size());
        } else {
          set.remove(s.charAt(left));
          left++;
            
        }
          
    }          
    return maxLength;
}
    public static void main(String[] args) {
        LongestSubString l = new LongestSubString();
        System.out.println(l.longestSubStringMethod("abcabcbb"));
    }
}
