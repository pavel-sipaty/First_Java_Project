package Task10;

public final class Manager extends BaseEmployee {


    public Manager(String name, int salaryPerDay, int subordinatesAmount) {
        super(name, salaryPerDay, subordinatesAmount);

    }


    @Override
    public int getSalary(Month[] monthArray) {
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getMonthWorkingDays() * getSalaryPerDay();
        }


        int result = (int) (sum + sum * (getSubordinatesAmount() / 100.0));

        return result;
    }
}
