package create.factory.factorMethodModel.factoryMothed;

import designPattern.create.factory.People;
import designPattern.create.factory.WhitePeople;
import designPattern.create.factory.YellowPeople;

public class YellowPeopleFactory implements PeopleFactory{

    @Override
    public People createPeople() {
        return new YellowPeople();
    }
}
