package structure.decorator;

public abstract class Foot {

    private String name;
    private Double price;

    public Foot() {
    }

    public Foot(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract double cost();
}
