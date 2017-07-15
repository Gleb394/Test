package collections.map;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethodsExample {

    private TreeMap<Integer, String> map;

    @Before
    public void setUp() {
        map = new TreeMap<>();
        map.put(2000, "");
        map.put(1000, "");
        map.put(3000, "");
        map.put(6000, "");
        map.put(10000, "");
        map.put(7000, "");
    }

    @Test
    public void higherEntry() {
        Map.Entry<Integer, String> higherEntry = map.higherEntry(6000);
        System.out.println(higherEntry);

        Map.Entry<Integer, String> lowerEntry = map.lowerEntry(6000);
        System.out.println(lowerEntry);
    }

    @Test
    public void ceilingEntry() {
        Map.Entry<Integer, String> ceilingEntry = map.ceilingEntry(4000);
        System.out.println(ceilingEntry);

        Map.Entry<Integer, String> floorEntry = map.floorEntry(4000);
        System.out.println(floorEntry);
    }

    @Test
    public void keys() {
        Integer lastKey = map.lastKey();
        Integer firstKey = map.firstKey();

        System.out.println(firstKey);
        System.out.println(lastKey);
    }

    @Test
    public void polls() {
        System.out.println(map);

        Map.Entry<Integer, String> entry = map.pollFirstEntry();

        System.out.println(map);
    }

    @Test
    public void subMaps() {
        SortedMap<Integer, String>
                sortedMap = map.subMap(1000, true, 6000, true);
        System.out.println(sortedMap);

        Map<Integer, String> sortedMap1 = map.tailMap(6000);

        Map<Integer, String> sortedMap2 = map.headMap(5000);
    }

}
