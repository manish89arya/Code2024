import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        else {

            HashMap<Character, Integer> sMap = new HashMap<>();
            HashMap<Character, Integer> tMap = new HashMap<>();

            for(int i = 0; i< s.length(); i++)
            {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                sMap.put(sChar, sMap.getOrDefault(sChar, 0)+1);
                tMap.put(tChar, tMap.getOrDefault(tChar,0)+1);

            }
            for(Map.Entry<Character,Integer> entry: sMap.entrySet()){
                System.out.println(entry.getKey()+", "+entry.getValue());
            }

            return sMap.equals(tMap);

        }

    }
    public static void main(String[] args){

        Solution s = new Solution();
        s.isAnagram("anagram","nagaram");

    }
}


//class Solution {
//    public boolean isAnagram(String s, String t) {
//
//        if(s.length()!=t.length())
//        {
//            System.out.println("s length: "+s+ " is not equals to t length"+t);
//            return false;
//        }
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(int i = 0; i<s.length(); i++)
//        {
//            int count1=0;
//            if(map.containsKey(s.charAt(i)))
//                ++count1;
//            else
//                map.put(s.charAt(i), ++count1);
//        }
//        HashMap<Character,Integer> map1 = new HashMap<>();
//
//        for(int j = 0; j<t.length(); j++)
//        {
//            int count2=0;
//            if(map1.containsKey(t.charAt(j)))
//                ++count2;
//            else
//                map1.put(t.charAt(j), ++count2);
//        }
//
//        for(Map.Entry<Character, Integer>  entry: map.entrySet())
//        {
//            System.out.println(entry.getKey()+", "+entry.getValue());
//        }
//
//        if(map.equals(map1))
//            return true;
//
//        return false;
//    }
//    public static void main(String[] args){
//
//        Solution s = new Solution();
//        s.isAnagram("anagram","nagaram");
//
//    }
//}