package collections.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    static class Pair {
        Object key;

        Object value;

        public Pair(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    static class SPair {
        String key;

        String value;

        public SPair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    static class GPair <K, V> {
        K key;
        V value;

        public GPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        Pair pair1 = new Pair("One", "1");
        Pair pair2 = new Pair(1, true);

        Object key1 = pair1.getKey();
        Object key2 = pair2.getKey();

        if (key1 instanceof String) {
            String key = (String) key1;
        }

        System.out.println(key1);
        System.out.println(key2);

        GPair<String, Integer> gPair = new GPair<>("1", 1);
        Integer value = gPair.getValue();

        /*GPair<? super Number, Integer> giiPair = new GPair<>(1.0, 1);*/
    }

    static <T> void print(T elem, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(elem);
        }
    }

}
