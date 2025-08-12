import java.util.HashMap;

class Solution2 {
    // Approach 1 ------------------------------------------------
    // public static boolean isAnagram(String s, String t) {
        
    //     if(s.length()!=t.length())
    //         return false;

    //     HashMap<Character,Integer> map = new HashMap<>();

    //     for(char ch : s.toCharArray()){
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }

    //     for(char ch : t.toCharArray()){
    //         if(!map.containsKey(ch) || map.get(ch)==0)
    //             return false;
            
    //         map.put(ch,map.get(ch)-1);
    //     }

    //     return true;
    // }


    // Approach 2 -------------------------------------------------

    public static boolean isAnagram(String s, String t) {
        
        int arr[] = new int[26];
        if(s.length()!=t.length())
            return false;

        for(char ch:s.toCharArray())
            arr[ch-'a']++;
        
        for(char ch:t.toCharArray())
            arr[ch-'a']--;
        
        for(int i: arr){
            if(i!=0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "atr";

        System.out.println(isAnagram(s,t));
    }
}
