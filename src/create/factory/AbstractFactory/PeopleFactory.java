package create.factory.AbstractFactory;

import create.factory.ManPeople;
import create.factory.WomenPeople;

public interface PeopleFactory {

    ManPeople createManPeople();

    WomenPeople createWomenPeople();
}
