package structure.combination;

public class Employee extends HumanResource{


    public Employee(String id,double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }
}
