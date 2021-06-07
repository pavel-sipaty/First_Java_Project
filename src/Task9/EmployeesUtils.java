package Task9;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class EmployeesUtils {

    public static Employee findByName(String name, Employee @NotNull [] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(name, employees[i].person.name)) {
                return employees[i];
            }
        }
        return null;
    }

    public static Employee findBySubName(String subName, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].person.name != null && employees[i].person.name.contains(subName)) {
                return employees[i];
            }
        }
        return null;
    }

    public static boolean employeeExist(Employee employee, Employee[] employees) {
        boolean employeeExits = false;

        for(int i = 0; i < employees.length; i++) {
            if(employee == employees[i]) {
                employeeExits = true;
            }
        }
        return employeeExits;
    }

    public static double minSalary(Employee[] employees) {
        double min = Double.MAX_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].salary < min) {
                min = employees[i].salary;
            }
        }
        return min;
    }

    public static double maxSalary(Employee[] employees) {
        double max = Double.MIN_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].salary > max) {
                max = employees[i].salary;
            }
        }
        return max;
    }

    public static void printEmployee(Employee employee) {

        System.out.println(employee.person.getName() + " " + employee.getSalary());
    }



}
