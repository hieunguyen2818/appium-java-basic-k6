package Lesson_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_04 {
    /**
     * Lab 4: Create a simple menu with 4 options:
     * =====MENU======
     * 1. Add number into ArrayList
     * 2. Print numbers
     * 3. Get maximum number
     * 4. Get minimum number
     * Optional: Add option number 5 to find a number -> index
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            int randomNumber = new SecureRandom().nextInt(10);
            arrayList.add(randomNumber);
        }
        System.out.println(arrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1;2;3;4 !");
        int userNumber = scanner.nextInt();
        switch (userNumber) {
            case 1:
                System.out.println("Input your number!: ");
                int inputNumber = scanner.nextInt();
                arrayList.add(inputNumber);
                System.out.println(arrayList);
                break;
            case 2:
                System.out.println("The number list now are: ");
                System.out.println(arrayList);
                break;
            case 3:
                int minNumber = arrayList.get(0);
                for(int i = 0; i< arrayList.size();i++) {
                    if(arrayList.get(i)<minNumber) {
                        minNumber = arrayList.get(i);
                    }
                }
                System.out.println("minNumber is : " + minNumber);
                break;
            case 4:
                int maxNumber = arrayList.get(0);
                for(int j = 0; j< arrayList.size();j++) {
                    if(arrayList.get(j)>maxNumber) {
                        maxNumber = arrayList.get(j);
                    }
                }
                System.out.println("maxNumber is : " + maxNumber);
                break;

            default:
                System.out.println("Please input correct number in Menu! : ");
        }
    }
}
