package Lesson_06;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_63 {
    /**
     * LAB 6.3
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
     */
    public static void main(String[] args) {
        System.out.println("Please inputString! ");
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();

        char [] characterArr  = myStr.toCharArray();
        ArrayList<Character> outputNumber = new ArrayList<>();
        for (char character:characterArr) {
            if(Character.isDigit(character)) {
               outputNumber.add(character);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character character: outputNumber) {
            stringBuilder.append(character.toString());
        }
        System.out.println("The number in this text is: "+stringBuilder);
    }
}
