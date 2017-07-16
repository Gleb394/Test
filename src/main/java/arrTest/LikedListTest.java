package arrTest;

import java.util.*;

/**
 * Created by Gleb on 24.06.17.
 */
public class LikedListTest<T> implements List<T> {
    private int size = 0;

    private Node<T> first;
    private Node<T> last;

    public LikedListTest() {
        first = new Node<>(null, null, null);
        last = new Node<>(null, null, null);

        first.next = last;
        last.prev = first;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T elem) {

        Node<T> newNode;

        if (size == 0) {
            newNode = new Node<>(first.next, elem, last.prev);
            first.next = newNode;
            last.prev = newNode;
        } else {
            newNode = new Node<>(last.prev, elem, last);
            last.prev = newNode;
            newNode.prev.next = newNode;
        }
        size++;
        return true;
    }

    public class MyIterator<T> implements Iterator<T> {

        int cour = 0;

        @Override
        public boolean hasNext() {
            if (cour == size) return false;
            return true;
        }

        @Override
        public T next() {
            Node<T> courrs;


            return null;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        Iterator<T> iterator = iterator();
        T item = null;
        for (int i = 0; i < index; i++) {
            item = iterator.next();
        }
        return item;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public static class Node<T> {

        T item;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> prev, T element, Node<T> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }

    }

}