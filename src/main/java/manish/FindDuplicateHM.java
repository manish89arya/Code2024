package manish;

import java.util.HashMap;
import java.util.Map;

class FindDuplicateHM {

    public static void main(String[] args) {

        String[] input = {"GoLang", "Java", "JavaScript", "Python", "C", "Java"};

        Map<String, Integer> map = new HashMap<String, Integer>();
        int count = 1;
        for (String s : input) {
            if (map.get(s) == null)
                map.put(s, count);
            else
                map.put(s, ++count);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Duplicate Key is: " + "Entry key: " + entry.getKey() + ", Entry Value: " + entry.getValue());
        }
    }
}
