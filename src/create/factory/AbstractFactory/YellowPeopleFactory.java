package create.factory.AbstractFactory;


import create.factory.ManPeople;
import create.factory.WomenPeople;

public class YellowPeopleFactory implements PeopleFactory {
    @Override
    public ManPeople createManPeople() {
        return null;
    }

    @Override
    public WomenPeople createWomenPeople() {
        return null;
    }
}
