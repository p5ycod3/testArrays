package ua.mywork.arrays;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] leftArray = new int[]{1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        try {
            int[] newArray = ArraysUnion.merge(null, rightArray);
        } catch (MyException ex) {}

        //int[] newUnionArray = ArraysUnion.union(leftArray, rightArray);


        System.out.println("Левый массив: " + Arrays.toString(leftArray));
        System.out.println("Правый массив: " + Arrays.toString(rightArray));
        System.out.println("Объединенный массив: " + Arrays.toString(newArray));

        System.out.println("Массив с общими элементами:" + Arrays.toString(newUnionArray));

    }
}

/*
package ua.mywork.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        System.out.println("hELLO WORLD"+ Arrays.toString(args));
*/