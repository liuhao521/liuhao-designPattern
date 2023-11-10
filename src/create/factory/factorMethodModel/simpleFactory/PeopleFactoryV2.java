package create.factory.factorMethodModel.simpleFactory;

import designPattern.create.factory.BlackPeople;
import designPattern.create.factory.People;
import designPattern.create.factory.WhitePeople;
import designPattern.create.factory.YellowPeople;

import java.util.HashMap;

/**
 * 简单工厂 第二种版本
 * 适用于生产的对象可以重复使用，类似单列
 */
public class PeopleFactoryV2 {

    private static final HashMap<String,People> peoples = new HashMap<>();

    static {
        peoples.put("white",new WhitePeople());
        peoples.put("yellow",new YellowPeople());
        peoples.put("black",new BlackPeople());
    }

    public static People createPeople(String type) throws Exception {
        People people = peoples.get(type);
        if (people == null){
            throw new Exception("");
        }
        return people;
    }
}
