package structure.decorator;

public class Beef extends Foot{

    public Beef() {
        super("牛肉",12.0);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
