package structure.decorator;

public abstract class IngredientsFoot extends Foot{

    private Foot foot;

    public IngredientsFoot(Foot foot,String name,double price) {
        super(name,price);
        this.foot = foot;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }


}
