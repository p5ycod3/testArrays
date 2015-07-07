package ua.mywork.arrays;


import java.util.Arrays;

public class ArraysUnion {

    public static int[] merge(int[] leftArray, int[] rightArray) {
        if (leftArray == null || rightArray == null) {
           //yException e = new MyException()
            throw new MyException();
        }

        int[] arr = {};

        for (int value : leftArray) {
            if (Arrays.binarySearch(arr, value) < 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = value;
                Arrays.sort(arr);
            }
        }

        for (int value : rightArray) {
            if (Arrays.binarySearch(arr, value) < 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = value;
                Arrays.sort(arr);
            }

        }
        return arr;


    }

    public static int[] union(int[] leftArray, int[] rightArray) {
        int[] arr = new int[leftArray.length + rightArray.length];
        System.arraycopy(leftArray, 0, arr, rightArray.length, leftArray.length);
        System.arraycopy(rightArray, 0, arr, 0, rightArray.length);

        return arr;

    }
    public static int[] innerUnion(int[] leftArray, int[] rightArray) {

        int[] arr = {};

        for (int value : leftArray) {
            if (Arrays.binarySearch(arr, value) < 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = value;
                Arrays.sort(arr);
            }
        }

        for (int value : rightArray) {
            if (Arrays.binarySearch(arr, value) < 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = value;
                Arrays.sort(arr);
            }

        }
        return arr;


    }

}