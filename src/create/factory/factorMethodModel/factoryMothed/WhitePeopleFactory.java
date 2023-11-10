package create.factory.factorMethodModel.factoryMothed;


import create.factory.People;
import create.factory.WhitePeople;

public class WhitePeopleFactory implements PeopleFactory{

    @Override
    public People createPeople() {
        return new WhitePeople();
    }
}
