package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args)  {
        HashSet<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("!!");
        set.remove("!!");

        System.out.println(set.size());

        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        if(set.contains("hello")) {
            System.out.println("set has hello");
        }

        set.clear(); // 초기화
    }
}
