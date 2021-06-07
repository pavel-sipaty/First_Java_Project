package Task11Test.Task11;

public class Worker extends Employee {

    public Worker(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary();
    }




}
