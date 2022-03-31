package Lesson_08;

import java.util.Scanner;

public class Lab_81 {
    /**
     * LAB 8.1
     * Create a class Employee with a method salary to return employee’s salary
     * There are 2 types of employee: Full time employee and contract employee
     * Full time employee has salary is 50000 and contract employee has salary 40000
     * Write a method to accept a list of Employee and calculate total salary
     * For example, company has 3 FTE and 2 contractor
     */
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input number of fullTime Employee: ");
        int fteNum = sc.nextInt();
        System.out.println("Please input number of contract Employee: ");
        int contractNum = sc.nextInt();

        int Salary = employee.calculateCompanySalary( fteNum,  contractNum);
        System.out.println("Your Company Salary Amount: "+Salary);
    }
}
