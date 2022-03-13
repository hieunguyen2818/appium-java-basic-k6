package Lession_02;

import java.util.Scanner;

public class Lab_22 {
    /**
     * Allow user to input a number, print out it’s an odd or even number
     */
    public static void main(String[] args) {
        System.out.println("Please input a integer number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if(inputNumber%2 == 0) {
            System.out.println("it's an odd number!");
        } else {
            System.out.println("it's an even number!");
        }
    }
}
