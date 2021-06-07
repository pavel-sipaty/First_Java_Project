package Task11Test.Task11;

public final class Director extends Employee {

    public Director(String name, int baseSalary, int numberOfSubordinates) {

        super(name, baseSalary, numberOfSubordinates);
    }



    @Override
    public int getSalary() {
        if(getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }else {
            return (int)(getBaseSalary() + (getBaseSalary() * getNumberOfSubordinates() /100.0 * EmployeeUtils.getDirectorSalaryCoeff()));
        }



    }

}
