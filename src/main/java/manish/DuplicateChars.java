import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class DuplicateChars {


public static void main(String[] args){

String input = "manish";
findDuplicateChars(input);

}


public static void findDuplicateChars(String input){

Map<Character, Integer> map = new HashMap<>();

if(input==null){
System.out.println("string is null");
return;
}

if(input.isEmpty()){
System.out.println("string is empty");
return;
}

if(input.length()==1){
System.out.println("string is of one character. hence no duplicates");
return;
} else {
for(char c: input.toCharArray())
{
if(map.containsKey(c)){
 map.put(c, map.get(c)+1);
}
else{
map.put(c, 1);
}
}
}

Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();

for(Map.Entry<Character,Integer> entry: entrySet)
{
if(entry.getValue()>1)
System.out.println(entry.getKey()+ " " + entry.getValue());
else 
System.out.println("no duplicates found");
}



}


}