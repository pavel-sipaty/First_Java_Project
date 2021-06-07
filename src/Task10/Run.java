package Task10;

import java.util.Arrays;

public class Run {


    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Pasha", 5);

        Manager manager = new Manager("Den", 10, 15);

        System.out.println(manager.getSalary(MonthUtils.Q1));







    }
}
