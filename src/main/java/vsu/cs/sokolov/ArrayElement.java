package vsu.cs.sokolov;

public class ArrayElement {
    private final int value;
    private final int initialIndex;
    private  int sortedIndex;

    public ArrayElement(int value, int initialIndex) {
        this.value = value;
        this.initialIndex = initialIndex;
    }

    public  ArrayElement(ArrayElement element) {
        this.value = element.value;
        this.sortedIndex = element.sortedIndex;
        this.initialIndex = element.initialIndex;
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
