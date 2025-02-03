public class Bazi {

    public static void reverseString(String str)
    {
        String res = "";
        char ch;
        for (int i=str.length()-1; i>0;i--)
        {
            ch=str.charAt(i);
            res=str.charAt(i)+res;
        }
        System.out.println(res);
    }

}
