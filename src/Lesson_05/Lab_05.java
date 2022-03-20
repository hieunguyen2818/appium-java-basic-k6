package Lesson_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab_05 {
    /**
     * Allow user to input student name and id
     * Find by using ID
     * Create a simple menu
     * 1. Input student info
     * 2. Find Student by ID
     * 0. Exit!
     * Option 01...
     * Student Name:
     * Student ID:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> student = new HashMap<>();
        student.put(1001,"Neo");
        student.put(1002,"Jack");
        student.put(1003,"Lan");
        student.put(1004,"Minh");
        student.put(1008,"Tian");

        System.out.println("Welcome to student-information-system: Please select your choice");
        int optionNumber = scanner.nextInt();
        switch (optionNumber) {
            case 1:
                System.out.println("Please input student name:");
                String studentName = scanner.next();
                System.out.println("Please input student id:");
                int studentId = scanner.nextInt();
                student.put(studentId,studentName);
                System.out.println(student);
                break;
            case 2:
                System.out.println("Please input student id:");
                Integer Id = scanner.nextInt();
                Set <Integer> list = student.keySet();
                for(Integer key: list) {
                    if(list.contains(Id)) {
                        System.out.println(student.get(Id));
                        break;
                    }else {
                        System.out.println("Student Id does not exist!");
                        break;
                    }
                }
                break;
            case 0:
                System.out.println("exit!");
                break;
            default:
                System.out.println("Input incorrect Number, Please try again! ");
        }
    }
}
