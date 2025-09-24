import java.util.HashSet;

public class DuplicateString{

public static void main(String[] args){

String s[]= {"Java","is","Java", "python", "PYthon"};

HashSet<String> hs = new HashSet<>();

for(String input: s)
{
if(!hs.add(input.toLowerCase()))
System.out.println(input+  " is a duplicate string" );

}


}


}