package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class hashMap {
    public static void main(String[] args)  {
        HashMap<String, String> map = new HashMap();
        map.put("A", "hi");
        map.put("B", "bb");
        map.put("C", "ccc");
        map.remove("C");
        map.put("A", "aa"); // key가 중복되었을 경우 update

        System.out.println(map.keySet());   // [A, B]
        for(String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
