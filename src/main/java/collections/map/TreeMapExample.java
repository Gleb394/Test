package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        HashMap<Human, String> hashMap = new HashMap<>();
        hashMap.put(new Human("Sveta", 10000), "");
        hashMap.put(new Human("Galia", 20000), "");
        hashMap.put(new Human("Nastya", 30000), "");

        System.out.println(hashMap);
        TreeMap<Human, String> treeMap = new TreeMap<>(hashMap);

        treeMap.put(new Human("Ivan", 10000), "");
        treeMap.put(new Human("Alexey", 2200), "");
        treeMap.put(new Human("Anna", 6000), "");
        treeMap.put(new Human("Zlatan", 7000), "");
        treeMap.put(new Human("Yoko", 2300), "");


    }

    static class Human implements Comparable<Human>{
        String name;
        int salary;

        public Human(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Human o) {
            return this.name.compareTo(o.name);
        }
    }
}
