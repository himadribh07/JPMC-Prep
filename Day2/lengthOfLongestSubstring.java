import java.util.HashSet;

class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count=0,left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}