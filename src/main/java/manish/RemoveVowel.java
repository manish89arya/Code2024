package manish;

public class RemoveVowel {


public static void main(String[] args){

String input = "Testing with Java";

StringBuilder sb = new StringBuilder();

for(char ch: input.toCharArray())
{

if(!isVowel(ch)){
sb.append(ch);
}

}


}

private static Boolean isVowel(char ch){
return "aeiouAEIOU".indexOf(ch) !=-1;
}




}