package revision;

import java.util.HashMap;
import java.util.Map;

public class PalindromeEligibilty {
    public static boolean checkPalindromePossibility(String input){

        if(input.length()<3)
            System.out.println("Length if string is less than 3. Either there is only one char or 2 chars which is not a palindrome");

        Map<Character,Integer> charMap = new HashMap<>();

        // count frequency of each character
        for(char ch: input.toCharArray())
        {
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }

        int oddCount = 0;

        for(int count: charMap.values())
        {
            if(count % 2 !=0)
                oddCount++;
        }
        System.out.println(oddCount);
        return oddCount <=1;

    }

    public static void main(String[] args) {
        String input = "aabbdd";
        // Need to check if this input string can be a palindrome or not

       if(checkPalindromePossibility(input))
       {
        System.out.println("Input can be a palindrome");
       }
       else
       {
        System.out.println("Input String can't be a palindrome");
       }
    }


}
