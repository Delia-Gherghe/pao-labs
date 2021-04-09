package ro.unibuc.lab8.set;

import ro.unibuc.lab8.model.Element;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * HashSet: extends AbstractSet class which implements Set interface. The Set
 * interface inherits Collection and Iterable interfaces in hierarchical order.
 * Features :
 * - Duplicate values are not allowed.
 * - One NULL element is allowed in HashSet.
 * - It is an unordered collection and makes no guarantees as to the
 * iteration order of the set.
 * Constructors :
 * - HashSet()
 * - HashSet(int capacity)
 * - HashSet(Collection c)
 */
public class HashSetExample {
    private static final HashSetExample instance = new HashSetExample();

    private final HashSet<Element> hashSet = new HashSet<>();

    private HashSetExample() {
    }

    public static HashSetExample getInstance() {
        return instance;
    }

    public boolean add(Element element) {
        return hashSet.add(element);
    }

    public boolean addAll(List<Element> elementList) {
        boolean result = true;
        for (Element el : elementList){
            result = result && hashSet.add(el);
        }
        return result;

    }

    public void remove(Element element) {
        hashSet.remove(element);
    }

    /**
     * uses the equals method from Element
     */
    public boolean contains(Element element) {
        return hashSet.contains(element);
    }

    /**
     * This implementation iterates over this collection, checking each
     * element returned by the iterator in turn to see if it's contained
     * in the specified collection.  If it's not so contained, it's removed
     * from this collection with the iterator's {@code remove} method.
     */
    public void retainAll(List<Element> list) {
        hashSet.retainAll(list);
    }

    public boolean isEmpty() {
        return hashSet.isEmpty();
    }

    public void displayElementsUsingIterator() {
        Iterator<Element> iterator = this.hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void displayElementsUsingForEach() {
        for (Element el : hashSet) {
            System.out.println(el);
        }
    }

    public Element[] convertHashSetToArray() {
        Element[] myArray = new Element[hashSet.size()];
        return hashSet.toArray(myArray);
    }
}

