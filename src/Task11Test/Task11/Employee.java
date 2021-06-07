package Task11Test.Task11;

public abstract class Employee {

    private String name;
    private int baseSalary;
    private int numberOfSubordinates;



    public Employee(String name, int baseSalary, int numberOfSubordinates) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSalary();

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
