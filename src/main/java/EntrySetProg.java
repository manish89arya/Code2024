import java.util.HashMap;
import java.util.Map;
public class EntrySetProg {

    public static void main(String[] args)
    {
        Map<String,String> m = new HashMap<>();
        m.put("Manish","Arya");
        m.put("Manish1","Arya1");
        m.put("Manish2","Arya2");
        m.put("Manish3","Arya3");

        System.out.println(m);

        for(Map.Entry<String,String> entry: m.entrySet() )
                {
                    System.out.println("Key is: "+entry.getKey()+" Val is: "+ entry.getValue());
                }
    }

}
