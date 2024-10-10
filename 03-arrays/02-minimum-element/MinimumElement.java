// Write a method called readInteger() that has no parameters and returns an int.

// It needs to read in an integer from the user - this represents how many elements the user needs to enter.


// Write another method called readElements() that has one parameter of type int

// The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.


// And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.


// The scenario is:

// 1. readInteger() is called.

// 2. The number returned by readInteger() is then used to call readElements().

// 3. The array returned from readElements() is used to call findMin().

// 4. findMin() returns the minimum number.

// [Do not try and implement this. It is to give you an idea of how the methods will be used]

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    
    private static int[] readElements(int elements) {
        int[] arr = new int[elements];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    } 
    
    private static int findMin(int[] arr) {
       int min = arr[0];
       for(int i=0; i<arr.length; i++) {
           if(arr[i]<min) min = arr[i];
       }
       return min;
    }
}