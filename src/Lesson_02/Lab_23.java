package Lesson_02;

import java.util.Scanner;

public class Lab_23 {
    /**
     * Get input from user about height(m) and weight(kg) then calculate BMI
     * Underweight = <18.5
     * Normal weight = 18.5 – 24.9
     * Overweight = 25–29.9
     * Obesity = BMI of 30 or greater
     * BMI = weight / (height x 2)
     * Suggest user to increase/decrease weight
     */
    public static void main(String[] args) {
        System.out.println("Please enter your height(m): ");
        Scanner scanner = new Scanner(System.in);
        float inputHeight = scanner.nextFloat();
        System.out.println("Please enter your weight(kg): ");
        float inputWeight = scanner.nextFloat();
        float BMI = inputWeight/(inputHeight*inputHeight);
        float minWeightInGood = 18.5f*inputHeight*inputHeight;
        float maxWeightInGood = 25*inputHeight*inputHeight;

        if(BMI <= 18.5 ) {
            System.out.println("You are Underweight, you should increase "+(minWeightInGood-inputWeight)+ " kg!");
            System.out.println("your best weight is at least " +minWeightInGood);
        } else if(BMI > 18.5 && BMI < 24.9) {
            System.out.println("You are Normal weight!");
        } else if(BMI >= 25 && BMI < 29.9) {
            System.out.println("You are Overweight!, you should decrease "+(inputWeight-maxWeightInGood)+ " kg!");
        } else if(BMI >= 30){
            System.out.println("You are Obesity!, you should decrease "+(inputWeight-maxWeightInGood)+ " kg!");
            System.out.println("your best weight is at least " +maxWeightInGood);
        } else {
            System.out.println("Invalid input");
        }
    }
}
