package Lesson_02;

import java.util.Scanner;

public class Lab_21 {
    /**
     * Lab 2.1:
     * Get input from user about height(m) and weight(kg) then calculate BMI
     * Underweight = <18.5
     * Normal weight = 18.5 – 24.9
     * Overweight = 25–29.9
     * Obesity = BMI of 30 or greater
     * BMI = weight / (height x 2)
     */

    public static void main(String[] args) {
        System.out.println("Please enter your height(m): ");
        Scanner scanner = new Scanner(System.in);
        float inputHeight = scanner.nextFloat();
        System.out.println("Please enter your weight(kg): ");
        float inputWeight = scanner.nextFloat();
        float BIM = inputWeight/(inputHeight*inputHeight);

        if(BIM <= 18.5 ) {
            System.out.println("You are Underweight!");
        } else if(BIM > 18.5 && BIM < 24.9) {
            System.out.println("You are Normal weight!");
        } else if(BIM >= 25 && BIM < 29.9) {
            System.out.println("You are Overweight!");
        } else if(BIM >= 30){
            System.out.println("You are Obesity!");
        } else {
            System.out.println("Invalid input");
        }
    }
}
