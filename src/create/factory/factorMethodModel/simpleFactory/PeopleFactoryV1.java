package create.factory.factorMethodModel.simpleFactory;

import designPattern.create.factory.BlackPeople;
import designPattern.create.factory.People;
import designPattern.create.factory.WhitePeople;
import designPattern.create.factory.YellowPeople;

/**
 * 简单工厂 第一种版本
 */
public class PeopleFactoryV1 {

    public static People createPeople(String type) throws Exception {
        People people = null;
        if ("white".equals(type)){
            people = new WhitePeople();
        }else if("yellow".equals(type)){
            people = new YellowPeople();
        }else if ("black".equals(type)){
            people = new BlackPeople();
        }else{
            throw new Exception("");
        }
        return people;
    }
}
