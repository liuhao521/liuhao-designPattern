package structure.decorator;

public class Test {

    public static void main(String[] args) {
        Foot foot = new Pork();
        System.out.println(foot.getName() + " " + foot.cost());

        System.out.println("==================================");
        foot = new GreenOnion(foot);
        System.out.println(foot.getName() + " " + foot.cost());

        System.out.println("==================================");
        foot = new Chili(foot);
        System.out.println(foot.getName() + " " + foot.cost());


    }
}
