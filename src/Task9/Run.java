package Task9;

public class Run {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        firstEmployee.person.setName("Oleg");
        firstEmployee.person.setSex('M');
        firstEmployee.setSalary(2700);

        Employee secondEmployee = new Employee();
        secondEmployee.person.setName("Pasha");
        secondEmployee.setSalary(562.34);

        Employee thirdEmployee = new Employee();
        thirdEmployee.person.setName("Ivan");
        thirdEmployee.setSalary(1000);

        Employee[] employees = {firstEmployee, secondEmployee, thirdEmployee};

        //System.out.println(Task9.EmployeesUtils.findByName("Dasha", employees));
        //System.out.println(Task9.EmployeesUtils.findBySubName("Sa", employees));
        System.out.println(EmployeesUtils.employeeExist(null, employees));

        //System.out.println(Task9.Salary.getSum(employees));

        EmployeesUtils.printEmployee(firstEmployee);
        EmployeesUtils.printEmployee(secondEmployee);
        EmployeesUtils.printEmployee(thirdEmployee);

        System.out.println();

        double minSalary = EmployeesUtils.minSalary(employees);
        double maxSalary = EmployeesUtils.maxSalary(employees);
        System.out.println("Минимальная з/п: " + minSalary);
        System.out.println("Максимальная з/п: " + maxSalary);







    }

}
