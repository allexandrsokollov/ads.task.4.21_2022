package vsu.cs.sokolov;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = getRandomIntArray(20);

        for (int value : arr) {
            System.out.println(value);
        }
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

