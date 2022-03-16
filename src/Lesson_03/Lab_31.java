package Lesson_03;

public class Lab_31 {
    /**
     * Lab 3.1:
     * Count how many odd, even number(s) in an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Even numders: 2
     * Odd numbers: 3
     */
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9,15,17,19,21,25};
         int evenNum = 0;
         int oddNum = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNum = evenNum + 1;
            } else oddNum = oddNum + 1;
        }
        System.out.println("Number of Even number in Array is: " + evenNum);
        System.out.println("Number of Odd number in Array is: " + oddNum);
    }
}
