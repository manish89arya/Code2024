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

}
