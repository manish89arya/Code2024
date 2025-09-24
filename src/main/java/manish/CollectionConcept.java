package manish;

import java.util.Collections;
import java.util.ArrayList;
class CollectionConcept{

public static void main(String[] args){

ArrayList<Integer> a1 = new ArrayList<Integer>();
a1.add(2);
a1.add(8);
a1.add(7);
a1.add(10);
a1.add(5);
Collections.sort(a1);
System.out.println(a1);

}

}