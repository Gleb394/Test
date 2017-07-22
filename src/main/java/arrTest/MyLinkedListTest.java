package arrTest;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evgeniy on 02.07.2017.
 */
public class MyLinkedListTest {

    private List<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new LikedListTest<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
    }

    @Test
    public void iteratorTest() throws Exception {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            System.out.println(next);
        }
    }
    @Test
    public void getTest(){
        int first = list.get(1);
        int third = list.get(3);
        int fourth = list.get(4);
        assertEquals(first, 1);
        assertEquals(third, 3);
        assertEquals(fourth, 4);
    }

    @Test
    public void addByIndexTest(){
        int index = 3;
        int expected = 777;
        list.add(index, expected);
        int result = list.get(index);
//        assertEquals(expected, result);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        assertEquals(list.size(), 6);
    }
}