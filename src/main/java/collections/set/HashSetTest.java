package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        System.out.println(strings.contains("A"));

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> stringList = Arrays.asList("A", "B", "B", "C", "C", "C");

        HashSet<String> uniqueStrings = new HashSet<>(stringList);

        System.out.println(uniqueStrings);
    }
}
