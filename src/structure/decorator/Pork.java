package structure.decorator;

public class Pork extends Foot{

    public Pork() {
        super("猪肉",10.0);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
