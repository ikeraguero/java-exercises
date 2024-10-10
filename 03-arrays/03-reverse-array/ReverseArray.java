// Write a method called reverse() with an int array as a parameter.

// The method should not return any value. In other words, the method is allowed to modify the array parameter.


// To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

// For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].


// The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

// and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

import java.util.Arrays;

public class ReverseArray {
    
    
   private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            newArr[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed Array = " + Arrays.toString(newArr));
    }
}