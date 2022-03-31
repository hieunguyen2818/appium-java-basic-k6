package Lesson_10;

public class FTE extends Salary{
    @Override
    protected int getSalary() {
        return 50000;
    }

    @Override
    protected int numberOfEmployee() {
        return 2;
    }
}
