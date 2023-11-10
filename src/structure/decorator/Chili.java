package structure.decorator;

public class Chili extends IngredientsFoot{


    public Chili(Foot foot) {
        super(foot, "辣椒", 3.00);
    }

    @Override
    public double cost() {
        return getFoot().cost() + getPrice();
    }

    @Override
    public String getName() {
        return super.getName() + getFoot().getName();
    }
}
