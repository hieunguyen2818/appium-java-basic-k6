package Lesson_12.Interface;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee Tuan = new Employee("A",11);
        Employee Linh = new Employee("B",10);
        Employee Hieu = new Employee("C",12);
        employeeList.add(Tuan);
        employeeList.add(Linh);
        employeeList.add(Hieu);
    }
}
