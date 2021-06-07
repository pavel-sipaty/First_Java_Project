package Task10;

public final class Employee extends BaseEmployee{


    public Employee(String name, int salaryPerDay) {
        super(name, salaryPerDay);
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int sum = 0;
        for(int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getMonthWorkingDays() * getSalaryPerDay();
        }
        return sum;
    }
}
