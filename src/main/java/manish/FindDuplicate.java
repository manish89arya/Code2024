package manish;

import java.util.HashSet;
import java.util.Set;

class FindDuplicate {

    public static void main(String[] args) {

        String[] a = {"Java", "JavaScript", "C", "Python", "Java", "Python"};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i].equalsIgnoreCase(a[j]))
                    System.out.println("Duplicate Element is:: " + a[i]);
            }
        }

        Set<String> s = new HashSet<String>();

        for (String name : a) {
            if (!s.add(name)) {
                System.out.println("duplicate in set is: " + name);
            }
        }
    }
}