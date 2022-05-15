package vsu.cs.sokolov;

public class SwitchIndexes {
    public final int index1;
    public final int index2;

    public SwitchIndexes(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    @Override
    public String toString() {
        return "Switch elements " + index1 + "  and   " + index2 + "\n";
    }
}
