package Lesson_03;

public class Lab_32 {
    /**
     * Finding maximum value/minimum value from an integer array
     *
     * int[] intArr = {1, 2, 3, 4, 5};
     *
     * Minimum: 1
     * Maximum: 5
     */

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int minNumber = intArr[0];
        int maxNumber = intArr[0];
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] <minNumber) {
                    minNumber = intArr[i];
            } else maxNumber = intArr[i];
    }
        System.out.println("minNumber is: "+minNumber);
        System.out.println("maxNumber is: "+maxNumber);
    }
}
