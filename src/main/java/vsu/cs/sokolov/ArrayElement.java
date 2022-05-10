package vsu.cs.sokolov;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayElement {
    private final int value;
    private final int initialIndex;
    private  int sortedIndex;

    public ArrayElement(int value, int initialIndex) {
        this.value = value;
        this.initialIndex = initialIndex;
    }

    public static void sortElements(ArrayElement[] elements, Comparator<ArrayElement> comparator) {
        Arrays.sort(elements, comparator);
    }

    public int getValue() {
        return value;
    }

    public int getInitialIndex() {
        return initialIndex;
    }

    public void setSortedIndex(int sortedIndex) {
        this.sortedIndex = sortedIndex;
    }

    public int getSortedIndex() {
        return sortedIndex;
    }
}
