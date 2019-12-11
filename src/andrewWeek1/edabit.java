package andrewWeek1;

import java.util.Arrays;

public class edabit {

//    1. finding the largest number in an array
    public static void arrayLargest (int[] arr) {
        Arrays.sort(arr);
        int i = arr.length - 1;
        System.out.println(arr[i]);
    }

//    reverse a string
    public static void reverseString (String split) {
        char[] reverse = split.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.println(reverse[i]);
        }

//        StringBuilder split1 = new StringBuilder();
//        split1.append(split);
//        split1.reverse();
//        System.out.println(split1);
    }

    public static void main(String[] args) {

        //    1. finding the largest number in an array test
        int[] findTheLargest = {1,2,3,4,5,6,7,8,9,-1,-3,16,-27};
        arrayLargest(findTheLargest);

        //    reverse a string
        reverseString("hello");

    }

}
