package structure.adapter.baseClass;

public class Adaptor extends Adaptee implements ITarget{

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        System.out.println("");
    }

    // 不需要实现 fc()  直接用父类的
}
