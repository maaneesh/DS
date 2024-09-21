package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysExercise {
    public static void calculateAverage(int[] array) {
        System.out.println("1. Calculate average ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        System.out.println("The average is: " + avg);
    }

    public static void arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(arr[i] + " is in the array");
            }
        }
        System.out.println("unable to find the value in array");

    }

    public static void findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i + " is the index.");
            }
        }
    }

    public static void removeElement(int[] arr, int num) {
        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void MaxandMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findDuplicateValues(int[] arr) {
        System.out.println("7. Find duplicate values in the array");
        System.out.print("Duplicate values: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void findDuplicateStringValues(String[] arr) {
        System.out.println("8. Find duplicate values in the array");
        System.out.print("Duplicate values: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void findCommonElements(String[] arr1, String[] arr2) {
        System.out.println("9. Find common elements between two arrays");
        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    public static void removeDuplicate(String[] arr) {
        System.out.println("10. Remove duplicate values in the array");
        System.out.print("Duplicate values: ");

        Set<String> newSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!newSet.contains(arr[i])) {
                newSet.add(String.valueOf(arr[i]));
            }
        }
        for (String s : newSet) {
            System.out.print(s + " ");
        }
    }

    public static void secondMax(int[] array) {
        System.out.println("11. Second max");
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int val : array) {
            if (val > max) {
                secondMax = max;
                max = val;
            } else if (val > secondMax && val != max) {
                secondMax = val;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There's no second max " + max);
        } else System.out.println("The second max is " + secondMax);
    }

    public static void secondMin(int[] array) {
        System.out.println("12. Second min");
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int val : array) {
            if (val < min) {
                secondMin = min;
                min = val;
            } else if (val < secondMin && val != min) {
                secondMin = val;

            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There's no second min " + min);
        } else System.out.println("The second max is " + secondMin);

    }

    public static void separateEvenandOdd(int[] arr) {
        System.out.println("13. Separate even and odd elements");
        int evenCount = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                evenCount++;
            }
        }
        //create new arrays for even and odd
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[arr.length - evenCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                evenArr[evenIndex++] = val;
            } else {
                oddArr[oddIndex++] = val;
            }
        }
        System.out.print("NewArray: ");
        for (int val : evenArr) {
            System.out.print(val + " ");
        }
        for (int val : oddArr) {
            System.out.print(val + " ");
        }


    }

    public static void findKLargest(int[] arr, int k) {
        System.out.println("14. Find k largest elements");

        if (k > arr.length) {
            System.out.println("k shouldn't exceed the number of elements in array");
            return;
        }
        Arrays.sort(arr);
        System.out.print(k + " largest elements are: ");
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void findKSmallest(int[] arr, int k) {
        System.out.println("15. Find k smallest elements");
        if (k > arr.length) {
            System.out.println("k shouldn't exceed the number of elements in array");
            return;
        }
        Arrays.sort(arr);
        System.out.print(k + " smallest elements are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(int[] arr, String name) {
        System.out.println(name);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(" ");
    }

    public static void swapArrays(int[] arr1, int[] arr2) {
        System.out.println("16. Swap arrays");
        System.out.println("Before swap:");
        printArray(arr1, "Array1: ");

        printArray(arr2, "Array2: ");

        int length = arr2.length;
        int[] tempArr = new int[length];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            tempArr[idx] = arr2[i];
            arr2[i] = arr1[i];
            arr1[i] = tempArr[idx];
            idx++;

        }

        System.out.println("\nAfter swap:");
        printArray(arr1, "Array1: ");

        printArray(arr2, "Array2: ");
    }

    public static void swapVals(int[] arr, int idx1, int idx2) {
        System.out.println("17. Swap vals");

        System.out.println("Before swap:");
        printArray(arr, "My array: ");
        if (idx1 < 0 || idx1 >= arr.length || idx2 < 0 || idx2 >= arr.length) {
            return;
        }

        if (idx1 == idx2) {
            System.out.println("indexes are equal no swap needed");
            return;
        }
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        System.out.println("After swap:");
        printArray(arr, "My array: ");


    }

    public static void copyArray(int[] arr) {
        System.out.println("18. Copy array");
        System.out.println("Before copy:");
        printArray(arr, "Array1: ");
        int[] copyArr = new int[arr.length];
        int idx = 0;
        for (int val : arr) {
            copyArr[idx++] = val;
        }
        System.out.println("After copy:");
        printArray(copyArr, "ArrayCopy: ");

    }

    public static void elementFrequency(int[] arr) {
        System.out.println("19. Element frequency");
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int val : arr) {
            if (freqMap.containsKey(val)) {
                freqMap.put(val, freqMap.get(val) + 1);
            } else {
                freqMap.put(val, 1);
            }

        }
        System.out.println("frequency:");

        for (int val : freqMap.keySet()) {
            System.out.println(val + " " + freqMap.get(val));
        }


    }

    public static void printReverse(int[] arr) {
        System.out.println("20. Print array in reverse");
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void printEvenPosition(int[] arr) {
        System.out.println("21. Print elements in even position");
        if (arr == null || arr.length == 0) {
            System.out.println("No elements in array");
            return;

        }
        System.out.println("Elements at even position");
        for (int i = 0; i <arr.length ; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();

    }
    public static void printOddPosition(int[] arr) {
        System.out.println("22. Print elements in odd position");
        if (arr == null || arr.length == 0) {
            System.out.println("No elements in array");
            return;

        }
        System.out.println("Elements at odd position");
        for (int i = 0; i <arr.length ; i++) {
            if (i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();

    }

    public static void main(String[] args) {
        //1. calculateAverage(new int[]{1,2,3,4,5});
        int[] arr1 = {10, 20, 30, 40, 40, 60, 30, 9, 9, 9, 9, 9, 9, 9, 9, 9999, 99, 9, 9999, 9, 9950, 60, 70, 44, 60};
        int[] arr2 = {11, 23, 31, 73, 77, 45, 55, 11, 69};
        String[] arr3 = {"Apple", "Apple", "Bicycle", "Cat", "Dog", "Eggs", "Eggs", "Fox", "Fox", "Kite", "Kite"};
        String[] arr4 = {"Apple", "Box", "Dog", "Elephant", "Flower", "Eggs", "King", "Kiss"};

        // arrayContains(arr1, 100);
        // findIndex(arr1, 55);
        // removeElement(arr1, 53);
        // MaxandMin(arr1);
        //  reverseArray(arr1);
//        findDuplicateValues(arr1);
//        findDuplicateStringValues(arr2);
//        findCommonElements(arr2, arr3);

        //    removeDuplicate(arr3);
        // secondMax(arr1);
        // secondMin(arr1);
        //  separateEvenandOdd(arr1);
        // findKLargest(arr1, 3);
        // findKSmallest(arr1, 3);
        // swapVals(arr1, 1, 7);
        // copyArray(arr1);
        // elementFrequency(arr1);
       // printReverse(arr2);
       // printEvenPosition(arr2);
        printEvenPosition(arr2);
        printOddPosition(arr2);


    }
}
