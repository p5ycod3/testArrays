package ua.mywork.arrays;


import java.util.Arrays;

public class ArraysUnion {

    public static int[] merge(int[] leftArray, int[] rightArray);

    {

        int[] arr = {};

        for (
                int count
                : leftArray)

        {
            if (Arrays.binarySearch(arr, count) < 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = count;
                Arrays.sort(arr);


            }
            for (
                    int count
                    : rightArray)

            {
                if (Arrays.binarySearch(arr, count) < 0) {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = count;
                    Arrays.sort(arr);
                }

            }
            return arr;
        }

        public static int[] union ( int[] leftArray, int[] rightArray){
        int[] arr = new int[leftArray.length + rightArray.length];
        System.arraycopy(leftArray, 0, arr, rightArray.length, leftArray.length);
        System.arraycopy(rightArray, 0, arr, 0, rightArray.length);

        return arr;


    }
    }

}