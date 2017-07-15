package collections.iterable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }

        System.out.println(list);

        HashMap<Object, Object> map = new HashMap<>();

        Set<Object> objects = map.keySet();
        Iterator<Object> iterator1 = objects.iterator();
        while (iterator.hasNext()) {
            Object next = iterator1.next();
            Object value = map.get(next);
        }


        for (Map.Entry<Object, Object> objectObjectEntry : map.entrySet()) {
            System.out.println(objectObjectEntry.getKey());
            System.out.println(objectObjectEntry.getValue());
        }
    }
}
