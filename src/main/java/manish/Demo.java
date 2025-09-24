import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Demo{



public static Boolean isValidExpression(String input){
String[] tokens = input.split(" ");


if(tokens.length<3)
return false;

List<String> operators = Arrays.asList("plus","minus","multiply","division","subtract");

for(int i=0; i<tokens.length; i++)
{
 if(i%2==0)
{
try{
Integer.parseInt(tokens[i]);
}catch(NumberFormatException e)
{
return false;
}
}
else{

if(operators.contains(tokens[i].toLowerCase()))
return true;
else
return false;

}
}
return false;
}

public static void main(String[] args){


String input = "2 minus 1 plus ";
if(isValidExpression(input))
{
System.out.println("true");
}
else {
System.out.println("false");
}

}



}