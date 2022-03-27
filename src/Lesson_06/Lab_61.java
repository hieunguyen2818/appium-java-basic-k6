package Lesson_06;

public class Lab_61 {
    /**
     * LAB 6.1
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     */

    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        String hourNumber = inputString.substring(0,inputString.indexOf("h"));
        String minuteNumber = inputString.substring(inputString.indexOf("d")+1,inputString.indexOf("m"));
        int minuteNumberAddition = Integer.valueOf(minuteNumber.trim());
        int minutest = Integer.valueOf(hourNumber)*60;

        System.out.println("Total minutes is: "+ (minutest+minuteNumberAddition));
    }
}
