import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringPrograms {
    public static void reverseString(String str) {

    int length = str.length(); // 8
        System.out.println("Length of String is: "+length);
        System.out.println("First char of String is: "+str.charAt(length-1));
    String rev = "";
    for(int i=length-1; i>=0; i--)
    {
        rev = rev+str.charAt(i);
    }
        System.out.println(rev);
    }

    public static void frequentlyRepeatingChar(String str) {
        /*
        String str = "leetcode";
        First non-repeating character: 'l'
        Most frequent character: 'e' with count: 3

        String str = "aabbcc";
        First non-repeating character: -1
        Most frequent character: 'a' with count: 2

         */

    }

    public static void nonRepeatingChar(String str) {

    }

    public static void charArrayDemo() {
        //Using a Character Array (char[])
//        char[] c = new char[3];
//        char c[] = new char[3];
        char[] c = {'a', 'b', 'c'};
        int chararraysize = c.length - 1;
        System.out.println("Length of a character Array: " + chararraysize);
        System.out.println(c[0]);
        char[] reverseCharArray = new char[chararraysize];

        for (int i = chararraysize - 1; i > 0; i--) {
            reverseCharArray[i - (chararraysize - 1)] = c[i];
        }

        for(char value : reverseCharArray) {
            System.out.print(value);
        }

    }

    public static void reverseUsingStringBuffer(String str) {
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());
    }

    public static void reverseCharArray()
    {
       char[] ch1 = {'h','e','l','l','o'};
       StringBuilder reverseCharArray= new StringBuilder();

       for(int i=ch1.length-1; i>=0; i--)
       {
           reverseCharArray.append(ch1[i]);

       }
        System.out.println(reverseCharArray);

    }

    public static void reverseCharArrayWithNoExtraMemory(char[] c) {
        //Write a function that reverses a string.
    // The input string is given as an array of characters s.
        //You must do this by modifying
    // the input array in-place with O(1) extra memory.
    int start=0;
    int end = c.length-1;

    while(start < end)
    {
        char tmp = c[start];
        c[start]=c[end];
        c[end]= tmp;
        start++;
        end--;
    }
        System.out.println(c);

    }

    public static void removeJunkCharsFromAString(String s)
    {
     String s1=   s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }

    public static void reverseInteger(int n)
    {

        int r = 0;
        while(n!=0 && n<Integer.MAX_VALUE)
        {
            r= r*10+n%10;
            n=n/10;
        }
        System.out.println(r);



    }

}


