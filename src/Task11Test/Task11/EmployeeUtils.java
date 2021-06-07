package Task11Test.Task11;

import java.util.Objects;

public class EmployeeUtils {

    private final static int MANAGER_SALARY_COEFF = 3;
    private final static int DIRECTOR_SALARY_COEFF = 9;

    //GETTERS
    public static int getManagerSalaryCoeff() {
        return MANAGER_SALARY_COEFF;
    }

    public static int getDirectorSalaryCoeff() {
        return DIRECTOR_SALARY_COEFF;
    }

    //поиск сотрудника в массиве по его имени
    public static Employee findByName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(name, employees[i].getName())) {
                return employees[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubName(String subName, Employee[] employees) {
        for(int i = 0; i < employees.length; i++) {
            if(subName != null && employees[i].getName().contains(subName)){
                return employees[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int salaryBudget(Employee[] employees) {

        int salaryBudget = 0;
        for(int i = 0; i < employees.length; i++) {
            salaryBudget += employees[i].getSalary();
        }
        return salaryBudget;
    }

    //поиск наименьшей зарплаты в массиве
    public static int minSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    //поиск наибольшей зарплаты в массиве
    public static int maxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }


    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minNumberOfSubordinates(Employee[] employees) {
        int minNumber = Integer.MAX_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getNumberOfSubordinates() < minNumber) {
                minNumber = employees[i].getNumberOfSubordinates();
            }
        }
        return minNumber;
    }


    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxNumberOfSubordinates(Employee[] employees) {
        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getNumberOfSubordinates() > maxNumber) {
                maxNumber = employees[i].getNumberOfSubordinates();
            }
        }
        return maxNumber;
    }


    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static int maxSalaryIncrease(Employee[] employees) {

        int maxSalaryIncrease = Integer.MIN_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if((employees[i].getSalary() - employees[i].getBaseSalary()) > maxSalaryIncrease) {
                maxSalaryIncrease = employees[i].getSalary() - employees[i].getBaseSalary();
            }
        }
        return maxSalaryIncrease;
    }


    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static int minSalaryIncrease(Employee[] employees) {

        int minSalaryIncrease = Integer.MAX_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if((employees[i].getSalary() - employees[i].getBaseSalary()) < minSalaryIncrease) {
                minSalaryIncrease = employees[i].getSalary() - employees[i].getBaseSalary();
            }
        }
        return minSalaryIncrease;
    }




}
