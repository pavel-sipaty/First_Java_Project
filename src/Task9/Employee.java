package Task9;

public class Employee {

    Person person = new Person();
    double salary;

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

//    public boolean isSaneName(Task9.Employee employee) {
//        return Objects.equals(employee.person.name, this.person.name);
//
//    }


}
