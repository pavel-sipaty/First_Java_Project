package Task11;

public class Manager extends Employee {

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return (int) (getBaseSalary() + (getBaseSalary() * getNumberOfSubordinates() / 100.0 * EmployeeUtils.getManagerSalaryCoeff()));
        }
    }




}
