package Lesson_08;

public class Employee {
    private int fullTimeEmployees;
    private int contractEmployees;
    private final int FTE_SALARY = 50000;
    private final int CONTRACT_SALARY = 40000;

    public int calculateFteSalary(int fullTimeEmployees) {
        int fteSalary = fullTimeEmployees*FTE_SALARY;
        return fteSalary;
    }

    public int calculateContractSalary(int contractEmployees) {
        int contractSalary = contractEmployees*CONTRACT_SALARY;
        return contractSalary;
    }

    public int calculateCompanySalary(int fullTimeEmployees, int contractEmployees) {
        return calculateContractSalary(contractEmployees)+calculateFteSalary(fullTimeEmployees);
    }

}
