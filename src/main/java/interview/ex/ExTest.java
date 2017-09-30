package interview.ex;

import java.util.ArrayList;

public class ExTest {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(Integer.valueOf(1));
    }

    static void f() throws NullPointerException {
        class A {

        }
    }

    interface A {

    }
}
