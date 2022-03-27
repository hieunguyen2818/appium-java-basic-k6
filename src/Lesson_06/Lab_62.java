package Lesson_06;

import java.util.Scanner;

public class Lab_62 {
    /**
     * LAB 6.2
     * String myPassword = "password123";
     * Allow user to input maximum 3 times
     */

    public static void main(String[] args) {
        String myPassword = "password123";
        final int MAX_INPUT_TIMES = 3;
        int inputTimes = 0;
        boolean isPasswordCorrect = false;
        String inputPassword;

        while (!isPasswordCorrect && inputTimes < MAX_INPUT_TIMES) {
            System.out.println("Please input your password: ");
            Scanner scanner = new Scanner(System.in);
            inputPassword = scanner.nextLine();
            if(inputPassword.equals(myPassword)) {
                System.out.println("Hooray!");
                isPasswordCorrect = true;
            } else {
                System.out.println("Incorrect Password ");
                inputTimes++;}
            System.out.println("You have input 3 times! ");
        }

    }

}
