package Task11;

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
    public static Employee findByName(String name, Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (Objects.equals(name, employeesArray[i].getName())) {
                return employeesArray[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubName(String subName, Employee[] employeesArray) {
        for(int i = 0; i < employeesArray.length; i++) {
            if(subName != null && employeesArray[i].getName().contains(subName)){
                return employeesArray[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int salaryBudget(Employee[] employeesArray) {

        int salaryBudget = 0;
        for(int i = 0; i < employeesArray.length; i++) {
            salaryBudget += employeesArray[i].getSalary();
        }
        return salaryBudget;
    }

    //поиск наименьшей зарплаты в массиве
    public static int minSalary(Employee[] employeesArray) {
        int minSalary = Integer.MAX_VALUE;
        for(int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getSalary() < minSalary) {
                minSalary = employeesArray[i].getSalary();
            }
        }
        return minSalary;
    }

    //поиск наибольшей зарплаты в массиве
    public static int maxSalary(Employee[] employeesArray) {
        int maxSalary = Integer.MIN_VALUE;
        for(int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getSalary() > maxSalary) {
                maxSalary = employeesArray[i].getSalary();
            }
        }
        return maxSalary;
    }


    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minNumberOfSubordinates(Manager[] managersArray) {
        int minNumber = Integer.MAX_VALUE;
        for(int i = 0; i < managersArray.length; i++) {
            if(managersArray[i].getNumberOfSubordinates() < minNumber) {
                minNumber = managersArray[i].getNumberOfSubordinates();
            }
        }
        return minNumber;
    }


    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxNumberOfSubordinates(Manager[] managersArray) {
        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < managersArray.length; i++) {
            if(managersArray[i].getNumberOfSubordinates() > maxNumber) {
                maxNumber = managersArray[i].getNumberOfSubordinates();
            }
        }
        return maxNumber;
    }


    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static int maxSalaryIncrease(Manager[] managersArray) {

        int maxSalaryIncrease = Integer.MIN_VALUE;
        for(int i = 0; i < managersArray.length; i++) {
            if((managersArray[i].getSalary() - managersArray[i].getBaseSalary()) > maxSalaryIncrease) {
                maxSalaryIncrease = managersArray[i].getSalary() - managersArray[i].getBaseSalary();
            }
        }
        return maxSalaryIncrease;
    }


    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static int minSalaryIncrease(Manager[] managersArray) {

        int minSalaryIncrease = Integer.MAX_VALUE;
        for(int i = 0; i < managersArray.length; i++) {
            if((managersArray[i].getSalary() - managersArray[i].getBaseSalary()) < minSalaryIncrease) {
                minSalaryIncrease = managersArray[i].getSalary() - managersArray[i].getBaseSalary();
            }
        }
        return minSalaryIncrease;
    }




}
