package manish;

public class PrintAscii{

public static void main(String[] args){

String input = "Java";


for(int i=0; i<=input.length()-1; i++)
{
 char ch = input.charAt(i);
 System.out.println("ASCII Value of "+ch + "is: "+(int) ch);

}

String s = "Java Program Java Java";

System.out.println(s.indexOf("J"));
System.out.println(s.indexOf("J", s.indexOf("J")+1));
System.out.println(s.indexOf("J",(s.indexOf("J", s.indexOf("J")+1))+1));

System.out.println(s.indexOf("Programs"));
System.out.println(s.indexOf("Program"));

String b = " A-B-C-D   ";
System.out.println(b.replace("-","").trim());
String[] c= b.split("-");
for(int j=0;j<c.length;j++)
{
System.out.println(c[j]);
}


}

}