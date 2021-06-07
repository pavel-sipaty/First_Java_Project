package Task11Test.Task11;

public class Run {

    public static void main(String[] args) {
        Worker worker = new Worker("Ivan", 100, 0);
        Manager manager = new Manager("Sergey", 500, 4);
        Director director = new Director("Pavel", 1000, 10);
        //Manager managerTest = new Manager("Gosha", 300, 7);
        //Manager managerTest2 = new Manager("Sasha", 300, 3);
        //Manager managerTest3 = new Manager("Dima", 300, 7);


        Employee employee1 = worker;
        Employee employee2 = manager;
        Employee employee3 = director;
        Employee[] employees = new Employee[] {employee1, employee2, employee3};



//        Manager manager1 = manager;
//        Manager manager2 = director;
//        Manager manager3 = managerTest;
//        Manager manager4 = managerTest2;
//        Manager manager5 = managerTest3;
//        Manager[] managersArray = new Manager[] {manager1, manager3, manager4, manager5};

        System.out.println("Зарплата рабочего: " + worker.getSalary());
        System.out.println("Зарплата Manager: " + manager.getSalary());
        System.out.println("Зарплата Director: " + director.getSalary());
//        System.out.println("Зарплата ManagerTest: " + managerTest.getSalary());
//        System.out.println("Зарплата ManagerTest2: " + managerTest2.getSalary());
//        System.out.println("Зарплата ManagerTest3: " + managerTest3.getSalary());
        System.out.println("-----------------------");
        System.out.println("Зарплатный бюджет: " + EmployeeUtils.salaryBudget(employees));
        System.out.println("Минимальная з/п: " + EmployeeUtils.minSalary(employees));
        System.out.println("Максимальная з/п: " + EmployeeUtils.maxSalary(employees));
        System.out.println("Минимальное кол-во подчиненных: " + EmployeeUtils.minNumberOfSubordinates(employees));
        System.out.println("Максимальное кол-во подчиненных: " + EmployeeUtils.maxNumberOfSubordinates(employees));
        System.out.println("Максимальная надбавка у менеджеров: " + EmployeeUtils.maxSalaryIncrease(employees));
        System.out.println("Минимальная надбавка у менеджеров: " + EmployeeUtils.minSalaryIncrease(employees));

    }






}
