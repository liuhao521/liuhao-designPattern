package structure.combination;

public abstract class HumanResource {

    protected String id;
    protected Double salary;

    public HumanResource(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract double calculateSalary();
}
