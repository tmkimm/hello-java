package collection;

import java.sql.Array;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args)  {
        // 기본 Array
        int [] numArr = new int[3];
        numArr[0] = 7;
        numArr[1] = 8;
        numArr[2] = 9;

        for(int v: numArr) {
            System.out.println(v);
        }
        String[] strArr = {"H", "I"};

        for(String v : strArr) {
            System.out.println(v);
        }
        // Array List는 크기가 동적으로 변함
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("world"); // 추가
        arrList.add("aaa");
        arrList.add("bbb");
        arrList.add("ccc");
        arrList.set(0, "hello");    // 변경
        arrList.remove(2);  // index로 삭제
        arrList.remove("aaa");  // 값으로 삭제
        System.out.println(arrList);    // [hello, ccc]
        System.out.println(arrList.size());    // 2
        if(arrList.contains("hello")) { // 값이 있는지 확인
            System.out.println("arrList has hello");
        }




    }
}
