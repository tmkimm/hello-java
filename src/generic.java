import java.util.ArrayList;
import java.util.HashMap;

public class generic {
    public static void main(String[] args)  {
        // 1. 제네릭은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        // 2. 사용자 정의 클래스도 올 수 있다.
        ArrayList<Student> studentList = new ArrayList<Student>();

        // 3. 제네릭 클래스 사용
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();
        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());  // 제네릭 메소드 Integer

        // 4. 제네릭 클래스가 왜 필요한가?
        // 바로 static method로 선언할때 필요하기 때문
        // static method는 객체가 생성되기 전에 메모리에 올라가는데 타입을 어떻게 얻을까? 이런 경우를 위해 타입을 주입받는 제네릭 메소드가 필요하다.
        System.out.println("제네릭 메소드 <T> returnType : " + ClassName.genericMethod("Hi").getClass().getName());

        // 5. 특정 범위만 허용하고 나머지 타입만 제한할 수 없나?
        // 가능하다.
        // class ClassName<E extends A> {    A의 자식(구현체)만 가능
        // class ClassName<E super B> {    B의 부모만 가능

        // 6. 정렬 관련 클래스에서 아래처럼 <E extends Comparable<? super E>> 를 이용하는데 <? super E>는 왜 붙는걸까?
        // public class SaltClass <E extends Comparable<? super E>> { ... }	// 안전성이 높음
        //
    }
}

// 제네릭 클래스
class ClassName<E> {
    private E element;	// 제네릭 타입 변수
    void set(E element) {	// 제네릭 파라미터 메소드
        this.element = element;
    }
    E get() {	// 제네릭 타입 반환 메소드
        return element;
    }
    static <T> T genericMethod(T o) {	// 제네릭 메소드
        return o;
    }
}

class Student {
    int age;

    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}