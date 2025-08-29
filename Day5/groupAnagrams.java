package Day5;

import java.util.*;

//Approach 1 : With Sorting
// public class groupAnagrams {
//     public static List<List<String>> groupAnagram(String[] strs) {
        
//         Map<String,List<String>> map = new HashMap<>();

//         for(String str : strs){
//             char[] ch = str.toCharArray();
//             Arrays.sort(ch);
//             String s = new String(ch);

//             if(!map.containsKey(s))
//                 map.put(s,new ArrayList<>());

//             map.get(s).add(str);
            
//         }
//         return new ArrayList<>(map.values());
//     }

//     public static void main(String[] args) {
//         String []strs = {"eat","tea","tan","ate","nat","bat"};
//         System.out.println(groupAnagram(strs));
//     }

    
// }

//Approach 2: Without Sorting
public class groupAnagrams{
    public static List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            String newS = generate(s);

            if(!map.containsKey(newS))
                map.put(newS,new ArrayList<>());
            map.get(newS).add(s);
        }

        return new ArrayList<>(map.values());
    }


    public static String generate(String strs){
        int count[] = new int[26];
        StringBuilder newS = new StringBuilder();

        for(char ch:strs.toCharArray()){
            count[ch-'a']++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                newS.append(String.valueOf((char)(i+'a')).repeat(count[i]));
            }
        }

        return newS.toString();

    }
    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}
