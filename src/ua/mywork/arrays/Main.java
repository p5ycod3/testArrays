package ua.mywork.arrays;

public class Main {

    public static void main(String []args) {

        int[] leftArray = new int[] {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[] {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] newArray = new int[leftArray.length + rightArray.length];

        System.arraycopy(leftArray, 0, newArray, 0, leftArray.length);
        System.arraycopy(rightArray, 0, newArray, leftArray.length, rightArray.length);

        // prints 1, 2, 3, 4, 5 on sep. lines
        for(int x : newArray) {
            System.out.println(x);
        }
    }
}
