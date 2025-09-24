package manish;

public class SwapTwoStrings
{

public static void main(String[] args)
{

String a = "Hello";
String b = "World";

System.out.println("Before Swap: a is ->"+a + ", b is -> "+b);

a = a+b; //HelloWorld
b= a.substring(0, a.length()-b.length()); //10 - 5 --> 5  this will store hello in b var
a=a.substring(b.length());// 

System.out.println("Before Swap: a is ->"+a + ", b is -> "+b);

String x = "Manish";
String y = "Arya";

x = x+y; // HelloWorld
y=x.replace(y,""); // Manish
x=x.replace(y,""); // Arya

System.out.println("x: "+x);
System.out.println("y: "+y);


}



}