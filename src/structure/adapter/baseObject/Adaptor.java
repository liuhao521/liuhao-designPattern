package structure.adapter.baseObject;

public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        System.out.println("");
    }

    @Override
    public void fc() {
        adaptee.fc();
    }

}
