package vsu.cs.sokolov;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = redIntArrayFromConsole();

        for (int j : array) {
            System.out.println(j);
        }
        ArrayElement[] elementsArray = getArrayElementsArray(array);


        System.out.println("First column - initial arr, second - value, third - initial Index, fourth - sorted index");
        int i = 0;
        for (ArrayElement element : elementsArray) {
            System.out.println(array[i++] + "  " + element.getValue() + "  " + element.getInitialIndex() + " " + element.getSortedIndex());
        }

        System.out.println();

        System.out.println("Row of Switches:");
        System.out.println(task(elementsArray));

    }

    static int[] redIntArrayFromConsole() {
        System.out.println("Enter integer array in one string ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        String temp = scanner.nextLine();
        scanner = new Scanner(temp);

        while (scanner.hasNextInt()) {
            array.add(scanner.nextInt());
        }


        int[] resultArray = new int[array.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array.get(i);
        }
        return resultArray;
    }

    static ArrayElement[] getArrayElementsArray(int[] initialArray) {
        ArrayElement[] elementsArray = new ArrayElement[initialArray.length];

        for (int i = 0; i < initialArray.length; i++) {
            elementsArray[i] = new ArrayElement(initialArray[i], i);
        }

        Comparator<ArrayElement> compareViaValue = Comparator.comparingInt(ArrayElement::getValue);
        Arrays.sort(elementsArray, compareViaValue);

        for (int i = 0; i < initialArray.length; i++) {
            elementsArray[i].setSortedIndex(i);
        }

        Comparator<ArrayElement> compareViaInitialIndex = Comparator.comparingInt(ArrayElement::getInitialIndex);
        Arrays.sort(elementsArray, compareViaInitialIndex);
        return elementsArray;
    }

    static ArrayList<SwitchIndexes> task(ArrayElement[] arrayElements) {
        ArrayList<SwitchIndexes> switches = new ArrayList<>();

        for (int i = 0; i < arrayElements.length; ) {
            int sortedIndex = arrayElements[i].getSortedIndex();
            if (sortedIndex != i) {
                switchElementsInArr(arrayElements, sortedIndex, i);
                switches.add(new SwitchIndexes(sortedIndex, i));
            } else {
                i++;
            }
        }
        return switches;
    }

    static void switchElementsInArr(ArrayElement[] array, int initialIndex, int finalIndex) {
        ArrayElement temp = new ArrayElement(array[initialIndex]);
        array[initialIndex] = array[finalIndex];
        array[finalIndex] = temp;
    }
    static int[] getRandomIntArray(int lengthOfArray) {
        int[] resultArray = new int[lengthOfArray];

        Random random = new Random();
        for (int i = 0; i < lengthOfArray; i++) {
            resultArray[i] = random.nextInt(10);
        }

        return resultArray;
    }
}

