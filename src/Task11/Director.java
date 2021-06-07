package Task11;

public class Director extends Manager{

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
