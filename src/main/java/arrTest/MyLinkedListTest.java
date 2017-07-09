package arrTest;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evgeniy on 02.07.2017.
 */
public class MyLinkedListTest {

    private List<String> list;

    @Before
    public void setUp() throws Exception {
        list = new MyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add("A");
        }
    }

    @Test
    public void contains() throws Exception {
        String elem = list.get(3);
        assertEquals(elem, "A");
    }

}