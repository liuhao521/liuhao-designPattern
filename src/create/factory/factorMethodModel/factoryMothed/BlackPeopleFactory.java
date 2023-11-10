package create.factory.factorMethodModel.factoryMothed;


import create.factory.BlackPeople;
import create.factory.People;

public class BlackPeopleFactory implements PeopleFactory{

    @Override
    public People createPeople() {
        return new BlackPeople();
    }
}
