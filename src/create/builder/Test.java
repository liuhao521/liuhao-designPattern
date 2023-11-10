package create.builder;

public class Test {

    public static void main(String[] args) {
        People people = PeopleBuilder.createMaker()
                .setName("张三")
                .setAge(12)
                .setKid(true)
                .builder();
        System.out.println(people);
    }
}
