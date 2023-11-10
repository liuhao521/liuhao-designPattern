package structure.decorator;

public class GreenOnion extends IngredientsFoot{


    public GreenOnion(Foot foot) {
        super(foot, "大葱", 2.00);
    }

    @Override
    public double cost() {
        return getFoot().cost() + getPrice();
    }

    @Override
    public String getName() {
        return super.getName() + getFoot().getName() ;
    }
}
