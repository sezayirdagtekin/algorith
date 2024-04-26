package com.array.rotate;

public class TwoArrayRotation {
    public static void main(String[] args) {

       // Check if given arrays are rotations of each other or not

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2) should return true.
        int[] array2 = {4, 5, 6, 7, 1, 2, 3};
        System.out.println( isRotation(array1,array2));

    }


    //Solution: O(n) linear complexity
    public static boolean isRotation(int[] array1, int[] array2) {
        int size = array1.length;
        if (size != array2.length) {
            throw new UnsupportedOperationException("Two arrays must be equal!");
        }
        int firstElement = array1[0];
        int indexFound = array2[firstElement]-1;

        for (int i = 0; i < size; i++) {
            if (array1[i]!=array2[(indexFound +i) % size]){
                return false;
            };
        }
        return true;
    }
}
