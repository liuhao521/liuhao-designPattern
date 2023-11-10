package structure.combination;

import java.util.ArrayList;

public class Department extends HumanResource{

    private List<HumanResource> sub = new ArrayList<>();

    public Department(String id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double salaryCount = 0.0;
        for (HumanResource s: sub){
            salaryCount += s.calculateSalary();
        }
        this.salary = salaryCount;
        return this.salary;
    }

    public void addSub(HumanResource sub){
        this.sub.add(sub);
    }
}
