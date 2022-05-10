package vsu.cs.sokolov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arrayLength;
        System.out.print("Enter array length: ");
        arrayLength = in.nextInt();
        System.out.println();

        int[] array = getRandomIntArray(arrayLength);
        ArrayElement[] elementsArray = new ArrayElement[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            elementsArray[i] = new ArrayElement(array[i], i);
        }

        Comparator<ArrayElement> compareViaValue = Comparator.comparingInt(ArrayElement::getValue);
        Arrays.sort(elementsArray, compareViaValue);

        for (int i = 0; i < arrayLength; i++) {
            elementsArray[i].setSortedIndex(i);
        }

        Comparator<ArrayElement> compareViaInitialIndex = Comparator.comparingInt(ArrayElement::getInitialIndex);
        Arrays.sort(elementsArray, compareViaInitialIndex);


        System.out.println("First column - initial arr, second - value, third - initial Index, fourth - sorted index");
        int i = 0;
        for (ArrayElement element : elementsArray) {
            System.out.println(array[i++] + "  " + element.getValue() + "  " + element.getInitialIndex() + " " + element.getSortedIndex());
        }

        System.out.println();

        System.out.println("Row of Switches:");
        System.out.println(task(elementsArray));

    }

    static String task(ArrayElement[] arrayElements) {
        StringBuilder switches = new StringBuilder();

        for (int i = 0; i < arrayElements.length; ) {
            int sortedIndex = arrayElements[i].getSortedIndex();
            if (sortedIndex != i) {
                switchElementsInArr(arrayElements, sortedIndex, i);
                switches.append("switch elem ").append(i).append(" with elem ").append(sortedIndex).append("\n");
            } else {
                i++;
            }
        }
        return switches.toString();
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

