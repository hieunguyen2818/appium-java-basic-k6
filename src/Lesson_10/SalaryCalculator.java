package Lesson_10;

public class SalaryCalculator {
    public static void main(String[] args) {
        Salary fte = new FTE();
        Salary contractor = new Contractor();

        System.out.println("Company Salary is: "+ (fte.salaryCal()+contractor.salaryCal()));
    }
}
