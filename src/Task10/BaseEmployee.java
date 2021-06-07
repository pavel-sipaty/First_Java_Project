package Task10;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private int salaryPerDay;
    private int subordinatesAmount;

    public BaseEmployee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public BaseEmployee(String name, int salaryPerDay, int subordinatesAmount) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.subordinatesAmount = subordinatesAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSubordinatesAmount() {
        return subordinatesAmount;
    }

    public void setSubordinatesAmount(int subordinatesAmount) {
        this.subordinatesAmount = subordinatesAmount;
    }

    public abstract int getSalary(Month[] monthArray);
}
