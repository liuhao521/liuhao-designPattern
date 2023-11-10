package create.builder;

public class People {

    protected String name;
    protected Integer age;
    protected boolean kid;

    public People(String name, Integer age, boolean kid) {
        this.name = name;
        this.age = age;
        this.kid = kid;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kid=" + kid +
                '}';
    }
}
