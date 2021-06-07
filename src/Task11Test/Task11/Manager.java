package Task11Test.Task11;

public final class Manager extends Employee {



    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }



    @Override
    public int getSalary() {
        if (super.getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return (int) (getBaseSalary() + (getBaseSalary() * getNumberOfSubordinates() / 100.0 * EmployeeUtils.getManagerSalaryCoeff()));
        }
    }




}
