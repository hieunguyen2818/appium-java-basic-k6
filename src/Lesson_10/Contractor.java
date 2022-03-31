package Lesson_10;

public class Contractor extends Salary{
    @Override
    protected int getSalary() {
        return 40000;
    }

    @Override
    protected int numberOfEmployee() {
        return 5;
    }
}
