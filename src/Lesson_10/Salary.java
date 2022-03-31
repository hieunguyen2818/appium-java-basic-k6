package Lesson_10;

public abstract class Salary {
    protected abstract int getSalary();
    protected abstract int numberOfEmployee();

    protected int salaryCal() {
        return getSalary()*numberOfEmployee();
    }
}
